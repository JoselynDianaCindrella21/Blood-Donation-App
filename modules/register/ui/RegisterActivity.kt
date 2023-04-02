package com.kindsapplication.app.modules.register.ui

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Html
import android.util.Patterns
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.kindsapplication.app.R
import com.kindsapplication.app.databinding.ActivityRegisterBinding

import com.kindsapplication.app.modules.Signup
import com.kindsapplication.app.modules.login.ui.LoginActivity
import com.kindsapplication.app.modules.userdetails.ui.UserDetailsActivity

class RegisterActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    lateinit var binding: ActivityRegisterBinding
    lateinit var firebaseAuth: FirebaseAuth
    lateinit var textView: TextView
    lateinit var title: TextView
    lateinit var database : DatabaseReference
    super.onCreate(savedInstanceState)
    binding = ActivityRegisterBinding.inflate(layoutInflater)
    setContentView(binding.root)

    title = findViewById(R.id.registerCodeRed)
    title.text = Html.fromHtml(
      "<font color=${Color.rgb(0, 0, 0)}>Code</font>" +
              "<font color=${Color.rgb(187, 10, 30)} > Red!</font>"
    )

    textView=findViewById(R.id.textview5)
    textView.text= Html.fromHtml("<font color=${Color.rgb(0,0,0)}>I already have an account, </font>" +
            "<font color=${Color.rgb(187,10,30)} > Login.</font>")

    textView.setOnClickListener {
      val intent = Intent(this, LoginActivity::class.java)
      // start your next activity
      startActivity(intent)
    }

    firebaseAuth = FirebaseAuth.getInstance()

    binding.btnRegister.setOnClickListener {
      val email = binding.registeremail.text.toString()
      val mnumber = binding.registermnumber.text.toString()
      val password = binding.regidterpassword.text.toString()

      if (validateEmail() as Boolean && validatemnumber() as Boolean && validatePassword() as Boolean){
        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
          if (it.isSuccessful){
            val intent = Intent(this , UserDetailsActivity::class.java)
            startActivity(intent)
            database = FirebaseDatabase.getInstance().getReference("users")
            val Signup = Signup(email, mnumber, password)
            database.child(email).setValue(Signup).addOnSuccessListener {
              Toast.makeText(this,"Successfully Saved",Toast.LENGTH_SHORT).show()
            }
            binding.registeremail.text.clear()
            binding.registermnumber.text.clear()
            binding.registermnumber.text.clear()
          }else{
            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
          }
        }
      }
    }

  }
  private fun validatemnumber() : Any {
    val mobnum = findViewById<EditText>(R.id.registermnumber)
    val num : String = mobnum.text.toString()
    return if (num.isEmpty()) {
      mobnum.error = "Mobile number cannot be empty"
      false
    }
    else if(num.length < 10){
      mobnum.error = "Enter valid mobile number"
      false
    }
    else {
      mobnum.error = null
      true
    }
  }

  private fun validateEmail(): Any {
    val email = findViewById<EditText>(R.id.registeremail)
    val mail: String = email.text.toString()

    return if (mail.isEmpty()) {
      email.error = "Email id cannot be empty"
      false
    }else if(!Patterns.EMAIL_ADDRESS.matcher(mail).matches()){
      email.error = "Invalid Email id"
      false
    }
    else {
      email.error = null
      true
    }
  }

  private fun validatePassword(): Any {
    val password = findViewById<EditText>(R.id.regidterpassword)
    val pass: String = password.text.toString()
    return if (pass.isEmpty()) {
      password.error = "Password cannot be empty"
      false
    }
    else if (pass.length < 8){
      password.error = "Password should contain more than 8 characters"
      false
    }
    else {
      password.error = null
      true
    }
  }

}
