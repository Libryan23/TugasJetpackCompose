package com.libryan.pojectlibryan.network

import com.libryan.pojectlibryan.model.Anime
import com.libryan.pojectlibryan.model.AnimeList
import com.libryan.pojectlibryan.model.Manga
import com.libryan.pojectlibryan.model.MangaList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("top/anime")
    suspend fun getAnime(
        @Query("filter") filter: String = "airing",
        @Query("sfw") page: Boolean = true,
    ): AnimeList

    @GET("top/manga")
    suspend fun getManga(
        @Query("type") filter: String = "manga",
        @Query("sfw") page: Boolean = true,
    ): MangaList

    @GET("anime/{id}")
    suspend fun getAnimeById(
        @Path("id") id: Int
    ): Anime

    @GET("manga/{id}")
    suspend fun getMangaById(
        @Path("id") id: Int
    ): Manga
}