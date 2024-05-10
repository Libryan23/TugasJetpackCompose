package com.libryan.pojectlibryan.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.libryan.pojectlibryan.data.Repository
import com.libryan.pojectlibryan.di.Injection
import com.libryan.pojectlibryan.ui.screen.anime.AnimeViewModel
import com.libryan.pojectlibryan.ui.screen.animedetail.AnimeDetailViewModel
import com.libryan.pojectlibryan.ui.screen.manga.MangaViewModel
import com.libryan.pojectlibryan.ui.screen.mangadetail.MangaDetailViewModel

class ViewModelFactory(private val repository: Repository) :
    ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(AnimeViewModel::class.java) -> {
                AnimeViewModel(repository) as T
            }

            modelClass.isAssignableFrom(MangaViewModel::class.java) -> {
                MangaViewModel(repository) as T
            }

            modelClass.isAssignableFrom(AnimeDetailViewModel::class.java) -> {
                AnimeDetailViewModel(repository) as T
            }

            modelClass.isAssignableFrom(MangaDetailViewModel::class.java) -> {
                MangaDetailViewModel(repository) as T
            }

            else -> throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }

    companion object {
        @Volatile
        private var INSTANCE: ViewModelFactory? = null

        @JvmStatic
        fun getInstance(context: Context): ViewModelFactory {
            if (INSTANCE == null) {
                synchronized(ViewModelFactory::class.java) {
                    INSTANCE = ViewModelFactory(Injection.provideRepository(context))
                }
            }
            return INSTANCE as ViewModelFactory
        }
    }
}