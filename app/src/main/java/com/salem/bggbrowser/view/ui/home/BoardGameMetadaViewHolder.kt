package com.salem.bggbrowser.view.ui.home

import android.view.View

import kotlinx.android.synthetic.main.list_item_metadata_layout.*
import androidx.recyclerview.widget.RecyclerView
import com.salem.bggbrowser.model.dto.BoardGameMetadataDto
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.list_item_metadata_layout.view.*

class BoardGameMetadaViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView),
    View.OnClickListener, LayoutContainer {

    override val containerView: View
        get() = itemView

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

    fun bind(boardGameMetadataDto: BoardGameMetadataDto) {
        itemView.gameTitle.text = boardGameMetadataDto.name
    }


}
