package com.example.aptoidecomposeapp.data.responses

import com.google.gson.annotations.SerializedName

data class InfoX(
    @SerializedName("status")
    val status: String,
    @SerializedName("time")
    val time: Time
)
