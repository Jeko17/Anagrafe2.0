package com.android.anagrafe20.services

import com.android.anagrafe20.entities.User

interface UserService {

    fun getUser(): List<User>
}