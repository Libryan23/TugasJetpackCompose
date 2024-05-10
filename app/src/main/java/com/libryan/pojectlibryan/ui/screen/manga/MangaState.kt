package com.libryan.pojectlibryan.ui.screen.manga

import com.libryan.pojectlibryan.model.MangaData

data class MangaState(
    val mangaDataList: List<MangaData?> = emptyList(),
)