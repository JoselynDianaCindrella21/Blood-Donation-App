package com.kindsapplication.app.modules.notidetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindsapplication.app.modules.notidetails.`data`.model.NotiDetailsModel
import org.koin.core.KoinComponent

class NotiDetailsVM : ViewModel(), KoinComponent {
  val notiDetailsModel: MutableLiveData<NotiDetailsModel> = MutableLiveData(NotiDetailsModel())

  var navArguments: Bundle? = null
}
