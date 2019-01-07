package com.example.mvvm_example_p.database

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread
import com.example.mvvm_example_p.database.dao.WordDao
import com.example.mvvm_example_p.database.entity.Word

class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()


    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }

}