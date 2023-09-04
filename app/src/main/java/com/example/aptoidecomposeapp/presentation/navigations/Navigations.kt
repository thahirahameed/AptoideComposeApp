package com.example.aptoidecomposeapp.presentation.navigations

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aptoidecomposeapp.presentation.screens.AppDetailScreen
import com.example.aptoidecomposeapp.presentation.screens.AppListingScreen

@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.AppListingScreen.route
    ) {
        composable(route = Screen.AppListingScreen.route) {

            AppListingScreen(navController)

        }
        composable(route = Screen.AppDetailScreen.route + "/{id}",
            ///arguments = listOf(navArgument("id") { defaultValue = ("123654789").toLong() })
        ) { backStackEntry ->
            val id = backStackEntry.arguments!!.getString("id")?.toLong() ?: 125666666
            val downloads = backStackEntry.arguments!!.getString("size")?.toLong() ?: 125666667
            AppDetailScreen(id = id, navController = navController, downloads = downloads)
        }
    }
}