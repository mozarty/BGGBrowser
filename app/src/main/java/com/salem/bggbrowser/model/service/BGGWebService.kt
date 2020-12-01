package com.salem.bggbrowser.model.service

import com.salem.bggbrowser.model.dto.BoardGameDetailsDto
import com.salem.bggbrowser.model.dto.BoardGameMetadataDto
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface BGGWebService {
    @GET("search")
    fun search(@Query("search") keyword: String): Single<List<BoardGameMetadataDto>>

    @GET("game/{gameId}")
    fun getGameDetails(@Path("gameId") gameID: String?): Single<List<BoardGameDetailsDto>>
}