package com.putragandad.retrofitexercise.ui.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.putragandad.retrofitexercise.api.ApiClient
import com.putragandad.retrofitexercise.repositories.MoviesRepository
import com.putragandad.retrofitexercise.utils.RemoteDataSource

class MoviesViewModelFactory(val remoteDataSource: RemoteDataSource) :
    ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: MoviesViewModelFactory? = null

        fun getInstance(context: Context): MoviesViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: MoviesViewModelFactory(
                    RemoteDataSource(ApiClient.apiClient)
                )
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MoviesViewModel::class.java)) {
            return MoviesViewModel(MoviesRepository(remoteDataSource)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}
