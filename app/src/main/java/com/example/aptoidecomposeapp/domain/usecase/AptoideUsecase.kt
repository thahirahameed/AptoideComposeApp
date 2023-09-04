package com.example.aptoidecomposeapp.domain.usecase

import com.example.aptoidecomposeapp.data.responses.AppListResponses
import com.example.aptoidecomposeapp.domain.repository.AptoideRepository
import com.example.aptoidecomposeapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class AptoideUsecase @Inject constructor(
    private val repository: AptoideRepository
) {

    operator fun invoke(): Flow<Resource<List<AppListResponses>>> = flow {
        try {
            emit(Resource.Loading())
            val appList =
                repository.getAppList().responses.listApps.datasets.all.data.list.map { it }
            emit(Resource.Success(appList))
        } catch (e: HttpException) {
            emit(
                Resource.Error<List<AppListResponses>>(
                    e.localizedMessage ?: "An unexpected error occured"
                )
            )
        } catch (e: IOException) {
            emit(Resource.Error<List<AppListResponses>>("Couldn't reach server. Check your internet connection."))
        }
    }
}