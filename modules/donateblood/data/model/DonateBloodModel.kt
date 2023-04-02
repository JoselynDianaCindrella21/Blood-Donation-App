package com.kindsapplication.app.modules.donateblood.`data`.model

import com.kindsapplication.app.R
import com.kindsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DonateBloodModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCodeRed: String? = MyApp.getInstance().resources.getString(R.string.lbl_code_red)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_donate_blood2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRotaryBloodBa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rotary_blood_ba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFriends2supportOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_friends2support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAtharBloodBan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_athar_blood_ban)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFriends2supportThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_friends2support)

)
