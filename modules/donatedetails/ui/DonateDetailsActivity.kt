package com.kindsapplication.app.modules.donatedetails.ui

import android.graphics.Color
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.kindsapplication.app.R
import com.kindsapplication.app.appcomponents.base.BaseActivity
import com.kindsapplication.app.databinding.ActivityDonateBloodBinding
import com.kindsapplication.app.databinding.ActivityDonateDetailsBinding
import com.kindsapplication.app.modules.donatedetails.`data`.viewmodel.DonateDetailsVM
import kotlin.String
import kotlin.Unit

class DonateDetailsActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    lateinit var binding: ActivityDonateDetailsBinding
    lateinit var firebaseAuth: FirebaseAuth
    lateinit var textView: TextView
    lateinit var database : DatabaseReference
    super.onCreate(savedInstanceState)
    binding = ActivityDonateDetailsBinding.inflate(layoutInflater)
    setContentView(binding.root)
    textView = findViewById(R.id.dondetCodeRed)
    textView.text = Html.fromHtml(
      "<font color=${Color.rgb(0, 0, 0)}>Code</font>" +
              "<font color=${Color.rgb(187, 10, 30)} > Red!</font>"
    )
  }
}
