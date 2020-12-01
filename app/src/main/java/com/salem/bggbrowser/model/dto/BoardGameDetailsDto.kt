package com.salem.bggbrowser.model.dto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BoardGameDetailsDto(
    @PrimaryKey val gameID: String
) {

}