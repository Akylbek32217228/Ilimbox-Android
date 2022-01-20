package ilimboxAndroid.ilimbox.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import ilimboxAndroid.ilimbox.adapters.classNumberRecycler.ClassNumberAdapter
import ilimboxAndroid.ilimbox.databinding.FragmentClassNumberBinding
import ilimboxAndroid.ilimbox.utils.CustomLinearLayoutManager


// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ClassNumberFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    lateinit private var adapter : ClassNumberAdapter


    private var _binding : FragmentClassNumberBinding? = null
    private val binding get() = _binding!!
    private var currentClass = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        Log.d("ololo", " Fragment created")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentClassNumberBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.relativeLayout.post {
            initRecycler()
        }

    }



    private fun initRecycler() {
        var llm = object : CustomLinearLayoutManager(context){
            override fun canScrollVertically(): Boolean { return false }
            override fun canScrollHorizontally(): Boolean {
                return false
            }
        }

        llm.orientation = LinearLayoutManager.HORIZONTAL


        val classList = arrayListOf(0,8,9,10,11,0)
        currentClass = 8
        Log.d("ololo", classList.toString())
        for(it in classList) {
            Log.d("ololo", "it = " + it)
        }
        adapter = ClassNumberAdapter(currentClass, classList, binding.relativeLayout.width, binding.relativeLayout.height) { pos, number ->
            Log.d("ololo", "Pos = " + pos)
            if(number == 0) {

            } else {
                if(currentClass < number) {
                    currentClass = number
                    llm.setScrollEnabled(true)
                    binding.recyclerViewClassNumber.scrollToPosition(pos + 1)
                    Log.d("ololo", "Pos + 1 = " + (pos + 1))
                    Log.d("ololo", "Current number = " + number)
                    adapter.setCurrentClassNumber(currentClass)
                    mListener.setCourses(number)

                } else if(currentClass > number) {
                    llm.setScrollEnabled(true)
                    currentClass = number
                    binding.recyclerViewClassNumber.scrollToPosition(pos - 1)
                    Log.d("ololo", "Pos - 1 = " + (pos - 1))
                    Log.d("ololo", "Current number = " + number)
                    adapter.setCurrentClassNumber(currentClass)
                    mListener.setCourses(number)

                } else {

                }
            }
            llm.setScrollEnabled(false)
        }




        binding.recyclerViewClassNumber.layoutManager = llm
        binding.recyclerViewClassNumber.adapter = adapter

    }




    companion object {

        lateinit var mListener : ClassNumberInterface

        @JvmStatic
        fun newInstance(listener : ClassNumberInterface) =
            ClassNumberFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                    mListener = listener
                }
            }
    }
}