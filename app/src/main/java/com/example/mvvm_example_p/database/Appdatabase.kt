package com.example.mvvm_example_p.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.example.mvvm_example_p.database.dao.WordDao
import com.example.mvvm_example_p.database.entity.Word

@Database(entities = arrayOf(Word::class), version = 1)
 abstract class Appdatabase : RoomDatabase() {

    abstract fun wordDao(): WordDao

    companion object {
        @Volatile
        private var INSTANCE: Appdatabase? = null

        fun getDatabase(context: Context): Appdatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    Appdatabase::class.java,
                    "Word_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}