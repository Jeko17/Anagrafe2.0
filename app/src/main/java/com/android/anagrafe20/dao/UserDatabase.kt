package com.android.anagrafe20.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.android.anagrafe20.entities.User

@Database(version = UserDatabase.VERSION,
entities = [User::class])
abstract class UserDatabase: RoomDatabase() {
    companion object{
        const val DATABASE_NAME = "anagrafe"
        const val VERSION = 1
    }

    abstract fun getUserDao(): DatabaseUserDao
}