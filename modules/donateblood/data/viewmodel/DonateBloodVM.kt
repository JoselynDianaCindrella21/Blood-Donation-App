package com.kindsapplication.app.modules.donateblood.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindsapplication.app.modules.donateblood.`data`.model.DonateBloodModel
import org.koin.core.KoinComponent

class DonateBloodVM : ViewModel(), KoinComponent {
  val donateBloodModel: MutableLiveData<DonateBloodModel> = MutableLiveData(DonateBloodModel())

  var navArguments: Bundle? = null
}
