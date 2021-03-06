// Generated by view binder compiler. Do not edit!
package ilimboxAndroid.ilimbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputEditText;
import ilimboxAndroid.ilimbox.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEditBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final AppCompatButton btnNext;

  @NonNull
  public final TextInputEditText editEmail;

  @NonNull
  public final TextInputEditText editLastname;

  @NonNull
  public final TextInputEditText editLogin;

  @NonNull
  public final TextInputEditText editName;

  @NonNull
  public final TextInputEditText editPassword;

  @NonNull
  public final ProgressBar editProgress;

  private ActivityEditBinding(@NonNull ScrollView rootView, @NonNull AppCompatButton btnNext,
      @NonNull TextInputEditText editEmail, @NonNull TextInputEditText editLastname,
      @NonNull TextInputEditText editLogin, @NonNull TextInputEditText editName,
      @NonNull TextInputEditText editPassword, @NonNull ProgressBar editProgress) {
    this.rootView = rootView;
    this.btnNext = btnNext;
    this.editEmail = editEmail;
    this.editLastname = editLastname;
    this.editLogin = editLogin;
    this.editName = editName;
    this.editPassword = editPassword;
    this.editProgress = editProgress;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_edit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEditBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_next;
      AppCompatButton btnNext = rootView.findViewById(id);
      if (btnNext == null) {
        break missingId;
      }

      id = R.id.edit_email;
      TextInputEditText editEmail = rootView.findViewById(id);
      if (editEmail == null) {
        break missingId;
      }

      id = R.id.edit_lastname;
      TextInputEditText editLastname = rootView.findViewById(id);
      if (editLastname == null) {
        break missingId;
      }

      id = R.id.edit_login;
      TextInputEditText editLogin = rootView.findViewById(id);
      if (editLogin == null) {
        break missingId;
      }

      id = R.id.edit_name;
      TextInputEditText editName = rootView.findViewById(id);
      if (editName == null) {
        break missingId;
      }

      id = R.id.edit_password;
      TextInputEditText editPassword = rootView.findViewById(id);
      if (editPassword == null) {
        break missingId;
      }

      id = R.id.edit_progress;
      ProgressBar editProgress = rootView.findViewById(id);
      if (editProgress == null) {
        break missingId;
      }

      return new ActivityEditBinding((ScrollView) rootView, btnNext, editEmail, editLastname,
          editLogin, editName, editPassword, editProgress);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
