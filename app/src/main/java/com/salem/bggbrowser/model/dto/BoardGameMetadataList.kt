package com.salem.bggbrowser.model.dto

import com.tickaroo.tikxml.annotation.*

@Xml(name = "items")
data class BoardGameMetadataList(
    @Element var games:List<BoardGameMetadataDto>
)