package com.hoho.fang.picturesearchapplication.screen.model

import com.hoho.fang.picturesearchapplication.model.PixabayPicture
import com.hoho.fang.picturesearchapplication.model.PixabayResponse
import com.hoho.fang.picturesearchapplication.network.ApiClient
import io.reactivex.Observable
import javax.inject.Inject

class MainActivityModel @Inject constructor(private val apiClient: ApiClient){

    fun loadPictures() : Observable<List<PixabayPicture>> {
        return apiClient.getPicture("flower").map { it.hits }
    }

}