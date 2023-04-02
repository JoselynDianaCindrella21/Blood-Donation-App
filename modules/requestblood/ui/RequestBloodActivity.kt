package com.kindsapplication.app.modules.requestblood.ui

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
import com.kindsapplication.app.databinding.ActivityRequestBloodBinding
import com.kindsapplication.app.databinding.ActivityUserDetailsBinding
import com.kindsapplication.app.modules.donateblood.ui.DonateBloodActivity
import com.kindsapplication.app.modules.home.ui.HomeActivity
import com.kindsapplication.app.modules.profile.ui.ProfileActivity
import com.kindsapplication.app.modules.requesrproof.ui.RequesrProofActivity
import com.kindsapplication.app.modules.requestblood.`data`.viewmodel.RequestBloodVM
import kotlin.String
import kotlin.Unit

class RequestBloodActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    lateinit var firebaseAuth: FirebaseAuth
    lateinit var database : DatabaseReference
    lateinit var textview: TextView
    super.onCreate(savedInstanceState)
    var binding: ActivityRequestBloodBinding = ActivityRequestBloodBinding.inflate(layoutInflater)
    setContentView(binding.root)

    textview=findViewById(R.id.reqbloCodeRed)
    textview.text= Html.fromHtml("<font color=${Color.rgb(0,0,0)}>Code</font>" +
            "<font color=${Color.rgb(187,10,30)} > Red!</font>")

    binding.btnnext.setOnClickListener {
      val intent = Intent(this , RequesrProofActivity::class.java)
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
