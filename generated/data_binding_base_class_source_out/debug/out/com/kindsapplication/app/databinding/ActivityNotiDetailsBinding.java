// Generated by data binding compiler. Do not edit!
package com.kindsapplication.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kindsapplication.app.R;
import com.kindsapplication.app.modules.notidetails.data.viewmodel.NotiDetailsVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityNotiDetailsBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnAccept;

  @NonNull
  public final FrameLayout frameBottombar;

  @NonNull
  public final ImageView imageBloodbankOne;

  @NonNull
  public final ImageView imageQuoterequestOne;

  @NonNull
  public final ImageView imageRectangleFortyOne;

  @NonNull
  public final ImageView imageUser117;

  @NonNull
  public final LinearLayout linearColumncodered;

  @NonNull
  public final LinearLayout linearColumnweburl;

  @NonNull
  public final LinearLayout linearNotidetails;

  @NonNull
  public final LinearLayout linearRowaccept;

  @NonNull
  public final LinearLayout linearRowdate;

  @NonNull
  public final LinearLayout linearRowmobileno;

  @NonNull
  public final LinearLayout linearRowrectanglefortyone;

  @NonNull
  public final LinearLayout linearRowweburl;

  @NonNull
  public final TextView txtAkshyaNagar1s;

  @NonNull
  public final TextView txtB;

  @NonNull
  public final TextView txtCodeRed;

  @NonNull
  public final TextView txtDate;

  @NonNull
  public final TextView txtGroupSix;

  @NonNull
  public final TextView txtLanguage;

  @NonNull
  public final TextView txtMobileNo;

  @NonNull
  public final TextView txtTwentyNine;

  @NonNull
  public final TextView txtTwo;

  @NonNull
  public final TextView txtWeburl;

  @Bindable
  protected NotiDetailsVM mNotiDetailsVM;

  protected ActivityNotiDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnAccept, FrameLayout frameBottombar, ImageView imageBloodbankOne,
      ImageView imageQuoterequestOne, ImageView imageRectangleFortyOne, ImageView imageUser117,
      LinearLayout linearColumncodered, LinearLayout linearColumnweburl,
      LinearLayout linearNotidetails, LinearLayout linearRowaccept, LinearLayout linearRowdate,
      LinearLayout linearRowmobileno, LinearLayout linearRowrectanglefortyone,
      LinearLayout linearRowweburl, TextView txtAkshyaNagar1s, TextView txtB, TextView txtCodeRed,
      TextView txtDate, TextView txtGroupSix, TextView txtLanguage, TextView txtMobileNo,
      TextView txtTwentyNine, TextView txtTwo, TextView txtWeburl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnAccept = btnAccept;
    this.frameBottombar = frameBottombar;
    this.imageBloodbankOne = imageBloodbankOne;
    this.imageQuoterequestOne = imageQuoterequestOne;
    this.imageRectangleFortyOne = imageRectangleFortyOne;
    this.imageUser117 = imageUser117;
    this.linearColumncodered = linearColumncodered;
    this.linearColumnweburl = linearColumnweburl;
    this.linearNotidetails = linearNotidetails;
    this.linearRowaccept = linearRowaccept;
    this.linearRowdate = linearRowdate;
    this.linearRowmobileno = linearRowmobileno;
    this.linearRowrectanglefortyone = linearRowrectanglefortyone;
    this.linearRowweburl = linearRowweburl;
    this.txtAkshyaNagar1s = txtAkshyaNagar1s;
    this.txtB = txtB;
    this.txtCodeRed = txtCodeRed;
    this.txtDate = txtDate;
    this.txtGroupSix = txtGroupSix;
    this.txtLanguage = txtLanguage;
    this.txtMobileNo = txtMobileNo;
    this.txtTwentyNine = txtTwentyNine;
    this.txtTwo = txtTwo;
    this.txtWeburl = txtWeburl;
  }

  public abstract void setNotiDetailsVM(@Nullable NotiDetailsVM notiDetailsVM);

  @Nullable
  public NotiDetailsVM getNotiDetailsVM() {
    return mNotiDetailsVM;
  }

  @NonNull
  public static ActivityNotiDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_noti_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNotiDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityNotiDetailsBinding>inflateInternal(inflater, R.layout.activity_noti_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityNotiDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_noti_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNotiDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityNotiDetailsBinding>inflateInternal(inflater, R.layout.activity_noti_details, null, false, component);
  }

  public static ActivityNotiDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityNotiDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityNotiDetailsBinding)bind(component, view, R.layout.activity_noti_details);
  }
}