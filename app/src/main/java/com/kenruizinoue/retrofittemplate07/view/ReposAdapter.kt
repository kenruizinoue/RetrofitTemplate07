package com.kenruizinoue.retrofittemplate07.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kenruizinoue.retrofittemplate07.R
import com.kenruizinoue.retrofittemplate07.retrofit.GitHubRepo

class ReposAdapter(private val data: List<GitHubRepo>): RecyclerView.Adapter<ReposViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReposViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.item_repo, parent, false)
        return ReposViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: ReposViewHolder, position: Int) {
        val gitHubRepo = data[position]
        holder.bind(gitHubRepo)
    }

    override fun getItemCount(): Int = data.size
}