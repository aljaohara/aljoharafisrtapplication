package com.example.aljoharafisrtapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar


class messageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        val masgtoolbarr = findViewById<Toolbar>(R.id.msgtoolbar)
        val msg = findViewById<TextView>(R.id.message)
        msg.text=intent.getStringExtra("username")
        supportActionBar?.hide()

        masgtoolbarr.setNavigationOnClickListener(){
             finish()
        }




    }
}