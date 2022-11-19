package ru.renett.carefully.ui.app

import androidx.navigation.NavHostController
import ru.renett.carefully.ui.navigation.*

class CarefullyAppState(
    val navController: NavHostController,
) {
    // todo: val currentDestination
    fun getCurrentDestination(): Destination? {
        TODO("Not yet implemented")
    }

    val topLevelDestinations: List<TopLevelDestination> = listOf(
        HomeDestination, CalendarDestination, TrackersDestination, SettingsDestination
    )

    var isBottomBarShowed: Boolean = true
}
