package com.loguito.clase6.views.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import com.loguito.clase6.views.db.Character
import com.loguito.clase6.views.db.CharacterDatabase
import com.loguito.clase6.views.repository.CharacterRepository

class FavListViewModel (application: Application): AndroidViewModel(application){
    private val repository: CharacterRepository
    private val database: CharacterDatabase = CharacterDatabase.getDatabase(application)
    init {
        repository = CharacterRepository(database.characterDAO())
    }

    fun getAll(): LiveData<List<Character>> = repository.allCharacter.asLiveData()
}