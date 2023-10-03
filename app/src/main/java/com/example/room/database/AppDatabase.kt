package com.example.room.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.room.adapter.ContactDao
import com.example.room.models.Contact

@Database(entities = arrayOf(Contact::class), version = 1)

abstract class AppDatabase: RoomDatabase() {
    //uso de patrón singleton
    abstract fun getDao() : ContactDao
    companion object{
        private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase{
            //se crea la instancia de la base de datos
            if(INSTANCE == null){
                INSTANCE = Room
                    .databaseBuilder(context, AppDatabase::class.java, "mycontact.db")
                    .allowMainThreadQueries()
                    .build()
            }
            //si existe una instancia, se retorna
            return INSTANCE as AppDatabase
        }
    }
}