package ilimboxAndroid.ilimbox.bording

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import ilimboxAndroid.ilimbox.R

class BordingActivity : AppCompatActivity(), GoToNextFragment {

    var viewPager : ViewPager2? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bording)

        viewPager = findViewById<ViewPager2>(R.id.bording_view_pager)
        viewPager!!.adapter = ViewPagerFragmentStateAdapter(this, this)


    }

    override fun onGoToNext() {
        if(viewPager != null) {
            if(viewPager!!.currentItem != viewPager!!.adapter!!.itemCount - 1) {
                viewPager!!.setCurrentItem(viewPager!!.currentItem + 1)
            } else {
                finish()
            }
        }
    }


}

interface GoToNextFragment {
    fun onGoToNext()
}
