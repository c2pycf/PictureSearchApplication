package com.hoho.fang.picturesearchapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.hoho.fang.picturesearchapplication.model.PixabayResponse
import com.hoho.fang.picturesearchapplication.network.ApiClient
import com.hoho.fang.picturesearchapplication.screen.presenter.MainPresenter
import com.hoho.fang.picturesearchapplication.screen.view.MainView
import dagger.android.AndroidInjection
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class MainActivity : AppCompatActivity() ,MainView{

    @Inject
    lateinit var apiClient: ApiClient
    @Inject
    lateinit var mPresenter: MainPresenter
    var mRecycleView : RecyclerView? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        //Inject module to activity class
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecycleView = findViewById(R.id.recycle)

        mPresenter.attachView(this)




    }

    override fun setAdapter() {

    }

}
