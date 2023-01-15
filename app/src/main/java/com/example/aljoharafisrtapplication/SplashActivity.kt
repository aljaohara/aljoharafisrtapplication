package com.example.aljoharafisrtapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider



class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val layoute=findViewById<LinearLayout>(R.id.layoutt)
        supportActionBar?.hide()
        val viewModel= ViewModelProvider(this)[MainviewModel::class.java]
        layoute.setOnLongClickListener(){
            val intent= Intent(this,loginActivity::class.java)
            startActivity(intent)
            true
        }
    }
}