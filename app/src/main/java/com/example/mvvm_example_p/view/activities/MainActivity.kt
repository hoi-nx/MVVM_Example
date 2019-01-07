package com.example.mvvm_example.view.activities


import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.widget.Toast
import com.example.mvvm_example_p.LoginModelFactory
import com.example.mvvm_example_p.R
import com.example.mvvm_example_p.databinding.ActivityMainBinding
import com.example.mvvm_example_p.view.activities.ActivityDemo
import com.example.mvvm_example_p.view.callback.LoginResultCallback
import com.example.mvvm_example_p.viewmodel.LoginViewModel
import es.dmoral.toasty.Toasty


class MainActivity : BaseActivity(), LoginResultCallback {


    override fun onSuccess(message: String) {
        Toasty.info(this, message, Toast.LENGTH_LONG).show()
        val intent = Intent(this, ActivityDemo::class.java)
        startActivity(intent)
    }

    override fun onError(message: String) {
        Toasty.error(this, message, Toast.LENGTH_LONG).show()
    }

    override fun getLayoutMain(): Int {
        return R.layout.activity_main
    }

    override fun findViewByIds() {
    }

    override fun initComponents() {
        val activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        activityMainBinding.viewModel =
                ViewModelProviders.of(this, LoginModelFactory(this)).get(LoginViewModel::class.java);
    }

    override fun setEvents() {

    }

    override fun initData() {
    }

}
