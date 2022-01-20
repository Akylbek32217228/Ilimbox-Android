package ilimboxAndroid.ilimbox.utils

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager

open class CustomLinearLayoutManager(context: Context?) : LinearLayoutManager(context) {

    private var isScrollEnabled : Boolean = false

    public fun setScrollEnabled(flag : Boolean) {
        this.isScrollEnabled = flag
    }

    override fun canScrollHorizontally(): Boolean {
        return isScrollEnabled && super.canScrollHorizontally()
    }

    override fun canScrollVertically(): Boolean {
        return isScrollEnabled && super.canScrollVertically()
    }
}