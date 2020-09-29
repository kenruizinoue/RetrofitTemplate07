package com.kenruizinoue.retrofittemplate07.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.kenruizinoue.retrofittemplate07.retrofit.GitHubRepos
import com.kenruizinoue.retrofittemplate07.retrofit.Repository
import com.kenruizinoue.retrofittemplate07.retrofit.ServiceBuilder
import kotlinx.coroutines.Dispatchers.IO

class MainViewModel: ViewModel() {
    private val repository: Repository = Repository(ServiceBuilder.getApiService())
    val gitHubRepos: LiveData<GitHubRepos> = liveData(IO) {
        val retrievedData = repository.getGitHubRepos()
        emit(retrievedData)
    }
}