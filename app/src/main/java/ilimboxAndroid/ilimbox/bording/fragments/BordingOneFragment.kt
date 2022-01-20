package ilimboxAndroid.ilimbox.bording.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ilimboxAndroid.ilimbox.R
import ilimboxAndroid.ilimbox.bording.GoToNextFragment
import kotlinx.android.synthetic.main.fragment_bording_one.*

class BordingOneFragment(val gm : GoToNextFragment) : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bording_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener(View.OnClickListener {

            gm.onGoToNext()

        })

    }
}