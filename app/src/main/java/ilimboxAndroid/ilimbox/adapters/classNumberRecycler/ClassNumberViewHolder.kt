package ilimboxAndroid.ilimbox.adapters.classNumberRecycler

import android.graphics.Color
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import ilimboxAndroid.ilimbox.databinding.RowClassNumberBinding

class ClassNumberViewHolder(val binding : RowClassNumberBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(currentClass : Int, pos : Int, number : Int , width : Int, height : Int, onSelect : (Int,Int) -> Unit) {
        if(number == 0) {
            binding.number.setText(" ")
        } else {
            binding.number.setText(number.toString())
            if(currentClass == number) {
                binding.number.setTextColor(Color.RED)
            } else {
                binding.number.setTextColor(Color.BLACK)
            }
        }

        Log.d("ololo", "Width = " + width)
        binding.rowNumberConstraint.layoutParams.width = width/3
        //binding.rowNumberConstraint.layoutParams.height = height/3
        binding.rowNumberConstraint.setOnClickListener(View.OnClickListener {

            onSelect(pos, number)

        })
    }

}