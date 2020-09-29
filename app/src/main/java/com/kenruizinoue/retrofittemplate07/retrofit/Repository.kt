package com.kenruizinoue.retrofittemplate07.retrofit

class Repository(private val apiService: ApiService) {
    suspend fun getGitHubRepos() =
        apiService.getGitHubRepos("android+language:kotlin", 10)
}