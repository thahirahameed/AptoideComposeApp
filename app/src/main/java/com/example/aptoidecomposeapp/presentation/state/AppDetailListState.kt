package com.example.aptoidecomposeapp.presentation.state

import com.example.aptoidecomposeapp.data.responses.AppListResponses

data class AppDetailListState(
    val isLoading: Boolean = false,
    val appListing: AppListResponses? = null,
    val error: String = ""
)
