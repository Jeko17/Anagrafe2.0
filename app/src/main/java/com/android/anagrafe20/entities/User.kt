package com.android.anagrafe20.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "users")
data class User(
    @PrimaryKey
    val id: Long,
    val name: String,
    val surname:String,
    val birthday: String,
    val birthcity: String,
    val birthprovince: String,
    val gender:String
)