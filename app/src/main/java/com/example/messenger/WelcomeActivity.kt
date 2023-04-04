package com.example.messenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class WelcomeActivity : AppCompatActivity() {

    var firebaseUser: FirebaseUser? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val RegisterWelcome: Button = findViewById(R.id.register_welcome_btn)
        val LoginWelcome: Button = findViewById(R.id.login_welcome_btn)
        RegisterWelcome.setOnClickListener {
            val intent = Intent(this@WelcomeActivity, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

        LoginWelcome.setOnClickListener {
            val intent = Intent(this@WelcomeActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onStart() {
        super.onStart()

      //  firebaseUser= FirebaseAuth.getInstance().currentUser

       // if(firebaseUser != null)
       // {
         //   val intent = Intent(this@WelcomeActivity, MainActivity::class.java)
           // startActivity(intent)
            //finish()
       // }
    }
}