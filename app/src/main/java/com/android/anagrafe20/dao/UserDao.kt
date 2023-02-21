package com.android.anagrafe20.dao

import com.android.anagrafe20.entities.User

interface UserDao {

    fun getAll(): List<User>

    fun addUser(user: User)

    fun removeUser(user: User)

}