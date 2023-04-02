package com.kindsapplication.app.modules.donatedetails.`data`.model

import com.kindsapplication.app.R
import com.kindsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DonateDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCodeRed: String? = MyApp.getInstance().resources.getString(R.string.lbl_code_red)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCampDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_camp_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCampName: String? = MyApp.getInstance().resources.getString(R.string.lbl_camp_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_organized_by)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleSeventeenValue: String? = null
)
