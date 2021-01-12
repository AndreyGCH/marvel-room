package com.loguito.clase6.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.DividerItemDecoration.VERTICAL
import com.loguito.clase6.R
import com.loguito.clase6.adapters.CharacterAdapter
import com.loguito.clase6.views.viewmodels.FavListViewModel
import kotlinx.android.synthetic.main.fragment_fav_list.*

class FavListFragment : Fragment() {
    private val adapter = CharacterAdapter()
    val viewModel: FavListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fav_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        favRecyclerView.adapter = adapter
        favRecyclerView.addItemDecoration(DividerItemDecoration(requireContext(), VERTICAL))
        viewModel.getAll().observe(viewLifecycleOwner){ character ->
         quantity.text = "CANTIDAD ${character.size}"
            adapter.characters = character
        }



    }

}