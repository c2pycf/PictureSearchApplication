package com.hoho.fang.picturesearchapplication.network

import com.hoho.fang.picturesearchapplication.model.PixabayResponse
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


val apiKey = "11410693-2b49b32a7300281f4e855a267"

interface PixabayService {

    // "." for empty url
    @GET(".")
    fun getPictures(
        @Query("key") apiKey: String,
        @Query("q") searchQuery: String,
        @Query("image_type") imageType: String
    ) : Observable<PixabayResponse>

    companion object Creator {

        fun creat(): PixabayService {

            val retrofit = Retrofit.Builder()
                .baseUrl("https://pixabay.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

            return retrofit.create(PixabayService::class.java)
        }
    }
}