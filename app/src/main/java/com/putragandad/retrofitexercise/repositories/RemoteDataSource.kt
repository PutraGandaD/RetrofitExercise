package com.putragandad.retrofitexercise.repositories

import com.putragandad.retrofitexercise.api.ApiService

class RemoteDataSource(private val apiService: ApiService) {
    suspend fun getMovieNowPlaying() = apiService.getMovieNowPlaying()
}