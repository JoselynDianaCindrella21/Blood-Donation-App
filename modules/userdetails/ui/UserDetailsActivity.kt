package com.kindsapplication.app.modules.userdetails.ui

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.kindsapplication.app.R
import com.kindsapplication.app.appcomponents.base.BaseActivity
import com.kindsapplication.app.databinding.ActivityLoginBinding
import com.kindsapplication.app.databinding.ActivityUserDetailsBinding
import com.kindsapplication.app.modules.Details
import com.kindsapplication.app.modules.home.ui.HomeActivity
import com.kindsapplication.app.modules.userdetails.data.viewmodel.UserDetailsVM
import kotlin.String
import kotlin.Unit

class UserDetailsActivity  : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    lateinit var firebaseAuth: FirebaseAuth
    lateinit var database : DatabaseReference
    lateinit var textview: TextView
    super.onCreate(savedInstanceState)
    var binding: ActivityUserDetailsBinding = ActivityUserDetailsBinding.inflate(layoutInflater)
    setContentView(binding.root)

    textview=findViewById(R.id.udetCodeRed)
    textview.text= Html.fromHtml("<font color=${Color.rgb(0,0,0)}>Code</font>" +
            "<font color=${Color.rgb(187,10,30)} > Red!</font>")

    firebaseAuth = FirebaseAuth.getInstance()

    binding.btnContinue.setOnClickListener {
      val fullname = binding.udetfullname.text.toString()
      val dob = binding.udetdob.text.toString()
      val age = binding.udetage.text.toString()
      val btype = binding.udetbtype.text.toString()
      val address = binding.udetaddress.text.toString()
      val mcondition = binding.udetmedcond.text.toString()
      val intent = Intent(this , HomeActivity::class.java)
      startActivity(intent)
      database = FirebaseDatabase.getInstance().getReference("Details")
      val details = Details(fullname, dob, age, btype, address, mcondition)
      database.child(fullname).setValue(details).addOnSuccessListener {
        Toast.makeText(this,"Successfully Saved",Toast.LENGTH_SHORT).show()
      }
//        .addOnFailureListener {
//          Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
//        }
    }
  }
}