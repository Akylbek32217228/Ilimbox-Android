package ilimboxAndroid.ilimbox.adapters.classNumberRecycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ilimboxAndroid.ilimbox.databinding.RowClassNumberBinding

class ClassNumberAdapter(var currentClass : Int, val classList : List<Int>, val width : Int, val height : Int , private val onSelect : (Int, Int) -> Unit) : RecyclerView.Adapter<ClassNumberViewHolder>() {

    var mList = arrayListOf<Int>()

    fun setList(list : ArrayList<Int>) {
        mList.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassNumberViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RowClassNumberBinding.inflate(inflater, parent, false)
        return ClassNumberViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ClassNumberViewHolder, position: Int) {
        holder.bind(currentClass, position, classList[position], width, height,  onSelect)
    }

    override fun getItemCount(): Int {
        return classList.size
    }

    fun setCurrentClassNumber(num : Int) {
        currentClass = num
        notifyDataSetChanged()
    }
}