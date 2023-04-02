package com.kindsapplication.app.modules.requestblood.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindsapplication.app.modules.requestblood.`data`.model.RequestBloodModel
import org.koin.core.KoinComponent

class RequestBloodVM : ViewModel(), KoinComponent {
  val requestBloodModel: MutableLiveData<RequestBloodModel> = MutableLiveData(RequestBloodModel())

  var navArguments: Bundle? = null
}
