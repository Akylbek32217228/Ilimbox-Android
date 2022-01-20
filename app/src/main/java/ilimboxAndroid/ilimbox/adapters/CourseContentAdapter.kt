package ilimboxAndroid.ilimbox.adapters

import android.app.Activity
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager
import ilimboxAndroid.ilimbox.adapters.delegates.CourseModuleDelegate
import ilimboxAndroid.ilimbox.adapters.delegates.CourseSectionDelegate
import ilimboxAndroid.ilimbox.interfaces.ClickListener
import ilimboxAndroid.ilimbox.interfaces.CourseContent
import ilimboxAndroid.ilimbox.core.FileManager
import ilimboxAndroid.ilimbox.models.course.CourseSection
import ilimboxAndroid.ilimbox.models.course.Module

class CourseContentAdapter(
        activity: Activity,
        var contents: List<CourseContent>,
        fileManager: FileManager,
        clickWrapperListener: ClickListener,
        moreOptionsClickListener: ClickListener
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val delegatesManager: AdapterDelegatesManager<List<CourseContent>> = AdapterDelegatesManager()

    fun setCourseContents(contents: List<CourseContent>) {
        this.contents = contents
        notifyDataSetChanged()
    }

    fun getPositionFromSectionNum(sectionNum: Int): Int {
        for (i in contents.indices) {
            if (contents[i] is CourseSection) {
                if ((contents[i] as CourseSection).sectionNum == sectionNum) {
                    return i
                }
            }
        }
        return 0
    }

    fun getPositionFromModId(modId: Int): Int {
        for (i in contents.indices) {
            if (contents[i] is Module) {
                if ((contents[i] as Module).id == modId) {
                    return i
                }
            }
        }
        return 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return delegatesManager.onCreateViewHolder(parent, viewType)
    }

    override fun getItemViewType(position: Int): Int {
        return delegatesManager.getItemViewType(contents, position)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        delegatesManager.onBindViewHolder(contents, position, holder)
    }

    override fun getItemCount(): Int {
        return contents.size
    }

    init {
        delegatesManager.addDelegate(CourseSectionDelegate(activity))
                .addDelegate(CourseModuleDelegate(activity, fileManager, clickWrapperListener,
                        moreOptionsClickListener))
    }
}