package ilimboxAndroid.ilimbox.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import ilimboxAndroid.ilimbox.BuildConfig
import ilimboxAndroid.ilimbox.R
import ilimboxAndroid.ilimbox.activities.MainActivity
import ilimboxAndroid.ilimbox.activities.TokenActivity
import ilimboxAndroid.ilimbox.app.Urls
import ilimboxAndroid.ilimbox.models.UserAccount
import ilimboxAndroid.ilimbox.utils.UserUtils
import ilimboxAndroid.ilimbox.utils.Utils
import kotlinx.android.synthetic.main.fragment_more.*


class MoreFragment : Fragment() {

    override fun onStart() {
        super.onStart()
        requireActivity().title = "Настройки"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
            inflater.inflate(R.layout.fragment_more, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        website_card.setOnClickListener {
            Utils.openURLInBrowser(requireActivity(), Urls.MOODLE_URL.toString())
        }

        share_card.setOnClickListener {
            val appPackageName = BuildConfig.APPLICATION_ID
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(Intent.EXTRA_TEXT,
                    "Check out the ilimBox App: https://play.google.com/store/apps/details?id=test")
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        }

        issue_card.setOnClickListener {
            Utils.openURLInBrowser(requireActivity(), Urls.getFeedbackURL(
                UserAccount.firstName,
                UserAccount.username
            ))
        }

        about_card.setOnClickListener {
            pushView(InfoFragment(), "info")
        }

        settings_card.setOnClickListener {
            pushView(PreferencesFragment(), "settings")
        }

        logout_card.setOnClickListener {
            askToLogout().show()
        }

        val details = Utils.userDetails(UserAccount.firstName, UserAccount.username)
        name_text.text = details[0]
        username_text.text = details[1]

        // Set version code and commit hash
        app_version_name.text = BuildConfig.VERSION_NAME
        app_version_name.text = BuildConfig.VERSION_NAME
        //commit_hash.text = BuildConfig.COMMIT_HASH

        user_term_constraint.setOnClickListener {
            //startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.stackoverflow.com")))
        }
    }

    private fun pushView(fragment: Fragment, tag: String) {
        try {
            val activity = requireActivity() as MainActivity
            activity.pushView(fragment, tag, false)
        } catch (e: Exception) {
            /*Toast.makeText(requireContext(), "Failed to launch fragment $tag", Toast.LENGTH_SHORT)
                .show()*/
            e.printStackTrace()
        }
    }

    private fun askToLogout(): AlertDialog {
        val dialog = MaterialAlertDialogBuilder(requireContext())
                .setMessage("Are you sure you want to logout?")
                .setPositiveButton("Yes") { _, _ ->
                    logout()
                }
                .setNegativeButton("Cancel") { _, _ ->
                    // Do nothing
                }
        return dialog.create()
    }

    private fun logout() {
        UserUtils.logout()
        startActivity(Intent(requireActivity(), TokenActivity::class.java))
        requireActivity().finish()
    }

    companion object {
        fun newInstance() = MoreFragment()
    }

}