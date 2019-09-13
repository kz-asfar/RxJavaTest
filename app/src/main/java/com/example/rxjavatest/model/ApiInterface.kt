package com.example.rxjavatest.model

import com.example.rxjavatest.model.MoviesPojo
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiInterface {
    //https://api.androidhive.info/json/movies.json
    @GET("movies.json")
    fun getMovies() : Observable<ArrayList<MoviesPojo>>

}