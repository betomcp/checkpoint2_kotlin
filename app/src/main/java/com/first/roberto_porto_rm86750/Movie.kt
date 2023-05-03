package com.first.roberto_porto_rm86750

import java.io.Serializable

data class Movie(
    val name: String,
    val sinopsis: String,
    val parentalRating: String,
    val genre: String,
    val duration: String,
    val inTheaters: Boolean
) : Serializable {

}
