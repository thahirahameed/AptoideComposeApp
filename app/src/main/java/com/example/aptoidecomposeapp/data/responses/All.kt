package com.example.aptoidecomposeapp.data.responses

import com.google.gson.annotations.SerializedName

data class All(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("info")
    val info: InfoX

)
