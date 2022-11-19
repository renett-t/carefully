package ru.renett.carefully.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import ru.renett.carefully.ui.screen.*

// todo: maybe split into multiple files like `HomeNavigation`, `SettingsNavigation`, `NoteNavigation`
fun NavGraphBuilder.homeScreen() {
    composable(route = homeRoute) {
        HomeScreen()
    }
}

fun NavController.navigateToHome(navOptions: NavOptions? = null) {
    this.navigate(homeRoute, navOptions)
}


//
fun NavGraphBuilder.calendarScreen() {
    composable(route = calendarRoute) {
        CalendarScreen()
    }
}

fun NavController.navigateToCalendar(navOptions: NavOptions? = null) {
    this.navigate(calendarRoute, navOptions)
}


//
fun NavGraphBuilder.trackersScreen() {
    composable(route = trackersRoute) {
        TrackersScreen()
    }
}

fun NavController.navigateToTrackers(navOptions: NavOptions? = null) {
    this.navigate(trackersRoute, navOptions)
}


//
fun NavGraphBuilder.settingsScreen() {
    composable(route = settingsRoute) {
        SettingsScreen()
    }
}

fun NavController.navigateToSettings(navOptions: NavOptions? = null) {
    this.navigate(settingsRoute, navOptions)
}
