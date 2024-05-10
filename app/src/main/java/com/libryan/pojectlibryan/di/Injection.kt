package com.libryan.pojectlibryan.di

import android.content.Context
import com.libryan.pojectlibryan.data.Repository
import com.libryan.pojectlibryan.network.ApiConfig

object Injection {
    fun provideRepository(context: Context): Repository {
        val apiService = ApiConfig.getApiService()
        return Repository.getInstance(apiService)
    }
}