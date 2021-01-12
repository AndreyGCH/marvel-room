package com.loguito.clase6.viewholders

import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.loguito.clase6.views.db.Character
import com.loguito.clase6.views.viewmodels.FavListViewModel
import kotlinx.android.synthetic.main.character_view_holder.view.*

class CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {



    fun bind(character: Character) {
        itemView.txtId.text = character.id
        itemView.txtName.text = character.name
        itemView.txtDesc.text = character.description
    }
}