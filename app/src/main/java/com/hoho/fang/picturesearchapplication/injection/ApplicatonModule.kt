package com.hoho.fang.picturesearchapplication.injection

import com.hoho.fang.picturesearchapplication.network.ApiClient
import com.hoho.fang.picturesearchapplication.network.PixabayService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule {
    @Singleton
    @Provides
    fun providePixabayService(): PixabayService {
        return PixabayService.creat()
    }

    @Singleton
    @Provides
    fun provideApiClient(pixabayService: PixabayService): ApiClient{
        return ApiClient(pixabayService)
    }



}