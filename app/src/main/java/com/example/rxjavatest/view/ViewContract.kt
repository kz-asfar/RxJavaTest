package com.example.rxjavatest.view

import com.example.rxjavatest.model.MoviesPojo

interface ViewContract {
    fun onError (errorMessage : String)
    fun passData(dataSet : ArrayList<MoviesPojo>)
    fun bindPresenter()
    fun initUI()
}