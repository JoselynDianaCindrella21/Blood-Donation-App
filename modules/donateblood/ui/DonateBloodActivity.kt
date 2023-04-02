package com.kindsapplication.app.modules.donateblood.ui

import android.content.Intent
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
import com.kindsapplication.app.databinding.ActivityHomeBinding
import com.kindsapplication.app.modules.donateblood.`data`.viewmodel.DonateBloodVM
import com.kindsapplication.app.modules.donatedetails.ui.DonateDetailsActivity
import com.kindsapplication.app.modules.home.ui.HomeActivity
import com.kindsapplication.app.modules.profile.ui.ProfileActivity
import com.kindsapplication.app.modules.register.ui.RegisterActivity
import com.kindsapplication.app.modules.requestblood.ui.RequestBloodActivity
import kotlin.String
import kotlin.Unit

class DonateBloodActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    lateinit var binding: ActivityDonateBloodBinding
    lateinit var firebaseAuth: FirebaseAuth
    lateinit var textView: TextView
    lateinit var database : DatabaseReference
    super.onCreate(savedInstanceState)
    binding = ActivityDonateBloodBinding.inflate(layoutInflater)
    setContentView(binding.root)
    textView = findViewById(R.id.donateCodeRed)
    textView.text = Html.fromHtml(
      "<font color=${Color.rgb(0, 0, 0)}>Code</font>" +
              "<font color=${Color.rgb(187, 10, 30)} > Red!</font>"
    )
    binding.donatelinearlayout.setOnClickListener {
      val intent = Intent(this, DonateDetailsActivity::class.java)
      startActivity(intent)
    }
    binding.imagehome.setOnClickListener {
      val intent = Intent(this , HomeActivity::class.java)
      startActivity(intent)
    }
    binding.imagedonate.setOnClickListener {
      val intent = Intent(this , DonateBloodActivity::class.java)
      startActivity(intent)
    }
    binding.imagerequest.setOnClickListener {
      val intent = Intent(this , RequestBloodActivity::class.java)
      startActivity(intent)
    }
    binding.imageprofile.setOnClickListener {
      val intent = Intent(this , ProfileActivity::class.java)
      startActivity(intent)
    }
  }
}
