package ilimboxAndroid.ilimbox.bording

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ilimboxAndroid.ilimbox.bording.fragments.BordingOneFragment
import ilimboxAndroid.ilimbox.bording.fragments.BordingThreeFragment
import ilimboxAndroid.ilimbox.bording.fragments.BordingTwoFragment

class ViewPagerFragmentStateAdapter(fm: FragmentActivity, val gm : GoToNextFragment) : FragmentStateAdapter(fm) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> {
                return BordingOneFragment(gm)
            }
            1 -> {
                return BordingTwoFragment(gm)
            }
            2 -> {
                return BordingThreeFragment(gm)
            }
        }

        return Fragment()
    }
}