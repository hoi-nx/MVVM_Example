package com.example.mvvm_example_p.view.activities

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.ActivityCompat.startActivityForResult
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import com.example.mvvm_example.view.activities.BaseActivity
import com.example.mvvm_example_p.R
import com.example.mvvm_example_p.view.adapter.WordListAdapter
import com.example.mvvm_example_p.viewmodel.WordViewModel


class ActivityDemo : BaseActivity() {
    private val newWordActivityRequestCode = 1
    private lateinit var wordViewModel: WordViewModel

    override fun getLayoutMain(): Int {
        return R.layout.activity_test

    }

    override fun findViewByIds() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = WordListAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        //wordViewModel = ViewModelProviders.of(this).get(WordViewModel::class.java)

        //wordViewModel.allWords.observe(this, Observer { words ->
            //  words?.let { adapter.setWords(it) }
        //})
    }

    override fun initComponents() {
    }

    override fun setEvents() {
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            val intent = Intent(this, NewwordActivity::class.java)
            startActivityForResult(intent, newWordActivityRequestCode)
        }


    }

    override fun initData() {
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intentData: Intent?) {
        super.onActivityResult(requestCode, resultCode, intentData)

    }

}