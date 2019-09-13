package com.example.rxjavatest.presenter

import com.example.rxjavatest.model.MoviesPojo
import com.example.rxjavatest.model.Network
import com.example.rxjavatest.view.ViewContract

class Presenter : PresenterContract{
    var view: ViewContract? = null

    override fun onError(errorMessage: String) {
        view!!.onError(errorMessage)
    }

    override fun bindView(viewContract: ViewContract) {
        this.view = viewContract
    }

    override fun unBindView() {
        view = null
    }

    override fun initRetrofit() {
        val network = Network()
        network.initRetrofit(this)
    }

    override fun getDataFromNetwork(dataSet: ArrayList<MoviesPojo>) {
        view?.passData(dataSet)
    }
}