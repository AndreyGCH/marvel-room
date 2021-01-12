package com.loguito.clase6.adapters

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.loguito.clase6.R
import com.loguito.clase6.viewholders.CharacterViewHolder
import com.loguito.clase6.views.db.Character

class CharacterAdapter() : RecyclerView.Adapter<CharacterViewHolder>() {
    var characters : List<Character> = emptyList()
    set(value){
        field = value
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.character_view_holder, parent,false)
        return CharacterViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(characters[position])
    }

    override fun getItemCount() = characters.size

}