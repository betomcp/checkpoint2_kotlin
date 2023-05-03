package com.first.roberto_porto_rm86750

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val movies: List<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_item, parent, false)

        val viewHolder = MovieViewHolder(view)

        view.setOnClickListener {
            val movie = movies[viewHolder.adapterPosition]
            val intent = Intent(view.context, MovieDetailsActivity::class.java)
            intent.putExtra("movie", movie)
            view.context.startActivity(intent)
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val movieNameTextView: TextView = itemView.findViewById(R.id.movie_name_textview)

        fun bind(movie: Movie) {
            movieNameTextView.text = movie.name
        }
    }
}
