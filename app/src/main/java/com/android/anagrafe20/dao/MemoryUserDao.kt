package com.android.anagrafe20.dao

import com.android.anagrafe20.entities.User

class MemoryUserDao: UserDao {

    companion object{
        private val users:MutableList<User> = mutableListOf(
            User(1,"pippo","pippo","pippo","pippo","pippo","pippo")
        )
    }

    override fun addUser(user: User){
        users.add(user)
    }

    override fun removeUser(user: User) {
        users.remove(user)
    }

    override fun getAll(): List<User> = users
}