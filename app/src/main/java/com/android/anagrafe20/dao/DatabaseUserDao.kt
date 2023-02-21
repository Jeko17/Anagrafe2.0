package com.android.anagrafe20.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.android.anagrafe20.entities.User

@Dao
interface DatabaseUserDao: UserDao {

    // Query per il recupero di tutti gli user
    @Query("SELECT * FROM users")
    override fun getAll(): List<User>

    // Query per l'inserimento di un nuovo user
    @Insert
    override fun addUser(user: User)
}