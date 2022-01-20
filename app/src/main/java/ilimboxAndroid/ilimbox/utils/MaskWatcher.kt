package ilimboxAndroid.ilimbox.utils

import android.text.Editable
import android.text.InputFilter

import android.text.TextWatcher
import android.util.Log


class MaskWatcher(var mask: String) : TextWatcher {

    private var isRunning = false
    private var isDeleting = false
    override fun beforeTextChanged(charSequence: CharSequence, start: Int, count: Int, after: Int) {
        isDeleting = count > after
    }

    override fun onTextChanged(charSequence: CharSequence, start: Int, before: Int, count: Int) {}
    override fun afterTextChanged(editable: Editable) {

        if (isRunning || isDeleting) {
            return
        }
        isRunning = true
        val editableLength = editable.length
        if (editableLength < mask.length) {

            if (mask[editableLength] != '#') {

                var filter : Array<InputFilter> = editable.filters
                editable.filters = arrayOf<InputFilter>()
                editable.append(mask[editableLength])
                editable.filters = filter
            } else if (mask[editableLength - 1] != '#') {
                var filter : Array<InputFilter> = editable.filters
                editable.filters = arrayOf<InputFilter>()
                editable.insert(editableLength - 1, mask, editableLength - 1, editableLength)
                editable.filters = filter
            }
        }
        isRunning = false
    }

}