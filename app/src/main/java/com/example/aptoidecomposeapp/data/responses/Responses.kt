package com.example.aptoidecomposeapp.data.responses

import com.google.gson.annotations.SerializedName

data class Responses(
    @SerializedName("listApps")
    val listApps: ListApps
)
