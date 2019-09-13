package com.example.rxjavatest.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rxjavatest.R
import com.example.rxjavatest.model.MoviesPojo
import com.squareup.picasso.Picasso

class CustomAdapter : RecyclerView.Adapter<CustomViewHolder>() {

    var movies = emptyList<MoviesPojo>()
        set(value) {
            notifyDataSetChanged()
            field = value
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_layout, parent, false)
        )
    }

    override fun getItemCount() = movies.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.tvName.text = movies[position].title
        holder.tvRating.text = movies[position].rating.toString()
        holder.tvRelease.text = movies[position].releaseYear.toString()
        holder.tvGenre.text = movies[position].genre.joinToString {
            it}
//        var temp = ""
//        for (item in movies[position].genre)
//            temp = "$item "
//        holder.tvGenre.text = temp
        Picasso.get().load(movies[position].image).into(holder.ivImage)
    }
}