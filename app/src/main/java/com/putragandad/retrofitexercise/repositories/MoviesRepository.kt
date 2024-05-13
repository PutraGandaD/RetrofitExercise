package com.putragandad.retrofitexercise.repositories

import com.putragandad.retrofitexercise.api.ApiService
import com.putragandad.retrofitexercise.utils.RemoteDataSource

class MoviesRepository(private val remoteDataSource: RemoteDataSource) {
    suspend fun getMovieNowPlaying() = remoteDataSource.getMovieNowPlaying()
}