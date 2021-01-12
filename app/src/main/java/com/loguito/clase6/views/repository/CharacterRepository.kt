package com.loguito.clase6.views.repository

import com.loguito.clase6.views.db.Character
import com.loguito.clase6.views.db.CharacterDAO
import kotlinx.coroutines.flow.Flow

class CharacterRepository(private val characterDAO: CharacterDAO) {
    suspend fun insert(character:Character){
        characterDAO.insert(character)
    }

    val allCharacter : Flow<List<Character>> = characterDAO.getAll()
}