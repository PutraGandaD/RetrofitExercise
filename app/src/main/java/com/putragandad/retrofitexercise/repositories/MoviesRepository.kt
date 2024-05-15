package com.putragandad.retrofitexercise.repositories

class MoviesRepository(private val remoteDataSource: RemoteDataSource) {
    suspend fun getMovieNowPlaying() = remoteDataSource.getMovieNowPlaying()
}