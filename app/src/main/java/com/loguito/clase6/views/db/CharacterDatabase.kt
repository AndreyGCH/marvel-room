package com.loguito.clase6.views.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Character::class), version = 1, exportSchema = false)
public abstract class CharacterDatabase: RoomDatabase() {
    abstract fun characterDAO() : CharacterDAO
    companion object{
        @Volatile
        private var INSTANCE: CharacterDatabase? = null

        fun getDatabase(context: Context) : CharacterDatabase{
            return INSTANCE ?: synchronized(this){
                var instance = Room.databaseBuilder(
                    context.applicationContext,
                    CharacterDatabase::class.java,
                    "pokemon_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}