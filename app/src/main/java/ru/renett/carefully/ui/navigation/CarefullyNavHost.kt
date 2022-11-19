package ru.renett.carefully.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import ru.renett.carefully.ui.screen.homeRoute

@Composable
fun CarefullyNavHost(
    navController: NavHostController,
    startDestination: String = homeRoute,
    modifier: Modifier
) {
    NavHost(navController = navController, startDestination = startDestination) {
        homeScreen()
        calendarScreen()
        // todo: nested graph of navigation, pass nav callbacks
        // todo: floating action button
        trackersScreen()
        settingsScreen()
    }
}
