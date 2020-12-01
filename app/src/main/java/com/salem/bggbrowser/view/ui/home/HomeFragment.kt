package com.salem.bggbrowser.view.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.salem.bggbrowser.R
import com.salem.bggbrowser.model.dto.BoardGameMetadataDto
import com.salem.bggbrowser.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_home.*

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private val homeViewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        shimmerRecyclerView.setLayoutManager(
            GridLayoutManager(requireContext(), 2),
            R.layout.list_item_shimmer_layout
        )

        shimmerRecyclerView.showShimmer()

        homeViewModel.getHotBoardGames()
            .observe(viewLifecycleOwner,
                {
                    if (it.isNotEmpty()) {
                        shimmerRecyclerView.adapter = BoardGameGridAdapter(requireContext(),it)
                        shimmerRecyclerView.hideShimmer()
                    }
                })
    }
}