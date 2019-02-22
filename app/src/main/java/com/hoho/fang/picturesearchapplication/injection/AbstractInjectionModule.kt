package com.hoho.fang.picturesearchapplication.injection

import com.hoho.fang.picturesearchapplication.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AbstractInjectionModule{

    //Utilize the main activity with all module sub module
    @ContributesAndroidInjector
    abstract fun contributesMainActivityInjector():MainActivity
}