package com.salem.bggbrowser.view.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.salem.bggbrowser.R
import com.salem.bggbrowser.model.dto.BoardGameMetadataDto


class BoardGameGridAdapter(
    context: Context,
    var data: List<BoardGameMetadataDto>
) : RecyclerView.Adapter<BoardGameMetadaViewHolder>() {

    private val mInflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardGameMetadaViewHolder {
        val view: View = mInflater.inflate(R.layout.list_item_metadata_layout, parent, false)
        return BoardGameMetadaViewHolder(view)
    }

    override fun onBindViewHolder(holder: BoardGameMetadaViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.count()
    }
}