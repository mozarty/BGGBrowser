package com.salem.bggbrowser.model.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.salem.bggbrowser.model.db.dao.BGGDao
import com.salem.bggbrowser.model.dto.BoardGameDetailsDto


@Database(entities = [BoardGameDetailsDto::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun bggDao(): BGGDao
}