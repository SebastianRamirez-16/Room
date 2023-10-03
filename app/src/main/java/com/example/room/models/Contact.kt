package com.example.room.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Contact (
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    //usar kebab case para los nombres de las columnas

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "telephone")
    val telephone: String,


)


