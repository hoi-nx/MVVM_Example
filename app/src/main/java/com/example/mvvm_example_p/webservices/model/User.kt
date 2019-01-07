package com.example.mvvm_example_p.webservices.model

import android.databinding.BaseObservable
import android.text.TextUtils
import android.util.Patterns

class User(private var email:String,private var passWord:String):BaseObservable() {
    val isDataValid:Boolean
    get() = (!TextUtils.isEmpty(getEmail()))&& Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()&& getPassword().length>6

    private fun getPassword(): String {
        return passWord;
    }

    private fun getEmail(): String {
        return email
    }
    fun setEmail(email: String){
        this.email=email;
    }
    fun setPass(passWord: String){
        this.passWord=passWord
    }

}