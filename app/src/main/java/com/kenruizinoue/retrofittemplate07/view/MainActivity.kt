package com.kenruizinoue.retrofittemplate07.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import com.kenruizinoue.retrofittemplate07.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var reposAdapter: ReposAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add division line
        recyclerView.addItemDecoration(
                DividerItemDecoration(
                        recyclerView.context,
                        DividerItemDecoration.VERTICAL
                )
        )

        viewModel.gitHubRepos.observe(this, { repos ->
            reposAdapter = ReposAdapter(repos.items)
            recyclerView.apply {
                adapter = reposAdapter
            }
        })
    }
}