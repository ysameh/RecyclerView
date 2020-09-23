package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import models.DataSource

class MainActivity : AppCompatActivity() {
    private lateinit var blogAdapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        addData()
    }
    private fun addData(){
        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)
    }
    private fun initRecyclerView(){
        recycler_view.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            val topSpacingItemDecoration= TopSpacingItemDecoration (padding = 30)
            addItemDecoration(topSpacingItemDecoration)
            blogAdapter = Adapter()
            adapter = blogAdapter
        }

    }
}