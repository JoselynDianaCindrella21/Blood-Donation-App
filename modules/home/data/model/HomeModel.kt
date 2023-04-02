package com.kindsapplication.app.modules.home.`data`.model

import com.kindsapplication.app.R
import com.kindsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCodeRed: String? = MyApp.getInstance().resources.getString(R.string.lbl_code_red)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCodeRedOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_code_red)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeKarthik: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_welcome_karthik)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUserId: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtB230003: String? = MyApp.getInstance().resources.getString(R.string.lbl_b230003)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBloodType: String? = MyApp.getInstance().resources.getString(R.string.lbl_blood_type)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeKarthikOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_welcome_karthik)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUserIdOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtB230003One: String? = MyApp.getInstance().resources.getString(R.string.lbl_b230003)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonateBlood: String? = MyApp.getInstance().resources.getString(R.string.lbl_donate_blood)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRequestBlood: String? = MyApp.getInstance().resources.getString(R.string.lbl_request_blood)

)
