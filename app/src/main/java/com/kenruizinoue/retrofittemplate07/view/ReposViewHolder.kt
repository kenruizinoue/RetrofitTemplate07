package com.kenruizinoue.retrofittemplate07.view

import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kenruizinoue.retrofittemplate07.R
import com.kenruizinoue.retrofittemplate07.retrofit.GitHubRepo
import com.kenruizinoue.retrofittemplate07.view.Constants.EXTRA_GITHUB_REPO

class ReposViewHolder(inflatedView: View):
    RecyclerView.ViewHolder(inflatedView), View.OnClickListener {

    private lateinit var repo: GitHubRepo

    init {
        inflatedView.setOnClickListener(this)
    }

    private val repoNameTextView: TextView = itemView.findViewById(R.id.repoNameTextView)
    private val repoDescriptionTextView: TextView = itemView.findViewById(R.id.repoDescriptionTextView)

    fun bind(repo: GitHubRepo) {
        this.repo = repo
        repoNameTextView.text = repo.repoName
        repoDescriptionTextView.text = repo.repoDescription
    }

    override fun onClick(v: View) {
        val showDetailIntent = Intent(itemView.context, DetailActivity::class.java)
        showDetailIntent.putExtra(EXTRA_GITHUB_REPO, repo)
        itemView.context.startActivity(showDetailIntent)
    }
}