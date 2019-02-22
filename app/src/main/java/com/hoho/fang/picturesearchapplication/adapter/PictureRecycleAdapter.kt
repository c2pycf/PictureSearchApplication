package com.hoho.fang.picturesearchapplication.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.hoho.fang.picturesearchapplication.R
import com.hoho.fang.picturesearchapplication.model.PixabayPicture

class PictureRecycleAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var pictures : List<PixabayPicture>?=null

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(p0.context).inflate(R.layout.item_picture,p0,false)
        return PictureViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pictures?.size?:0
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        //Glide
        Glide.with(p0.itemView.context)
            .load(pictures[p1].previewUrl)
    }

    class PictureViewHolder(v: View) : RecyclerView.ViewHolder(v){
        val image :ImageView = v.findViewById(R.id.image)

    }


    fun loadPictures(pictures : List<PixabayPicture>){
        this.pictures = pictures
        notifyDataSetChanged()
    }
}