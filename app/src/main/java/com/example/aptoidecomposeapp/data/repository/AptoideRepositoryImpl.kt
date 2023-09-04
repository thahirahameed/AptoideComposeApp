package com.example.aptoidecomposeapp.data.repository

import com.example.aptoidecomposeapp.data.AptoideApi
import com.example.aptoidecomposeapp.data.responses.AppListResponseDto
import com.example.aptoidecomposeapp.domain.repository.AptoideRepository
import javax.inject.Inject

class AptoideRepositoryImpl @Inject constructor(
    private val api: AptoideApi
) : AptoideRepository {


    override suspend fun getAppList(): AppListResponseDto {
        return api.getAppList()
    }

}