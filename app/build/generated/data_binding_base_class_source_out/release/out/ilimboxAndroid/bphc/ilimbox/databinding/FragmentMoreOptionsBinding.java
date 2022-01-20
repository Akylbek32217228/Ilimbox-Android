// Generated by view binder compiler. Do not edit!
package ilimboxAndroid.bphc.ilimbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import ilimboxAndroid.bphc.ilimbox.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMoreOptionsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView moreOptionsHeader;

  @NonNull
  public final ListView moreOptionsList;

  private FragmentMoreOptionsBinding(@NonNull LinearLayout rootView,
      @NonNull TextView moreOptionsHeader, @NonNull ListView moreOptionsList) {
    this.rootView = rootView;
    this.moreOptionsHeader = moreOptionsHeader;
    this.moreOptionsList = moreOptionsList;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMoreOptionsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMoreOptionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_more_options, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMoreOptionsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.more_options_header;
      TextView moreOptionsHeader = rootView.findViewById(id);
      if (moreOptionsHeader == null) {
        break missingId;
      }

      id = R.id.more_options_list;
      ListView moreOptionsList = rootView.findViewById(id);
      if (moreOptionsList == null) {
        break missingId;
      }

      return new FragmentMoreOptionsBinding((LinearLayout) rootView, moreOptionsHeader,
          moreOptionsList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
