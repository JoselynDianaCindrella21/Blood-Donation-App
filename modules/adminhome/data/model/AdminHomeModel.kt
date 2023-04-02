package com.kindsapplication.app.modules.adminhome.`data`.model

import com.kindsapplication.app.R
import com.kindsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AdminHomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCodeRed: String? = MyApp.getInstance().resources.getString(R.string.lbl_code_red)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRotaryBloodBa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rotary_blood_ba)

)
