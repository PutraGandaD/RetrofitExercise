package com.putragandad.retrofitexercise.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.liveData
import androidx.lifecycle.viewmodel.CreationExtras
import com.putragandad.retrofitexercise.repositories.MoviesRepository
import kotlinx.coroutines.Dispatchers

class MoviesViewModel(private val repository: MoviesRepository) : ViewModel() {
    fun getMovieNowPlaying() = liveData(Dispatchers.IO) {
        emit(repository.getMovieNowPlaying())
    }
}