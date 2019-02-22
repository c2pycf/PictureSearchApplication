package com.hoho.fang.picturesearchapplication.injection

import com.hoho.fang.picturesearchapplication.PictureSearchApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidInjectionModule::class,
        AbstractInjectionModule::class,
    ApplicationModule::class]
)
interface ApplicationComponent {
    fun inject(target: PictureSearchApplication)
}