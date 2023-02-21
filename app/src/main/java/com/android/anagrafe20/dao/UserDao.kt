package com.android.anagrafe20.dao

import com.android.anagrafe20.entities.User

interface UserDao {

    // Funzione che prende tutti gli user
    fun getAll(): List<User>

    // Funzione per aggiungere un user
    fun addUser(user: User)

    // Funzione per rimuovere un user
    fun removeUser(user: User)

}