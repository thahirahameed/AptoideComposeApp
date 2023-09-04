package com.example.aptoidecomposeapp.data

import com.example.aptoidecomposeapp.data.responses.AppListResponseDto
import retrofit2.http.GET

interface AptoideApi {

    @GET("api/6/bulkRequest/api_list/listApps")
    suspend fun getAppList() : AppListResponseDto

    //http://ws2.aptoide.com/api/6/bulkRequest/api_list/listApps
}