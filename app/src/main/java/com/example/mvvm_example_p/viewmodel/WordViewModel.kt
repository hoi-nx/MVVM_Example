package com.example.mvvm_example_p.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.example.mvvm_example_p.database.WordRepository
import com.example.mvvm_example_p.database.Appdatabase
import com.example.mvvm_example_p.database.entity.Word

class WordViewModel(application: Application) : AndroidViewModel(application){
    private val repository: WordRepository
    val allWords: LiveData<List<Word>>

    init {
        val wordsDao = Appdatabase.getDatabase(application).wordDao()
        repository = WordRepository(wordsDao)
        allWords = repository.allWords
    }
    override fun onCleared() {
        super.onCleared()
    }
}