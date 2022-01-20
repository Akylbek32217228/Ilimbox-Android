// Generated by view binder compiler. Do not edit!
package ilimboxAndroid.bphc.ilimbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import ilimboxAndroid.bphc.ilimbox.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowDownloadBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView deleteImage;

  @NonNull
  public final View divider;

  @NonNull
  public final TextView downloadDetailsText;

  @NonNull
  public final ImageView downloadIconImage;

  @NonNull
  public final ConstraintLayout downloadLayout;

  @NonNull
  public final TextView downloadNameText;

  private RowDownloadBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView deleteImage,
      @NonNull View divider, @NonNull TextView downloadDetailsText,
      @NonNull ImageView downloadIconImage, @NonNull ConstraintLayout downloadLayout,
      @NonNull TextView downloadNameText) {
    this.rootView = rootView;
    this.deleteImage = deleteImage;
    this.divider = divider;
    this.downloadDetailsText = downloadDetailsText;
    this.downloadIconImage = downloadIconImage;
    this.downloadLayout = downloadLayout;
    this.downloadNameText = downloadNameText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowDownloadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowDownloadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_download, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowDownloadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.delete_image;
      ImageView deleteImage = rootView.findViewById(id);
      if (deleteImage == null) {
        break missingId;
      }

      id = R.id.divider;
      View divider = rootView.findViewById(id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.download_details_text;
      TextView downloadDetailsText = rootView.findViewById(id);
      if (downloadDetailsText == null) {
        break missingId;
      }

      id = R.id.download_icon_image;
      ImageView downloadIconImage = rootView.findViewById(id);
      if (downloadIconImage == null) {
        break missingId;
      }

      ConstraintLayout downloadLayout = (ConstraintLayout) rootView;

      id = R.id.download_name_text;
      TextView downloadNameText = rootView.findViewById(id);
      if (downloadNameText == null) {
        break missingId;
      }

      return new RowDownloadBinding((ConstraintLayout) rootView, deleteImage, divider,
          downloadDetailsText, downloadIconImage, downloadLayout, downloadNameText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
