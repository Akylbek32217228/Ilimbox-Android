// Generated by view binder compiler. Do not edit!
package ilimboxAndroid.bphc.ilimbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import ilimboxAndroid.bphc.ilimbox.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowMoreOptionsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView moreOptionsIcon;

  @NonNull
  public final TextView moreOptionsText;

  private RowMoreOptionsBinding(@NonNull LinearLayout rootView, @NonNull ImageView moreOptionsIcon,
      @NonNull TextView moreOptionsText) {
    this.rootView = rootView;
    this.moreOptionsIcon = moreOptionsIcon;
    this.moreOptionsText = moreOptionsText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowMoreOptionsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowMoreOptionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_more_options, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowMoreOptionsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.more_options_icon;
      ImageView moreOptionsIcon = rootView.findViewById(id);
      if (moreOptionsIcon == null) {
        break missingId;
      }

      id = R.id.more_options_text;
      TextView moreOptionsText = rootView.findViewById(id);
      if (moreOptionsText == null) {
        break missingId;
      }

      return new RowMoreOptionsBinding((LinearLayout) rootView, moreOptionsIcon, moreOptionsText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
