package com.kindsapplication.app.modules.donatedetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindsapplication.app.modules.donatedetails.`data`.model.DonateDetailsModel
import org.koin.core.KoinComponent

class DonateDetailsVM : ViewModel(), KoinComponent {
  val donateDetailsModel: MutableLiveData<DonateDetailsModel> =
      MutableLiveData(DonateDetailsModel())

  var navArguments: Bundle? = null
}
