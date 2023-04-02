package com.kindsapplication.app.modules.requesrproof.ui

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
import com.kindsapplication.app.databinding.ActivityRequesrProofBinding
import com.kindsapplication.app.databinding.ActivityRequestBloodBinding
import com.kindsapplication.app.modules.donateblood.ui.DonateBloodActivity
import com.kindsapplication.app.modules.home.ui.HomeActivity
import com.kindsapplication.app.modules.requesrproof.`data`.viewmodel.RequesrProofVM
import kotlin.String
import kotlin.Unit

class RequesrProofActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    lateinit var firebaseAuth: FirebaseAuth
    lateinit var database : DatabaseReference
    lateinit var textview: TextView
    super.onCreate(savedInstanceState)
    var binding: ActivityRequesrProofBinding = ActivityRequesrProofBinding.inflate(layoutInflater)
    setContentView(binding.root)

    textview=findViewById(R.id.reqproCodeRed)
    textview.text= Html.fromHtml("<font color=${Color.rgb(0,0,0)}>Code</font>" +
            "<font color=${Color.rgb(187,10,30)} > Red!</font>")

    binding.btnRequestbld.setOnClickListener {
      val intent = Intent(this , HomeActivity::class.java)
      startActivity(intent)
    }

  }
}
