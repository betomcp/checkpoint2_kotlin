package com.first.roberto_porto_rm86750

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.first.roberto_porto_rm86750.MovieList.CREATOR.movieList

class MainActivity : AppCompatActivity() {

    private lateinit var moviesRecyclerView: RecyclerView

//    private val movieList = listOf(
//        Movie("Filme 1", "Filme bom", "166", "ação", "77min", true),
//        Movie("Filme 1", "Filme bom", "166", "ação", "77min", true),
//        Movie("Filme 1", "Filme bom", "166", "ação", "77min", true),
//        Movie("Filme 1", "Filme bom", "166", "ação", "77min", true),
//        Movie("Filme 1", "Filme bom", "166", "ação", "77min", true),
//        Movie("Filme 1", "Filme bom", "166", "ação", "77min", true),
//        Movie("Filme 1", "Filme bom", "166", "ação", "77min", true),
//        Movie("Filme 1", "Filme bom", "166", "ação", "77min", true),
//        Movie("Filme 1", "Filme bom", "166", "ação", "77min", true),
//        Movie("Filme 1", "Filme bom", "166", "ação", "77min", true)
//    )

//    val movieAdapter = MovieAdapter(movieList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moviesRecyclerView = findViewById(R.id.movies_recyclerview)
        moviesRecyclerView.layoutManager = LinearLayoutManager(this)
        moviesRecyclerView.adapter = MovieAdapter(movieList)
    }
}