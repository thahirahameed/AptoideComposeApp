package com.example.aptoidecomposeapp.data.responses

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("hidden")
    val hidden: Int,
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("list")
    val list: List<AppListResponses>,
    @SerializedName("next")
    val next: Int,
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("total")
    val total: Int
)
