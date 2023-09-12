package com.example.kotlinmaps.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kotlinmaps.models.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDatabase : RoomDatabase() {
    abstract fun placeDao(): PlaceDao
}