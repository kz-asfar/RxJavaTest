package com.example.rxjavatest.view


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rxjavatest.R
import com.example.rxjavatest.model.MoviesPojo
import com.example.rxjavatest.presenter.Presenter


class MainActivity : AppCompatActivity(), ViewContract {
    lateinit var adapter: CustomAdapter
    lateinit var recyclerView: RecyclerView

    override fun bindPresenter() {
        val presenter = Presenter()
        presenter.bindView(this)
        presenter.initRetrofit()
    }

    override fun initUI() {
        recyclerView = findViewById(R.id.recyclerView)
        adapter = CustomAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onError(errorMessage: String) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show()
    }

    override fun passData(dataSet: ArrayList<MoviesPojo>) {
        adapter.movies = dataSet
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
        bindPresenter()
    }

}
