package com.hoho.fang.picturesearchapplication.network

import android.app.DownloadManager
import com.hoho.fang.picturesearchapplication.model.PixabayResponse
import io.reactivex.Observable

class ApiClient(private val pixabayService: PixabayService){

    private val apiKey = "11410693-2b49b32a7300281f4e855a267"
    private val imageType = "photo"

    fun getPicture(searchQuery: String) : Observable<PixabayResponse>{
        return pixabayService.getPictures(apiKey,searchQuery,imageType)
    }
}