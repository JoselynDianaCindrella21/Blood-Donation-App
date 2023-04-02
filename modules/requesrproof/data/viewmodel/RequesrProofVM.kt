package com.kindsapplication.app.modules.requesrproof.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindsapplication.app.modules.requesrproof.`data`.model.RequesrProofModel
import org.koin.core.KoinComponent

class RequesrProofVM : ViewModel(), KoinComponent {
  val requesrProofModel: MutableLiveData<RequesrProofModel> = MutableLiveData(RequesrProofModel())

  var navArguments: Bundle? = null
}
