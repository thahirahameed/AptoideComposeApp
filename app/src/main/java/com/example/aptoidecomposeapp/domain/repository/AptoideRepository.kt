package com.example.aptoidecomposeapp.domain.repository

import com.example.aptoidecomposeapp.data.responses.AppListResponseDto


interface AptoideRepository {
    suspend fun getAppList() : AppListResponseDto

}