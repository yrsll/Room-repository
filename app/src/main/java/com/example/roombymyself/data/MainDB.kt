package com.example.roombymyself.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [NameEntity::class], version = 1)

abstract class MainDB: RoomDatabase()  {
    abstract val dao:Dao
    companion object{
        fun createDatabase(context: Context):MainDB {
            return Room.databaseBuilder(context,MainDB::class.java,"test.db").build()
        }
    }
}