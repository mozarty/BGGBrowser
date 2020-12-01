package com.salem.bggbrowser.viewmodel

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.salem.bggbrowser.model.dto.BoardGameMetadataDto
import com.salem.bggbrowser.model.repository.BGGRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject


class HomeViewModel @ViewModelInject constructor(
    var repository: BGGRepository
) : ViewModel(), LifecycleObserver {


    private val hotBoardGames = MutableLiveData<List<BoardGameMetadataDto>>()
    fun getHotBoardGames(): LiveData<List<BoardGameMetadataDto>> {
        return hotBoardGames
    }

    init {
        repository.loadHotItems().observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io()).doOnSuccess {
            hotBoardGames.value = it.games
        }.doOnError {
            hotBoardGames.value = emptyList()
        }.subscribe()
    }
}