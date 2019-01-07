package com.example.mvvm_example.view.callback

import android.content.Context
import android.widget.Toast

interface Error {
    fun error(errorCode:Int,context:Context){
        when(errorCode){
            400 -> Toast.makeText(context, "400 Bad Request Error", Toast.LENGTH_LONG).show()
            401 -> Toast.makeText(context, "401 Internal Server Error", Toast.LENGTH_LONG).show()
            404 -> Toast.makeText(context, "404 Internal Server Error", Toast.LENGTH_LONG).show()
            405 -> Toast.makeText(context, "405 Internal Server Error", Toast.LENGTH_LONG).show()
            429 -> Toast.makeText(context, "429 Internal Server Error", Toast.LENGTH_LONG).show()
            500 -> Toast.makeText(context, "500 Internal Server Error", Toast.LENGTH_LONG).show()
        }



    }
}