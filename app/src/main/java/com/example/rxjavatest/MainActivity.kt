package com.example.rxjavatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), ViewContract {
    lateinit var adapter: CustomAdapter
    lateinit var recyclerView: RecyclerView

    override fun onError(errorMessage: String) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show()
    }

    override fun passData(dataSet: ArrayList<MoviesPojo>) {
        adapter.movies = dataSet
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        adapter = CustomAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        val network = Network()
        network.initRetrofit(this)
    }


}
