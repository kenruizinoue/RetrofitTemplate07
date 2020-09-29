package com.kenruizinoue.retrofittemplate07.retrofit

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("search/repositories")
    suspend fun getGitHubRepos(
        @Query("q") query: String,
        @Query("per_page") quantity: Int
    ): GitHubRepos
}