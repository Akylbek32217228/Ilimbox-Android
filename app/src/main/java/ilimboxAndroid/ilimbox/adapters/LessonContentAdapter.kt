package ilimboxAndroid.ilimbox.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ilimboxAndroid.ilimbox.databinding.RowLessonContentBinding
import ilimboxAndroid.ilimbox.utils.LogClass

class LessonContentAdapter(private val onSelect : (LessonContentViewHolder?) -> Unit) : RecyclerView.Adapter<LessonContentViewHolder>() {

    val list = mutableListOf<Pair<String, String>>()

    fun setList(pairList : List<Pair<String, String>>) {
        list.clear()
        list.addAll(pairList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonContentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RowLessonContentBinding.inflate(inflater, parent, false)
        return LessonContentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LessonContentViewHolder, position: Int) {
        val currentItem = list[position]
        if(currentItem.first.equals("image")) {
            holder.binding.imageViewLessonContent.visibility = View.VISIBLE
            holder.binding.webViewLessonContent.visibility = View.INVISIBLE
        } else if (currentItem.first.equals("h5p")) {
            holder.binding.webViewLessonContent.visibility = View.VISIBLE
            holder.binding.imageViewLessonContent.visibility = View.INVISIBLE
            //val h5pString = "<div class=\"h5p-placeholder\" contenteditable=\"false\"><iframe src=\"https://ilimbox.kg/h5p/embed.php?url=" + holder.encodeToHtml(currentItem.second) + "\" class=\"h5p-iframe\" name=\"h5pcontent\" style=\"height:230px; width: 100%; border: 0;\" allowfullscreen=\"allowfullscreen\"></iframe><script src=\"https://ilimbox.kg/h5p/h5plib/v124/joubel/core/js/h5p-resizer.js\"></script></div>"
            LogClass.showTextLog("NEW H5P URL = " + "https://ilimbox.kg/h5p/embed.php?url=" + holder.encodeToHtml(currentItem.second))
            //holder.binding.webViewLessonContent.loadUrl("https://ilimbox.kg/h5p/embed.php?url=" + holder.encodeToHtml(currentItem.second))
        } else {
            holder.binding.webViewLessonContent.visibility = View.VISIBLE
            holder.binding.imageViewLessonContent.visibility = View.INVISIBLE
            holder.bind(currentItem.second)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}