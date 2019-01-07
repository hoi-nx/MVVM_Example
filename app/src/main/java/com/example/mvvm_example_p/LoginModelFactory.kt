package com.example.mvvm_example_p

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.mvvm_example_p.view.callback.LoginResultCallback
import com.example.mvvm_example_p.viewmodel.LoginViewModel


class LoginModelFactory(private val listener:LoginResultCallback):ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(listener)as T
    }

}