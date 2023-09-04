package com.example.aptoidecomposeapp.presentation.state

import com.example.aptoidecomposeapp.data.responses.AppListResponses

data class AppListState(
    val isLoading: Boolean = false,
    val appListing: List<AppListResponses> = emptyList(),
    val error: String = ""
)
