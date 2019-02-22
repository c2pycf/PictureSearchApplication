package com.hoho.fang.picturesearchapplication.model

import com.google.gson.annotations.SerializedName

data class PixabayResponse(@SerializedName("hits") val hits : List<PixabayPicture>)