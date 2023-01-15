package com.example.aljoharafisrtapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginbutton=findViewById<Button>(R.id.buttonlogin)
        val nametext=findViewById<EditText>(R.id.namelogin)
        val passtext=findViewById<EditText>(R.id.passwordlogin)
        var viewModel=ViewModelProvider(this).get(MainviewModel::class.java)

        loginbutton.setOnClickListener(){
            var username=nametext.text.toString()
            var password=passtext.text.toString()
            if (viewModel.loginpage(username,password).equals(true)){
                    val intent = Intent(applicationContext, messageActivity::class.java)
                    intent.putExtra("username","welcome $username")
                    startActivity(intent)
                }
             else if (viewModel.loginpage(username,password).equals(false)){
                Toast.makeText(applicationContext, "Wrong credentials", Toast.LENGTH_SHORT).show()

            }
        }



        supportActionBar?.hide()
    }
}