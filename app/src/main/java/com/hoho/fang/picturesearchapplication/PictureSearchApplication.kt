package com.hoho.fang.picturesearchapplication

import android.app.Activity
import android.app.Application
import com.hoho.fang.picturesearchapplication.injection.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

//HasActivityInject, HasServiceInject, HasFragmentInject, HasBroadcastInject
class PictureSearchApplication : Application(),HasActivityInjector{

    //cant be private
    @Inject lateinit var  dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>
    override fun onCreate() {
        super.onCreate()

        DaggerApplicationComponent.builder()
            .build()
            .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }
}