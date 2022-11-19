package ru.renett.carefully

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.renett.carefully.ui.app.CarefullyApp
import ru.renett.carefully.ui.theme.CarefullyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarefullyTheme {
                CarefullyApp()
            }
        }
    }
}
