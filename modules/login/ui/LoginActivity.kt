package com.kindsapplication.app.modules.login.ui

import androidx.activity.viewModels
import com.kindsapplication.app.R
import com.kindsapplication.app.appcomponents.base.BaseActivity
import com.kindsapplication.app.databinding.ActivityLoginBinding
import com.kindsapplication.app.modules.login.`data`.viewmodel.LoginVM
import kotlin.String
import kotlin.Unit
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.text.method.PasswordTransformationMethod
import android.util.Patterns
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.kindsapplication.app.modules.adminhome.ui.AdminHomeActivity
import com.kindsapplication.app.modules.home.ui.HomeActivity
import com.kindsapplication.app.modules.register.ui.RegisterActivity
import com.kindsapplication.app.modules.userdetails.ui.UserDetailsActivity


class LoginActivity  : AppCompatActivity() {


  override fun onCreate(savedInstanceState: Bundle?) {
    lateinit var firebaseAuth: FirebaseAuth
    lateinit var textView: TextView
    lateinit var textView1: TextView
    super.onCreate(savedInstanceState)
    var binding: ActivityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
    setContentView(binding.root)

    textView1 = findViewById(R.id.loginCodeRed)
    textView1.text = Html.fromHtml(
      "<font color=${Color.rgb(0, 0, 0)}>Code</font>" +
              "<font color=${Color.rgb(187, 10, 30)} > Red!</font>"
    )

    textView = findViewById(R.id.textView6)
    textView.text = Html.fromHtml(
      "<font color=${Color.rgb(0, 0, 0)}>Don't have an account? </font>" +
              "<font color=${Color.rgb(187, 10, 30)} > Register</font>"
    )

    textView.setOnClickListener {
      val intent = Intent(this, RegisterActivity::class.java)
      // start your next activity
      startActivity(intent)
    }

    firebaseAuth = FirebaseAuth.getInstance()

    binding.btnLogin.setOnClickListener {
      val email = binding.loginemail.text.toString()
      val password = binding.loginpassword.text.toString()
      validatePassword()
      validateEmail()
      if (email.isNotEmpty() && password.isNotEmpty()) {

        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
          if (it.isSuccessful) {
            if(email == "codered9192@gmail.com" && password == "coderedadmin"){
              val intent = Intent(this, AdminHomeActivity::class.java)
              startActivity(intent)
            }
            else{
              val intent = Intent(this, HomeActivity::class.java)
              startActivity(intent)
            }

            binding.loginemail.text.clear()
            binding.loginpassword.text.clear()
          } else {
            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
          }
        }
      } else {
        Toast.makeText(this, "Empty fields are not allowed", Toast.LENGTH_SHORT).show()
      }
    }

  }
  private fun validateEmail(): Any {
    val password = findViewById<EditText>(R.id.loginpassword)
    val pass: String = password.text.toString()
    return if (pass.isEmpty()) {
      password.error = "Password cannot be empty"
      false
    }
    else {
      password.error = null
      true
    }
  }

  private fun validatePassword():Any {
    val email = findViewById<EditText>(R.id.loginemail)
    val mail: String = email.text.toString()
    return if (mail.isEmpty()) {
      email.error = "Email id cannot be empty"
      false
    }else if(!Patterns.EMAIL_ADDRESS.matcher(mail).matches()){
      email.setError("Invalid Email id")
    }
    else {
      email.error = null
      true
    }
  }


}
