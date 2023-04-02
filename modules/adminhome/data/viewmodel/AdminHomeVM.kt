package com.kindsapplication.app.modules.adminhome.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindsapplication.app.modules.adminhome.`data`.model.AdminHomeModel
import org.koin.core.KoinComponent

class AdminHomeVM : ViewModel(), KoinComponent {
  val adminHomeModel: MutableLiveData<AdminHomeModel> = MutableLiveData(AdminHomeModel())

  var navArguments: Bundle? = null
}
