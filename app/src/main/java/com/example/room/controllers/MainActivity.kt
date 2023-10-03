package com.example.room.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.room.R
import com.example.room.adapter.ContactAdapter
import com.example.room.database.AppDatabase
import com.example.room.models.Contact

class MainActivity : AppCompatActivity() {

    lateinit var contacts: List<Contact>
    lateinit var contactAdapter: ContactAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadContacts()
    }

    private fun loadContacts() {
        contacts = AppDatabase.getInstance(this).getDao().getAll()
    }
}