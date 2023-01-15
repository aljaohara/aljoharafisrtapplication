package com.example.aljoharafisrtapplication
import android.content.Intent
import android.widget.Toast
import androidx.lifecycle.ViewModel


class MainviewModel: ViewModel() {

    var realname="aljohara"
    private set
    var realpass="jejeee"
    private set


    fun loginpage(username: String, password:String): Boolean {
        if( username==realname.toString()&&password==realpass.toString()&&password.length>5) {
            return true
        }
        else {
            return false
        }
    }


}