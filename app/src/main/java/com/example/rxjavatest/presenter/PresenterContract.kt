package com.example.rxjavatest.presenter

import com.example.rxjavatest.model.MoviesPojo
import com.example.rxjavatest.view.ViewContract

interface PresenterContract {
    fun bindView(viewContract: ViewContract)
    fun unBindView()
    fun initRetrofit()
    fun getDataFromNetwork(dataSet: ArrayList<MoviesPojo>)
    fun onError(errorMessage: String)
}