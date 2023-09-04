package com.example.aptoidecomposeapp.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.aptoidecomposeapp.presentation.viewmodel.AppDetailViewModel
import com.example.aptoidecomposeapp.ui.theme.lightBlue

@Composable
fun AppDetailScreen(
    navController: NavController,
    viewModel: AppDetailViewModel = hiltViewModel(),
    id: Long,
    downloads : Long
) {
    val state = viewModel.state.value

    val idFromHome = id

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Back") },
                backgroundColor = (lightBlue),
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Navigate to home screen")
                    }
                }
            )
        },
        content = {
            Column(
                Modifier.padding(top = 20.dp)
            ) {


                Text(text = "Id : ${id}")

                Spacer(modifier = Modifier.padding(5.dp))

                Text(text = "Downloads : $downloads")

                val idApp = state.appListing.map {
                    if(idFromHome == it.id){
                        it.downloads.toString()
                    }

                }
                Text(text = "Total Downloads : ${state.appListing.map {

                    it.downloads.toString().plus("")

                }}",Modifier.padding(20.dp))


            }
        },
    )
}