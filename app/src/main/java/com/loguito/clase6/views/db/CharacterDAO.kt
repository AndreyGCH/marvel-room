package com.loguito.clase6.views.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CharacterDAO {
    @Insert
    suspend fun  insert(character: Character)

    @Query("SELECT * FROM character")
    fun getAll(): Flow<List<Character>>
}