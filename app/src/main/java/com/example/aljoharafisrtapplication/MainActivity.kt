package com.example.aljoharafisrtapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
//just practising (there is nothing related to the project)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val backButton = findViewById<Button>(R.id.buttonme)
        val message = findViewById<TextView>(R.id.message)

        message.text=intent.getStringExtra("name")

    }




    override fun onStart() {
        super.onStart()
        println("*********** Started")
    }

    override fun onResume() {
        super.onResume()
        println("*********** Resumed")
    }

    override fun onPause() {
        super.onPause()
        println("*********** Paused")
    }

    override fun onStop() {
        super.onStop()
        finish()
        println("*********** Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("*********** Destroyed")
    }


    }

