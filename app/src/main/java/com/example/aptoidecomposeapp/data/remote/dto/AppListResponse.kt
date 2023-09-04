package com.example.aptoidecomposeapp.data.remote.dto


import com.example.aptoidecomposeapp.domain.model.AppListModel
import com.google.gson.annotations.SerializedName

data class AppListResponse(

    @SerializedName("graphic")
    val graphic: String,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("rating")
    val rating: Int,

    )

fun AppListResponse.toAppListModel() : AppListModel {
    return AppListModel(
        graphic = graphic,
        icon = icon,
        name = name,
        rating = rating
    )
}