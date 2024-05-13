package com.putragandad.retrofitexercise.api

import com.putragandad.retrofitexercise.models.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {
    @GET("movie/now_playing")
    suspend fun getMovieNowPlaying(
        @Header("Authorization") apiKey: String = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI5YTk3NGFmM2ExMmQ0Njg1OGFiMGU1ZDc0OTJlMTM1YyIsInN1YiI6IjY2M2I3NGExMDhiYTI1MWYxODA1YWM0OSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.3jyLfDDr0JOBnvFOGYYTitYLS8Q5vlBqUgGmqVOF6jg"
    ) : MoviesResponse

}