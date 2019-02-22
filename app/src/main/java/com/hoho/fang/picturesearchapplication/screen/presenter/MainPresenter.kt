package com.hoho.fang.picturesearchapplication.screen.presenter

import android.util.Log
import com.hoho.fang.picturesearchapplication.adapter.PictureRecycleAdapter
import com.hoho.fang.picturesearchapplication.screen.model.MainActivityModel
import com.hoho.fang.picturesearchapplication.screen.view.MainView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainPresenter @Inject constructor(private val model: MainActivityModel){
    private var mainView : MainView? = null
    private var adapter: PictureRecycleAdapter?=null
    private var pictureDisposable : Disposable? = null

    fun attachView(view: MainView){
        this.mainView = mainView
    }

    fun create(){

    }

    private fun search(){

        pictureDisposable = model.loadPictures()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe ( {piaxabayRespons ->
                Log.i("Main","Success")
                //set adapter
            },{ error ->
                Log.i("Main","Error")
            } )
    }
}