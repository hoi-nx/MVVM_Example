package com.example.mvvm_example.view.activities

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.example.mvvm_example.view.callback.IViewMain

abstract class BaseActivity : AppCompatActivity(), IViewMain {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutMain())
        findViewByIds()
        initData()
        initComponents()
        setEvents()
    }


}