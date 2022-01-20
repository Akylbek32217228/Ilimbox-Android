// Generated by view binder compiler. Do not edit!
package ilimboxAndroid.ilimbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import ilimboxAndroid.ilimbox.R;
import im.delight.android.webview.AdvancedWebView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowLessonContentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageViewLessonContent;

  @NonNull
  public final AdvancedWebView webViewLessonContent;

  private RowLessonContentBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageViewLessonContent, @NonNull AdvancedWebView webViewLessonContent) {
    this.rootView = rootView;
    this.imageViewLessonContent = imageViewLessonContent;
    this.webViewLessonContent = webViewLessonContent;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowLessonContentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowLessonContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_lesson_content, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowLessonContentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_view_lesson_content;
      ImageView imageViewLessonContent = rootView.findViewById(id);
      if (imageViewLessonContent == null) {
        break missingId;
      }

      id = R.id.web_view_lesson_content;
      AdvancedWebView webViewLessonContent = rootView.findViewById(id);
      if (webViewLessonContent == null) {
        break missingId;
      }

      return new RowLessonContentBinding((ConstraintLayout) rootView, imageViewLessonContent,
          webViewLessonContent);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
