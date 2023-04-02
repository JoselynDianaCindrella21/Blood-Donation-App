// Generated by data binding compiler. Do not edit!
package com.kindsapplication.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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
import com.kindsapplication.app.modules.login.data.viewmodel.LoginVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLoginBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnLogin;

  @NonNull
  public final FrameLayout frameStackbloodsplashone;

  @NonNull
  public final ImageView imageBloodOne;

  @NonNull
  public final ImageView imageBloodsplashOne;

  @NonNull
  public final LinearLayout linearColumnbloodsplashone;

  @NonNull
  public final LinearLayout linearLogin;

  @NonNull
  public final TextView loginCodeRed;

  @NonNull
  public final EditText loginemail;

  @NonNull
  public final EditText loginpassword;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView txtEmail;

  @NonNull
  public final TextView txtPassword;

  @Bindable
  protected LoginVM mLoginVM;

  protected ActivityLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnLogin, FrameLayout frameStackbloodsplashone, ImageView imageBloodOne,
      ImageView imageBloodsplashOne, LinearLayout linearColumnbloodsplashone,
      LinearLayout linearLogin, TextView loginCodeRed, EditText loginemail, EditText loginpassword,
      TextView textView6, TextView txtEmail, TextView txtPassword) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnLogin = btnLogin;
    this.frameStackbloodsplashone = frameStackbloodsplashone;
    this.imageBloodOne = imageBloodOne;
    this.imageBloodsplashOne = imageBloodsplashOne;
    this.linearColumnbloodsplashone = linearColumnbloodsplashone;
    this.linearLogin = linearLogin;
    this.loginCodeRed = loginCodeRed;
    this.loginemail = loginemail;
    this.loginpassword = loginpassword;
    this.textView6 = textView6;
    this.txtEmail = txtEmail;
    this.txtPassword = txtPassword;
  }

  public abstract void setLoginVM(@Nullable LoginVM loginVM);

  @Nullable
  public LoginVM getLoginVM() {
    return mLoginVM;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, null, false, component);
  }

  public static ActivityLoginBinding bind(@NonNull View view) {
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
  public static ActivityLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLoginBinding)bind(component, view, R.layout.activity_login);
  }
}
