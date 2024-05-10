package com.libryan.pojectlibryan.model

import com.google.gson.annotations.SerializedName

data class Anime(
    @SerializedName("data") val data: AnimeData? = null
)