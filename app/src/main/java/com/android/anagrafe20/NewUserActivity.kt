package com.android.anagrafe20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.android.anagrafe20.dao.MemoryUserDao
import com.android.anagrafe20.entities.User
import java.util.*

class NewUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_user)

        val memory = MemoryUserDao()

        findViewById<Button>(R.id.button_save).setOnClickListener {
            val user = User(memory.getAll().size.toLong()+1,
                findViewById<EditText>(R.id.name_edit).text.toString(),
                findViewById<EditText>(R.id.surname_edit).text.toString(),
                findViewById<EditText>(R.id.birthday_edit).text.toString(),
                findViewById<EditText>(R.id.birthcity_edit).text.toString(),
                findViewById<EditText>(R.id.birthprovince_edit).text.toString(),
                findViewById<EditText>(R.id.gender_edit).text.toString())
            memory.addUser(user)

            Log.d("NewPostActivity", "New Input= ${memory.getAll()}")
            finish()
        }
    }
}