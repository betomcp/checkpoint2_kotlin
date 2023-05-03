package com.first.roberto_porto_rm86750

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.first.roberto_porto_rm86750.Movie
import com.first.roberto_porto_rm86750.MovieList
import com.first.roberto_porto_rm86750.R
import com.first.roberto_porto_rm86750.databinding.ActivityMovieDetailsBinding

class MovieDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMovieDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movie = intent.getSerializableExtra("movie") as Movie

        binding.movieNameTextView.text = movie.name
        binding.sinopsisTextView.text = movie.sinopsis
        binding.parentalRatingTextView.text = "Classificação etária: " + movie.parentalRating
        binding.genreTextView.text = "Gênero: " + movie.genre
        binding.durationTextView.text = "Duração: " +  movie.duration
        binding.inTheatersTextView.text = if (movie.inTheaters) "Em cartaz: sim" else "Em cartaz: não"

    }
}
