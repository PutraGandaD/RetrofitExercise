package com.putragandad.retrofitexercise.utils

import com.putragandad.retrofitexercise.api.ApiService

class RemoteDataSource(private val apiService: ApiService) {
    suspend fun getMovieNowPlaying() = apiService.getMovieNowPlaying()
}