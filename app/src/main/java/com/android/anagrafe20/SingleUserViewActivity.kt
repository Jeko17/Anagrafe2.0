package com.android.anagrafe20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SingleUserViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_user_view)

        findViewById<TextView>(R.id.single_user_name).text = intent.getStringExtra("user_name")
        findViewById<TextView>(R.id.single_user_surname).text = intent.getStringExtra("user_surname")
        findViewById<TextView>(R.id.single_user_birthday).text = intent.getStringExtra("user_birthday")
        findViewById<TextView>(R.id.single_user_birthcity).text = intent.getStringExtra("user_birthcity")
        findViewById<TextView>(R.id.single_user_birthprovince).text = intent.getStringExtra("user_birthprovince")
        findViewById<TextView>(R.id.single_user_gender).text = intent.getStringExtra("user_gender")
    }
}