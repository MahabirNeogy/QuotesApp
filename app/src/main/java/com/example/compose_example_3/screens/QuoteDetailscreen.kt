package com.example.compose_example_3.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_example_3.DataManager
import com.example.compose_example_3.models.Quote

@Composable
fun QuoteDetail(quote:Quote) {

    BackHandler {
        DataManager.switchPages(null)
    }

    Box(modifier = Modifier
        .fillMaxSize(1f)
        .background(
            Brush.sweepGradient(
                colors = listOf(
                    Color(0xFFffffff),
                    Color(0xFFDBDBDB)
                )
            )
        )
    ) {

        Card(
            modifier = Modifier.padding(32.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(16.dp,24.dp)
            ) {
                Image(imageVector = Icons.Filled.Star,
                    contentDescription = "Quote",
                    colorFilter = ColorFilter.tint(Color.Red),
                    alignment = Alignment.BottomStart,
                    modifier = Modifier.size(40.dp)
                )
                Text(text = quote.text,
                    fontWeight = FontWeight.Bold,
                    modifier= Modifier.padding(8.dp,0.dp,0.dp,0.dp),
                    style = MaterialTheme.typography.bodyMedium
                )
                Divider(Modifier.padding(10.dp))
                Text(text = quote.author,
                    modifier= Modifier.padding(8.dp,0.dp,0.dp,0.dp)

                )
            }


        }
    }
}