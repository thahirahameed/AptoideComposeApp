package com.example.aptoidecomposeapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.aptoidecomposeapp.data.responses.AppListResponses

@Composable
fun LocalTopCard(
    appListModel: AppListResponses
) {

    val contentDescription = "${appListModel.name} And the rating is ${appListModel.rating}"
    val title = appListModel.name
    val ratings = appListModel.rating

    Column(
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        Card(
            modifier = Modifier
                .width(150.dp)
                .height(230.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = 5.dp
        ) {

            Box(modifier = Modifier.
            height(220.dp)
            ) {
                Image(
                    painter = rememberAsyncImagePainter(model = appListModel.graphic),
                    contentDescription = contentDescription,
                    modifier = Modifier.size(150.dp),
                    contentScale = ContentScale.Crop,
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 35.dp)
                    .padding(start = 8.dp),
                Alignment.BottomStart
            ) {
                Text(
                    title,
                    modifier = Modifier.clearAndSetSemantics {  },
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    textAlign = TextAlign.Left,
                    maxLines = 1
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
                    .padding(start = 8.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    ratings.toString(),
                    modifier = Modifier.clearAndSetSemantics {  },
                    textAlign = TextAlign.Left,
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}