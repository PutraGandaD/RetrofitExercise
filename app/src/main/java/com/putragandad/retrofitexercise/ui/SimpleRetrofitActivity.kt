package com.putragandad.retrofitexercise.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.putragandad.retrofitexercise.R
import com.putragandad.retrofitexercise.ui.viewmodels.MoviesViewModel
import com.putragandad.retrofitexercise.ui.viewmodels.MoviesViewModelFactory

class SimpleRetrofitActivity : AppCompatActivity() {
    private val viewModel : MoviesViewModel by viewModels {
       MoviesViewModelFactory.getInstance(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getMovieNowPlaying().observe(this) { movies ->
            val result = movies.results
            Log.d("Result", "$result")
        }
    }
}