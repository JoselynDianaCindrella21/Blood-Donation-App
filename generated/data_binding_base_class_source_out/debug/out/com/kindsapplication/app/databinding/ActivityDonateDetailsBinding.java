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
import com.kindsapplication.app.modules.donatedetails.data.viewmodel.DonateDetailsVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDonateDetailsBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnDonate;

  @NonNull
  public final TextView dondetCodeRed;

  @NonNull
  public final TextView etRectangleSeventeen;

  @NonNull
  public final FrameLayout frameBottombar;

  @NonNull
  public final ImageView imageBloodbankOne;

  @NonNull
  public final ImageView imageQuoterequestOne;

  @NonNull
  public final ImageView imageRectangleThirtySix;

  @NonNull
  public final ImageView imageUser110;

  @NonNull
  public final LinearLayout linearColumncodered;

  @NonNull
  public final LinearLayout linearDonatedetails;

  @NonNull
  public final LinearLayout linearRowrectanglethirtysix;

  @NonNull
  public final TextView txtAddress;

  @NonNull
  public final TextView txtCampDetails;

  @NonNull
  public final TextView txtCampName;

  @NonNull
  public final TextView txtLanguage;

  @NonNull
  public final TextView txtLanguageOne;

  @NonNull
  public final TextView txtTime;

  @NonNull
  public final TextView viewRectangleFifteen;

  @NonNull
  public final TextView viewRectangleFourteen;

  @NonNull
  public final TextView viewRectangleSixteen;

  @NonNull
  public final TextView viewRectangleThirteen;

  @Bindable
  protected DonateDetailsVM mDonateDetailsVM;

  protected ActivityDonateDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnDonate, TextView dondetCodeRed, TextView etRectangleSeventeen,
      FrameLayout frameBottombar, ImageView imageBloodbankOne, ImageView imageQuoterequestOne,
      ImageView imageRectangleThirtySix, ImageView imageUser110, LinearLayout linearColumncodered,
      LinearLayout linearDonatedetails, LinearLayout linearRowrectanglethirtysix,
      TextView txtAddress, TextView txtCampDetails, TextView txtCampName, TextView txtLanguage,
      TextView txtLanguageOne, TextView txtTime, TextView viewRectangleFifteen,
      TextView viewRectangleFourteen, TextView viewRectangleSixteen,
      TextView viewRectangleThirteen) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnDonate = btnDonate;
    this.dondetCodeRed = dondetCodeRed;
    this.etRectangleSeventeen = etRectangleSeventeen;
    this.frameBottombar = frameBottombar;
    this.imageBloodbankOne = imageBloodbankOne;
    this.imageQuoterequestOne = imageQuoterequestOne;
    this.imageRectangleThirtySix = imageRectangleThirtySix;
    this.imageUser110 = imageUser110;
    this.linearColumncodered = linearColumncodered;
    this.linearDonatedetails = linearDonatedetails;
    this.linearRowrectanglethirtysix = linearRowrectanglethirtysix;
    this.txtAddress = txtAddress;
    this.txtCampDetails = txtCampDetails;
    this.txtCampName = txtCampName;
    this.txtLanguage = txtLanguage;
    this.txtLanguageOne = txtLanguageOne;
    this.txtTime = txtTime;
    this.viewRectangleFifteen = viewRectangleFifteen;
    this.viewRectangleFourteen = viewRectangleFourteen;
    this.viewRectangleSixteen = viewRectangleSixteen;
    this.viewRectangleThirteen = viewRectangleThirteen;
  }

  public abstract void setDonateDetailsVM(@Nullable DonateDetailsVM donateDetailsVM);

  @Nullable
  public DonateDetailsVM getDonateDetailsVM() {
    return mDonateDetailsVM;
  }

  @NonNull
  public static ActivityDonateDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_donate_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDonateDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDonateDetailsBinding>inflateInternal(inflater, R.layout.activity_donate_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDonateDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_donate_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDonateDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDonateDetailsBinding>inflateInternal(inflater, R.layout.activity_donate_details, null, false, component);
  }

  public static ActivityDonateDetailsBinding bind(@NonNull View view) {
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
  public static ActivityDonateDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDonateDetailsBinding)bind(component, view, R.layout.activity_donate_details);
  }
}
