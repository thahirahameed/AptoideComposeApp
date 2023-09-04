package com.example.aptoidecomposeapp.data.responses

import com.google.gson.annotations.SerializedName

data class AppListResponseDto(
    @SerializedName("responses")
    val responses: Responses,
    @SerializedName("status")
    val status: String
)
