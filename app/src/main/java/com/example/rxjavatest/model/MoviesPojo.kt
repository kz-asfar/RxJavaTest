package com.example.rxjavatest.model

data class MoviesPojo(var title: String,
                      var image: String,
                      var rating: Number,
                      var releaseYear: Int,
                      var genre: ArrayList<String>)