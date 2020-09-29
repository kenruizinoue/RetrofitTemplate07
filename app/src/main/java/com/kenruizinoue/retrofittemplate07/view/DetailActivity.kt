package com.kenruizinoue.retrofittemplate07.view

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.kenruizinoue.retrofittemplate07.R
import com.kenruizinoue.retrofittemplate07.retrofit.GitHubRepo
import com.kenruizinoue.retrofittemplate07.view.Constants.EXTRA_GITHUB_REPO
import kotlinx.android.synthetic.main.activity_detail.*


class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                progressBar.visibility = View.GONE
            }
        }

        val repo: GitHubRepo? = intent.getParcelableExtra(EXTRA_GITHUB_REPO)

        if (repo != null) {
            webView.loadUrl(repo.repoUrl)
            title = repo.repoName
        }
    }
}