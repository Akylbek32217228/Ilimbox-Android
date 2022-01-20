// Generated by view binder compiler. Do not edit!
package ilimboxAndroid.ilimbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import ilimboxAndroid.ilimbox.R;
import ilimboxAndroid.ilimbox.widgets.CollapsibleTextView;
import ilimboxAndroid.ilimbox.widgets.HtmlTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowCourseModuleBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView ckickModule;

  @NonNull
  public final View clickWrapper;

  @NonNull
  public final ImageView download;

  @NonNull
  public final ImageView icon;

  @NonNull
  public final Barrier iconBarrier;

  @NonNull
  public final ConstraintLayout layoutWrapper;

  @NonNull
  public final ImageView more;

  @NonNull
  public final HtmlTextView name;

  @NonNull
  public final View nameAndDescriptionDivider;

  @NonNull
  public final Barrier nameDescriptionBarrier;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final CollapsibleTextView webViewSection;

  private RowCourseModuleBinding(@NonNull CardView rootView, @NonNull CardView ckickModule,
      @NonNull View clickWrapper, @NonNull ImageView download, @NonNull ImageView icon,
      @NonNull Barrier iconBarrier, @NonNull ConstraintLayout layoutWrapper,
      @NonNull ImageView more, @NonNull HtmlTextView name, @NonNull View nameAndDescriptionDivider,
      @NonNull Barrier nameDescriptionBarrier, @NonNull ProgressBar progressBar,
      @NonNull CollapsibleTextView webViewSection) {
    this.rootView = rootView;
    this.ckickModule = ckickModule;
    this.clickWrapper = clickWrapper;
    this.download = download;
    this.icon = icon;
    this.iconBarrier = iconBarrier;
    this.layoutWrapper = layoutWrapper;
    this.more = more;
    this.name = name;
    this.nameAndDescriptionDivider = nameAndDescriptionDivider;
    this.nameDescriptionBarrier = nameDescriptionBarrier;
    this.progressBar = progressBar;
    this.webViewSection = webViewSection;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static RowCourseModuleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowCourseModuleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_course_module, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowCourseModuleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView ckickModule = (CardView) rootView;

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

      id = R.id.icon;
      ImageView icon = rootView.findViewById(id);
      if (icon == null) {
        break missingId;
      }

      id = R.id.icon_barrier;
      Barrier iconBarrier = rootView.findViewById(id);
      if (iconBarrier == null) {
        break missingId;
      }

      id = R.id.layout_wrapper;
      ConstraintLayout layoutWrapper = rootView.findViewById(id);
      if (layoutWrapper == null) {
        break missingId;
      }

      id = R.id.more;
      ImageView more = rootView.findViewById(id);
      if (more == null) {
        break missingId;
      }

      id = R.id.name;
      HtmlTextView name = rootView.findViewById(id);
      if (name == null) {
        break missingId;
      }

      id = R.id.nameAndDescriptionDivider;
      View nameAndDescriptionDivider = rootView.findViewById(id);
      if (nameAndDescriptionDivider == null) {
        break missingId;
      }

      id = R.id.name_description_barrier;
      Barrier nameDescriptionBarrier = rootView.findViewById(id);
      if (nameDescriptionBarrier == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.web_view_section;
      CollapsibleTextView webViewSection = rootView.findViewById(id);
      if (webViewSection == null) {
        break missingId;
      }

      return new RowCourseModuleBinding((CardView) rootView, ckickModule, clickWrapper, download,
          icon, iconBarrier, layoutWrapper, more, name, nameAndDescriptionDivider,
          nameDescriptionBarrier, progressBar, webViewSection);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
