package com.example.mvvm_example_p.view.callback

interface LoginResultCallback {
    fun onSuccess(message:String)
    fun onError(message: String)
}