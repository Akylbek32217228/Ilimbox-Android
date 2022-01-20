package ilimboxAndroid.ilimbox.fragments

import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.AdapterView.OnItemClickListener
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import ilimboxAndroid.ilimbox.R
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.row_more_options.view.*
import java.util.*

class MoreOptionsFragment : BottomSheetDialogFragment() {
    private lateinit var viewModel: OptionsViewModel
    private lateinit var header: String
    private lateinit var options: ArrayList<Option>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val args = arguments
        if (args != null) {
            header = args.getString("header") ?: ""
            options = args.getParcelableArrayList("options") ?: arrayListOf()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_more_options, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // obtain the view model
        viewModel = ViewModelProvider(requireActivity()).get(OptionsViewModel::class.java)
        if (header.compareTo("") != 0) {
            (view.findViewById<View>(R.id.more_options_header) as TextView).text = header
        }

        // create the list
        val listView = view.findViewById<ListView>(R.id.more_options_list)
        val arrayAdapter: ArrayAdapter<String> = object : ArrayAdapter<String>(requireActivity(),
                R.layout.row_more_options
        ){
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val vh: OptionViewHolder
                val outView = if (convertView == null) {
                    val inflater = requireActivity()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
                    val v = inflater.inflate(R.layout.row_more_options, parent, false)
                    vh = OptionViewHolder(
                            v.more_options_text,
                            v.more_options_icon
                    )
                    v.tag = vh
                    v
                } else {
                    vh = convertView.tag as OptionViewHolder
                    convertView
                }

                // Bind row
                val option = options[position]
                vh.text.text = option.optionText
                if (option.drawableIcon != 0) {
                    vh.icon.setImageResource(option.drawableIcon)
                    vh.icon.visibility = View.VISIBLE
                }
                return outView
            }
        }

        for (option in options) {
            arrayAdapter.add(option.optionText)
        }
        listView.adapter = arrayAdapter
        listView.onItemClickListener = OnItemClickListener { _: AdapterView<*>?, _: View?,
                                                             position: Int, _: Long ->
            viewModel.setSelection(options[position])
            dismiss()
        }
    }

    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        // Remove all observers when being dismissed so that they
        // aren't invoked the next time the Fragment is created
        viewModel.selection.removeObservers(requireActivity())
        viewModel.clearSelection()
    }


    @Parcelize
    class Option(
        val id: Int,
        val optionText: String?,
        val drawableIcon: Int,
    ) : Parcelable

    class OptionsViewModel : ViewModel() {
        private var _selection  = MutableLiveData<Option?>()
        val selection: LiveData<Option?>
            get() = _selection

        fun setSelection(option: Option?) {
            _selection.value = option
        }

        fun clearSelection() {
            _selection.value = null
        }
    }

    internal data class OptionViewHolder(
           var text: TextView,
           var icon: ImageView
    )

    companion object {
        @JvmStatic
        fun newInstance(header: String, options: ArrayList<Option>): MoreOptionsFragment {
            val args = Bundle()
            args.putString("header", header)
            args.putParcelableArrayList("options", options)
            val fragment = MoreOptionsFragment()
            fragment.arguments = args
            return fragment
        }
    }
}