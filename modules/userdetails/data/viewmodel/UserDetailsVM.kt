package com.kindsapplication.app.modules.userdetails.data.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindsapplication.app.modules.userdetails.data.model.UserDetailsModel
import org.koin.core.KoinComponent

class UserDetailsVM : ViewModel(), KoinComponent {
  val userDetailsModel: MutableLiveData<UserDetailsModel> = MutableLiveData(UserDetailsModel())

  var navArguments: Bundle? = null
}
