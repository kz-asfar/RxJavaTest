package com.example.rxjavatest

data class MoviesPojo(var title: String,
                      var image: String,
                      var rating: Number,
                      var releaseYear: Int,
                      var genre: ArrayList<String>)