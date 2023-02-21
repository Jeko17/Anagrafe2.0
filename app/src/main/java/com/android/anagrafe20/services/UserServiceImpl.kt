package com.android.anagrafe20.services

import com.android.anagrafe20.dao.UserDao
import com.android.anagrafe20.entities.User

class UserServiceImpl(private val userDao: UserDao):UserService {
    override fun getUser(): List<User> = userDao.getAll().sortedBy { p -> p.name }
}