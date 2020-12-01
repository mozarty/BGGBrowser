package com.salem.bggbrowser.model.service

import com.salem.bggbrowser.model.dto.BGGItemType
import com.salem.bggbrowser.model.dto.BoardGameDetailsDto
import com.salem.bggbrowser.model.dto.BoardGameMetadataDto
import com.salem.bggbrowser.model.dto.BoardGameMetadataList
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface BGGWebService {

    @GET("hot")
    fun topGames(@Query("type") type: BGGItemType): Single<BoardGameMetadataList>

    /*
    @GET("search")
    fun search(@Query("query") keyword: String): Single<List<BoardGameMetadataDto>>

    @GET("thing")
    fun getGameDetails(@Path("id") gameID: String?): Single<List<BoardGameDetailsDto>>*/
}