package ru.renett.carefully.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

const val trackersRoute = "home"

@Composable
fun TrackersScreen() {
    Column() {
        Text(
            text = "Trackers!",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
    }
}
