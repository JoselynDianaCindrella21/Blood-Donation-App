package com.kindsapplication.app.modules.adminblooddetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindsapplication.app.modules.adminblooddetails.`data`.model.AdminBloodDetailsModel
import org.koin.core.KoinComponent

class AdminBloodDetailsVM : ViewModel(), KoinComponent {
  val adminBloodDetailsModel: MutableLiveData<AdminBloodDetailsModel> =
      MutableLiveData(AdminBloodDetailsModel())

  var navArguments: Bundle? = null
}
