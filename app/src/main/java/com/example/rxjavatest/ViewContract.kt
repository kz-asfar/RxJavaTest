package com.example.rxjavatest

interface ViewContract {
    fun onError (errorMessage : String)
    fun passData(dataSet : ArrayList<MoviesPojo>)
}