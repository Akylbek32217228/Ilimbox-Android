package ilimboxAndroid.ilimbox.widgets

import android.content.Context
import android.text.SpannableStringBuilder
import android.text.style.ClickableSpan
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import ilimboxAndroid.ilimbox.R
import ilimboxAndroid.ilimbox.utils.Utils.trimWhiteSpace

class CollapsibleTextView(context: Context, attrs: AttributeSet?) :
    AppCompatTextView(context, attrs) {

    private enum class TextState {
        COLLAPSED, EXPANDED
    }

    private var fullText: CharSequence
    private var collapseText: String
    private var expandText: String
    private var collapsedLineCount: Int

    private var state = TextState.COLLAPSED
    private val spanBuilder = SpannableStringBuilder()
    private var shouldRemeasure = true

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        // We don't want an infinite measure loop
        if (!shouldRemeasure) return

        // Check if layout line count is greater than maximum. If so, set collapsed
        // text and remeasure
        shouldRemeasure = false
        val layout = layout
        val textToShow: CharSequence?
        if (state == TextState.COLLAPSED) {
            spanBuilder.clear()
            if (layout.lineCount > collapsedLineCount) {
                textToShow = fullText.subSequence(0, layout.getLineEnd(collapsedLineCount - 1))
                spanBuilder.append(trimWhiteSpace(textToShow))
                spanBuilder.append("\n")
                spanBuilder.append(expandText)
                spanBuilder.setSpan(object : ClickableSpan() {
                    override fun onClick(widget: View) {
                        state = TextState.EXPANDED
                        requestLayout()
                        shouldRemeasure = true
                    }
                }, spanBuilder.length - expandText.length - 1, spanBuilder.length, 0)
            } else {
                spanBuilder.append(fullText)
            }
        } else {
            // The full text is shown, only difference is if the view is collapsible
            textToShow = fullText
            spanBuilder.clear()
            if (collapseText.isNotEmpty()) {
                spanBuilder.append(textToShow)
                if (spanBuilder[spanBuilder.length - 1] != '\n') {
                    spanBuilder.append("\n")
                }
                spanBuilder.append(collapseText)
                spanBuilder.setSpan(object : ClickableSpan() {
                    override fun onClick(widget: View) {
                        state = TextState.COLLAPSED
                        requestLayout()
                        shouldRemeasure = true
                    }
                }, spanBuilder.length - collapseText.length - 1, spanBuilder.length, 0)
            } else {
                spanBuilder.append(textToShow)
            }
            super.setText(spanBuilder)
        }

        // Have the layout measure itself once more
        super.setText(spanBuilder)
        measure(widthMeasureSpec, heightMeasureSpec)
    }

    fun setFullText(fullText: CharSequence) {
        this.fullText = fullText
        state = TextState.COLLAPSED
        shouldRemeasure = true
        super.setText(fullText)
    }

    init {
        val a = context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.CollapsibleTextView,
            0, 0
        )
        try {
            fullText = a.getText(R.styleable.CollapsibleTextView_full_text)
            collapseText = a.getString(R.styleable.CollapsibleTextView_collapse_text) ?: ""
            expandText = a.getString(R.styleable.CollapsibleTextView_expand_text) ?: ""
            collapsedLineCount = a.getInt(R.styleable.CollapsibleTextView_collapsed_line_count, 3)
        } finally {
            a.recycle()
        }
    }
}
