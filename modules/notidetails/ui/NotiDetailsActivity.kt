package com.kindsapplication.app.modules.notidetails.ui

import androidx.activity.viewModels
import com.kindsapplication.app.R
import com.kindsapplication.app.appcomponents.base.BaseActivity
import com.kindsapplication.app.databinding.ActivityNotiDetailsBinding
import com.kindsapplication.app.modules.notidetails.`data`.viewmodel.NotiDetailsVM
import kotlin.String
import kotlin.Unit

class NotiDetailsActivity : BaseActivity<ActivityNotiDetailsBinding>(R.layout.activity_noti_details)
    {
  private val viewModel: NotiDetailsVM by viewModels<NotiDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notiDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "NOTI_DETAILS_ACTIVITY"

  }
}
