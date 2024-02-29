package com.example.compose_example_3.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.compose_example_3.models.Quote

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: (quote:Quote)->Unit){
    Column() {
        Text(text = "Quotes App")
        QuoteList(data = data, onClick)
    }
}