// Generated by view binder compiler. Do not edit!
package ilimboxAndroid.ilimbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import ilimboxAndroid.ilimbox.R;
import ilimboxAndroid.ilimbox.widgets.HtmlTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowForumBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Barrier barrierMessage;

  @NonNull
  public final Barrier barrierProfilePic;

  @NonNull
  public final CardView clickWrapper;

  @NonNull
  public final HtmlTextView message;

  @NonNull
  public final TextView modifiedTime;

  @NonNull
  public final View nameAndDescriptionDivider;

  @NonNull
  public final ImageView pinned;

  @NonNull
  public final TextView subject;

  @NonNull
  public final TextView userName;

  @NonNull
  public final ImageView userPic;

  private RowForumBinding(@NonNull FrameLayout rootView, @NonNull Barrier barrierMessage,
      @NonNull Barrier barrierProfilePic, @NonNull CardView clickWrapper,
      @NonNull HtmlTextView message, @NonNull TextView modifiedTime,
      @NonNull View nameAndDescriptionDivider, @NonNull ImageView pinned, @NonNull TextView subject,
      @NonNull TextView userName, @NonNull ImageView userPic) {
    this.rootView = rootView;
    this.barrierMessage = barrierMessage;
    this.barrierProfilePic = barrierProfilePic;
    this.clickWrapper = clickWrapper;
    this.message = message;
    this.modifiedTime = modifiedTime;
    this.nameAndDescriptionDivider = nameAndDescriptionDivider;
    this.pinned = pinned;
    this.subject = subject;
    this.userName = userName;
    this.userPic = userPic;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowForumBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowForumBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_forum, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowForumBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.barrier_message;
      Barrier barrierMessage = rootView.findViewById(id);
      if (barrierMessage == null) {
        break missingId;
      }

      id = R.id.barrier_profile_pic;
      Barrier barrierProfilePic = rootView.findViewById(id);
      if (barrierProfilePic == null) {
        break missingId;
      }

      id = R.id.click_wrapper;
      CardView clickWrapper = rootView.findViewById(id);
      if (clickWrapper == null) {
        break missingId;
      }

      id = R.id.message;
      HtmlTextView message = rootView.findViewById(id);
      if (message == null) {
        break missingId;
      }

      id = R.id.modified_time;
      TextView modifiedTime = rootView.findViewById(id);
      if (modifiedTime == null) {
        break missingId;
      }

      id = R.id.nameAndDescriptionDivider;
      View nameAndDescriptionDivider = rootView.findViewById(id);
      if (nameAndDescriptionDivider == null) {
        break missingId;
      }

      id = R.id.pinned;
      ImageView pinned = rootView.findViewById(id);
      if (pinned == null) {
        break missingId;
      }

      id = R.id.subject;
      TextView subject = rootView.findViewById(id);
      if (subject == null) {
        break missingId;
      }

      id = R.id.user_name;
      TextView userName = rootView.findViewById(id);
      if (userName == null) {
        break missingId;
      }

      id = R.id.user_pic;
      ImageView userPic = rootView.findViewById(id);
      if (userPic == null) {
        break missingId;
      }

      return new RowForumBinding((FrameLayout) rootView, barrierMessage, barrierProfilePic,
          clickWrapper, message, modifiedTime, nameAndDescriptionDivider, pinned, subject, userName,
          userPic);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}