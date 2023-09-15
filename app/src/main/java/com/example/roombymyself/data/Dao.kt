package com.example.roombymyself.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@androidx.room.Dao
interface Dao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(nameEntity: NameEntity)
    @Delete
    suspend fun deleteItem(nameEntity: NameEntity)

    @Query("SELECT * FROM NameEntity")
     fun getAllItems():Flow<List<NameEntity>>

}