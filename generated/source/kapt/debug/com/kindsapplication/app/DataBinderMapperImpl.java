package com.kindsapplication.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kindsapplication.app.databinding.ActivityAdminBloodDetailsBindingImpl;
import com.kindsapplication.app.databinding.ActivityAdminHomeBindingImpl;
import com.kindsapplication.app.databinding.ActivityDonateBloodBindingImpl;
import com.kindsapplication.app.databinding.ActivityDonateDetailsBindingImpl;
import com.kindsapplication.app.databinding.ActivityHomeBindingImpl;
import com.kindsapplication.app.databinding.ActivityLoginBindingImpl;
import com.kindsapplication.app.databinding.ActivityNotiDetailsBindingImpl;
import com.kindsapplication.app.databinding.ActivityNotificationBindingImpl;
import com.kindsapplication.app.databinding.ActivityProfileBindingImpl;
import com.kindsapplication.app.databinding.ActivityRegisterBindingImpl;
import com.kindsapplication.app.databinding.ActivityRequesrProofBindingImpl;
import com.kindsapplication.app.databinding.ActivityRequestBloodBindingImpl;
import com.kindsapplication.app.databinding.ActivityUserDetailsBindingImpl;
import com.kindsapplication.app.databinding.LayoutProgressDialogBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYADMINBLOODDETAILS = 1;

  private static final int LAYOUT_ACTIVITYADMINHOME = 2;

  private static final int LAYOUT_ACTIVITYDONATEBLOOD = 3;

  private static final int LAYOUT_ACTIVITYDONATEDETAILS = 4;

  private static final int LAYOUT_ACTIVITYHOME = 5;

  private static final int LAYOUT_ACTIVITYLOGIN = 6;

  private static final int LAYOUT_ACTIVITYNOTIDETAILS = 7;

  private static final int LAYOUT_ACTIVITYNOTIFICATION = 8;

  private static final int LAYOUT_ACTIVITYPROFILE = 9;

  private static final int LAYOUT_ACTIVITYREGISTER = 10;

  private static final int LAYOUT_ACTIVITYREQUESRPROOF = 11;

  private static final int LAYOUT_ACTIVITYREQUESTBLOOD = 12;

  private static final int LAYOUT_ACTIVITYUSERDETAILS = 13;

  private static final int LAYOUT_LAYOUTPROGRESSDIALOG = 14;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(14);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kindsapplication.app.R.layout.activity_admin_blood_details, LAYOUT_ACTIVITYADMINBLOODDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kindsapplication.app.R.layout.activity_admin_home, LAYOUT_ACTIVITYADMINHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kindsapplication.app.R.layout.activity_donate_blood, LAYOUT_ACTIVITYDONATEBLOOD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kindsapplication.app.R.layout.activity_donate_details, LAYOUT_ACTIVITYDONATEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kindsapplication.app.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kindsapplication.app.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kindsapplication.app.R.layout.activity_noti_details, LAYOUT_ACTIVITYNOTIDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kindsapplication.app.R.layout.activity_notification, LAYOUT_ACTIVITYNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kindsapplication.app.R.layout.activity_profile, LAYOUT_ACTIVITYPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kindsapplication.app.R.layout.activity_register, LAYOUT_ACTIVITYREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kindsapplication.app.R.layout.activity_requesr_proof, LAYOUT_ACTIVITYREQUESRPROOF);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kindsapplication.app.R.layout.activity_request_blood, LAYOUT_ACTIVITYREQUESTBLOOD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kindsapplication.app.R.layout.activity_user_details, LAYOUT_ACTIVITYUSERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kindsapplication.app.R.layout.layout_progress_dialog, LAYOUT_LAYOUTPROGRESSDIALOG);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYADMINBLOODDETAILS: {
          if ("layout/activity_admin_blood_details_0".equals(tag)) {
            return new ActivityAdminBloodDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_admin_blood_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYADMINHOME: {
          if ("layout/activity_admin_home_0".equals(tag)) {
            return new ActivityAdminHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_admin_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDONATEBLOOD: {
          if ("layout/activity_donate_blood_0".equals(tag)) {
            return new ActivityDonateBloodBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_donate_blood is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDONATEDETAILS: {
          if ("layout/activity_donate_details_0".equals(tag)) {
            return new ActivityDonateDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_donate_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNOTIDETAILS: {
          if ("layout/activity_noti_details_0".equals(tag)) {
            return new ActivityNotiDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_noti_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNOTIFICATION: {
          if ("layout/activity_notification_0".equals(tag)) {
            return new ActivityNotificationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_notification is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPROFILE: {
          if ("layout/activity_profile_0".equals(tag)) {
            return new ActivityProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREGISTER: {
          if ("layout/activity_register_0".equals(tag)) {
            return new ActivityRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_register is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREQUESRPROOF: {
          if ("layout/activity_requesr_proof_0".equals(tag)) {
            return new ActivityRequesrProofBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_requesr_proof is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREQUESTBLOOD: {
          if ("layout/activity_request_blood_0".equals(tag)) {
            return new ActivityRequestBloodBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_request_blood is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYUSERDETAILS: {
          if ("layout/activity_user_details_0".equals(tag)) {
            return new ActivityUserDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_user_details is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPROGRESSDIALOG: {
          if ("layout/layout_progress_dialog_0".equals(tag)) {
            return new LayoutProgressDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_progress_dialog is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(15);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "adminBloodDetailsVM");
      sKeys.put(2, "adminHomeVM");
      sKeys.put(3, "donateBloodVM");
      sKeys.put(4, "donateDetailsVM");
      sKeys.put(5, "homeVM");
      sKeys.put(6, "loginVM");
      sKeys.put(7, "message");
      sKeys.put(8, "notiDetailsVM");
      sKeys.put(9, "notificationVM");
      sKeys.put(10, "profileVM");
      sKeys.put(11, "registerVM");
      sKeys.put(12, "requesrProofVM");
      sKeys.put(13, "requestBloodVM");
      sKeys.put(14, "userDetailsVM");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(14);

    static {
      sKeys.put("layout/activity_admin_blood_details_0", com.kindsapplication.app.R.layout.activity_admin_blood_details);
      sKeys.put("layout/activity_admin_home_0", com.kindsapplication.app.R.layout.activity_admin_home);
      sKeys.put("layout/activity_donate_blood_0", com.kindsapplication.app.R.layout.activity_donate_blood);
      sKeys.put("layout/activity_donate_details_0", com.kindsapplication.app.R.layout.activity_donate_details);
      sKeys.put("layout/activity_home_0", com.kindsapplication.app.R.layout.activity_home);
      sKeys.put("layout/activity_login_0", com.kindsapplication.app.R.layout.activity_login);
      sKeys.put("layout/activity_noti_details_0", com.kindsapplication.app.R.layout.activity_noti_details);
      sKeys.put("layout/activity_notification_0", com.kindsapplication.app.R.layout.activity_notification);
      sKeys.put("layout/activity_profile_0", com.kindsapplication.app.R.layout.activity_profile);
      sKeys.put("layout/activity_register_0", com.kindsapplication.app.R.layout.activity_register);
      sKeys.put("layout/activity_requesr_proof_0", com.kindsapplication.app.R.layout.activity_requesr_proof);
      sKeys.put("layout/activity_request_blood_0", com.kindsapplication.app.R.layout.activity_request_blood);
      sKeys.put("layout/activity_user_details_0", com.kindsapplication.app.R.layout.activity_user_details);
      sKeys.put("layout/layout_progress_dialog_0", com.kindsapplication.app.R.layout.layout_progress_dialog);
    }
  }
}
