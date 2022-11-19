package ru.renett.carefully.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

const val calendarRoute = "home"

@Composable
fun CalendarScreen() {
    Column() {
        Text(
            text = "Calendar!",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
    }
}
