package com.kenruizinoue.retrofittemplate07.retrofit

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GitHubRepo(
    @SerializedName("name")
    val repoName: String,
    @SerializedName("html_url")
    val repoUrl: String,
    @SerializedName("description")
    val repoDescription: String
): Parcelable