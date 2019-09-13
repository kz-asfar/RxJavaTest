package com.example.rxjavatest

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val ivImage : ImageView
    val tvName : TextView
    val tvGenre : TextView
    val tvRelease : TextView
    val tvRating : TextView

    init {
        ivImage = itemView.findViewById(R.id.iv_movie_image)
        tvName  = itemView.findViewById(R.id.tv_movie_name)
        tvGenre = itemView.findViewById(R.id.tv_movie_genre)
        tvRelease= itemView.findViewById(R.id.tv_movie_release)
        tvRating = itemView.findViewById(R.id.tv_movie_rating)
    }

    
}