package ru.renett.carefully.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

const val homeRoute = "home"

@Composable
fun HomeScreen() {
    Column() {
        Text(
            text = "Home!",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
    }
}
