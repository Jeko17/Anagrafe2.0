package com.android.anagrafe20.entities


data class User(
    val id: Long,
    val name: String,
    val surname:String,
    val birthday: String,
    val birthcity: String,
    val birthprovince: String,
    val gender:String
)