package com.android.anagrafe20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import com.android.anagrafe20.adapter.UserAdapter
import com.android.anagrafe20.dao.MemoryUserDao

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val memory = MemoryUserDao()
        val list = findViewById<ListView>(R.id.list_user)

        val adapter = UserAdapter(this, memory.getAll())
        list.adapter = adapter

        findViewById<Button>(R.id.new_user).setOnClickListener{
            val intent = Intent(this, NewUserActivity::class.java)
            this.startActivity(intent)
        }
    }
}