// Generated by view binder compiler. Do not edit!
package ilimboxAndroid.ilimbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import ilimboxAndroid.ilimbox.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowAttachmentDetailForumBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Barrier barrier;

  @NonNull
  public final View clickWrapper;

  @NonNull
  public final ImageView download;

  @NonNull
  public final ImageView more;

  @NonNull
  public final TextView name;

  private RowAttachmentDetailForumBinding(@NonNull ConstraintLayout rootView,
      @NonNull Barrier barrier, @NonNull View clickWrapper, @NonNull ImageView download,
      @NonNull ImageView more, @NonNull TextView name) {
    this.rootView = rootView;
    this.barrier = barrier;
    this.clickWrapper = clickWrapper;
    this.download = download;
    this.more = more;
    this.name = name;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowAttachmentDetailForumBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowAttachmentDetailForumBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_attachment_detail_forum, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowAttachmentDetailForumBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.barrier;
      Barrier barrier = rootView.findViewById(id);
      if (barrier == null) {
        break missingId;
      }

      id = R.id.click_wrapper;
      View clickWrapper = rootView.findViewById(id);
      if (clickWrapper == null) {
        break missingId;
      }

      id = R.id.download;
      ImageView download = rootView.findViewById(id);
      if (download == null) {
        break missingId;
      }

      id = R.id.more;
      ImageView more = rootView.findViewById(id);
      if (more == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = rootView.findViewById(id);
      if (name == null) {
        break missingId;
      }

      return new RowAttachmentDetailForumBinding((ConstraintLayout) rootView, barrier, clickWrapper,
          download, more, name);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
