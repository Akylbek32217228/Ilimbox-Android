// Generated by view binder compiler. Do not edit!
package ilimboxAndroid.ilimbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import ilimboxAndroid.ilimbox.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VideoProgressBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final LinearLayout progressIndicator;

  private VideoProgressBinding(@NonNull LinearLayout rootView, @NonNull ProgressBar progress,
      @NonNull LinearLayout progressIndicator) {
    this.rootView = rootView;
    this.progress = progress;
    this.progressIndicator = progressIndicator;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static VideoProgressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VideoProgressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.video_progress, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VideoProgressBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = android.R.id.progress;
      ProgressBar progress = rootView.findViewById(id);
      if (progress == null) {
        break missingId;
      }

      LinearLayout progressIndicator = (LinearLayout) rootView;

      return new VideoProgressBinding((LinearLayout) rootView, progress, progressIndicator);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
