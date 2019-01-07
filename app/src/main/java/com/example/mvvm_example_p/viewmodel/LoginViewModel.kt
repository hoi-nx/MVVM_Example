
package com.example.mvvm_example_p.viewmodel
import android.arch.lifecycle.ViewModel
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.example.mvvm_example_p.view.callback.LoginResultCallback
import com.example.mvvm_example_p.webservices.model.User


class LoginViewModel(private val listener:LoginResultCallback):ViewModel(){

    private val user:User
    init {
        user= User("","")
    }
    //Create function to set Email
    val emailTextWather:TextWatcher
    get() = object :TextWatcher{
        override fun afterTextChanged(s: Editable?) {
            user.setEmail(s.toString())
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        }

    }
    val passTextWather:TextWatcher
        get() = object :TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                user.setPass(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        }

    fun loginClick(v:View){
        if(user.isDataValid){
            listener.onSuccess("Success")
        }else
            listener.onError("Error")
    }
}