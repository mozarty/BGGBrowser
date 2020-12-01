package com.salem.bggbrowser.model.repository

import com.salem.bggbrowser.model.dto.BGGItemType
import com.salem.bggbrowser.model.dto.BoardGameMetadataDto
import com.salem.bggbrowser.model.dto.BoardGameMetadataList
import com.salem.bggbrowser.model.service.BGGWebService
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class BGGRepository @Inject constructor(
    var remoteSource: BGGWebService
) {
    fun loadHotItems(): Single<BoardGameMetadataList> {
       return remoteSource.topGames(BGGItemType.boardgame)
    }

}