package com.libryan.pojectlibryan.model

import com.google.gson.annotations.SerializedName

data class Manga(
    @SerializedName("data") val data: MangaData? = null
)