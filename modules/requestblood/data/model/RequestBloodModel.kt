package com.kindsapplication.app.modules.requestblood.`data`.model

import com.kindsapplication.app.R
import com.kindsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RequestBloodModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCodeRed: String? = MyApp.getInstance().resources.getString(R.string.lbl_code_red)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_request_blood2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_mobile_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAge: String? = MyApp.getInstance().resources.getString(R.string.lbl_age)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBloodGroupTyp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_blood_group_typ)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_units)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRequiredDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_required_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_next)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleElevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleTwelveValue: String? = null
)
