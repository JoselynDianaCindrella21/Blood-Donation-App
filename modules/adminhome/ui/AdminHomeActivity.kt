package com.kindsapplication.app.modules.adminhome.ui

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.kindsapplication.app.R
import com.kindsapplication.app.appcomponents.base.BaseActivity
import com.kindsapplication.app.databinding.ActivityAdminHomeBinding
import com.kindsapplication.app.databinding.ActivityHomeBinding
import com.kindsapplication.app.modules.AdapterClass
import com.kindsapplication.app.modules.Camp
import com.kindsapplication.app.modules.adminblooddetails.ui.AdminBloodDetailsActivity
import com.kindsapplication.app.modules.adminhome.`data`.viewmodel.AdminHomeVM
import com.kindsapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class AdminHomeActivity : AppCompatActivity() {
  lateinit var binding: ActivityAdminHomeBinding
  lateinit var firebaseAuth: FirebaseAuth
  lateinit var userrecyclerView: RecyclerView
  lateinit var userArrayList: ArrayList<Camp>
  lateinit var textView3: TextView
  lateinit var dbref: DatabaseReference
  override fun onCreate(savedInstanceState: Bundle?) {

    super.onCreate(savedInstanceState)
    binding = ActivityAdminHomeBinding.inflate(layoutInflater)
    setContentView(binding.root)

    textView3 = findViewById(R.id.adminhomeCodeRed)
    textView3.text = Html.fromHtml(
      "<font color=${Color.rgb(0, 0, 0)}>Code</font>" +
              "<font color=${Color.rgb(187, 10, 30)} > Red!</font>"
    )
    binding.btnaddcamp.setOnClickListener {
      val intent = Intent(this , AdminBloodDetailsActivity::class.java)
      startActivity(intent)
    }
//    userrecyclerView = findViewById(R.id.recyclerView)
//    userrecyclerView.layoutManager = LinearLayoutManager(this)
//    userrecyclerView.setHasFixedSize(true)
//
//    userArrayList = arrayListOf<Camp>()
//    getdata()
//  }
//
//  private fun getdata() {
//    dbref = FirebaseDatabase.getInstance().getReference("geners")
//    dbref.addValueEventListener(object : ValueEventListener {
//      override fun onDataChange(snapshot: DataSnapshot) {
//        if (snapshot.exists()){
//          for (userSnapshot in snapshot.children){
//            val user = userSnapshot.getValue(Camp::class.java)
//            userArrayList.add(user!!)
//          }
//          userrecyclerView.adapter = AdapterClass(userArrayList)
//        }
//      }
//
//      override fun onCancelled(error: DatabaseError) {
//        TODO("Not yet implemented")
//      }
//
//    })
  }
}
