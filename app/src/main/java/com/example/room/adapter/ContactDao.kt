package com.example.room.adapter

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.room.models.Contact

@Dao
interface ContactDao {
    //Room trabaja con List y cursores, no con ArrayList

    @Query("SELECT * FROM Contact")
    fun getAll(): List<Contact>

    @Insert
    fun insertContact(vararg contact: Contact)

    @Delete
    fun deleteContact(vararg contact: Contact)

    @Update
    fun updateContact(vararg contact: Contact)

}