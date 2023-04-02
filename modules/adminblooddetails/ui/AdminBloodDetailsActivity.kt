package com.kindsapplication.app.modules.adminblooddetails.ui

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
import com.kindsapplication.app.databinding.ActivityAdminBloodDetailsBinding
import com.kindsapplication.app.databinding.ActivityHomeBinding
import com.kindsapplication.app.modules.Camp
import com.kindsapplication.app.modules.Details
import com.kindsapplication.app.modules.adminblooddetails.`data`.viewmodel.AdminBloodDetailsVM
import com.kindsapplication.app.modules.adminhome.ui.AdminHomeActivity
import com.kindsapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class AdminBloodDetailsActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    lateinit var binding: ActivityAdminBloodDetailsBinding
    lateinit var firebaseAuth: FirebaseAuth
    lateinit var textView2: TextView
    lateinit var database : DatabaseReference
    super.onCreate(savedInstanceState)
    binding = ActivityAdminBloodDetailsBinding.inflate(layoutInflater)
    setContentView(binding.root)

    textView2 = findViewById(R.id.admindetailsCodeRed)
    textView2.text = Html.fromHtml(
      "<font color=${Color.rgb(0, 0, 0)}>Code</font>" +
              "<font color=${Color.rgb(187, 10, 30)} > Red!</font>"
    )
    firebaseAuth = FirebaseAuth.getInstance()

    binding.btnupload.setOnClickListener {
      val campname = binding.admdetcampname.text.toString()
      val date = binding.admdetdate.text.toString()
      val time = binding.admdettime.text.toString()
      val address = binding.admdetaddress.text.toString()
      val organizer = binding.admdetorganizer.text.toString()
      val intent = Intent(this , AdminHomeActivity::class.java)
      startActivity(intent)
      database = FirebaseDatabase.getInstance().getReference("Camp Details")
      val camp = Camp(campname, date, time, address, organizer)
      database.child(campname).setValue(camp).addOnSuccessListener {
        Toast.makeText(this,"Successfully Saved", Toast.LENGTH_SHORT).show()
      }
//        .addOnFailureListener {
//          Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
//        }
    }
  }
}
