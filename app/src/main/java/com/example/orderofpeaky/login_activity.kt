package com.example.orderofpeaky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val signupbutton = findViewById<Button>(R.id.signupbutton)

        signupbutton.setOnClickListener{
            val intent = Intent(this,signup_acitivity::class.java)
            startActivity(intent)
        }

    }
}