package ru.renett.carefully.ui.app

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.navOptions
import ru.renett.carefully.ui.navigation.*
import ru.renett.carefully.ui.theme.DarkCaribbeanBlue
import ru.renett.carefully.ui.theme.LightCaribbeanBlue
import ru.renett.carefully.ui.theme.icons.CarefullyIcon

@Composable
fun CarefullyBottomBar(
    navController: NavHostController,
    destinations: List<TopLevelDestination>,
    currentDestination: NavDestination?
) {
    NavigationBar {
        // todo: add floating action button
        destinations.forEach { destination ->
            val selected =
                isDestinationSelected(currentDestination, stringResource(id = destination.route))
            NavigationBarItem(
                selected = selected,
                onClick = { navigateToTopLevelDestination(destination, navController) },
                icon = {
                    if (selected) {
                        GetIcon(destination, LightCaribbeanBlue)
                    } else {
                        GetIcon(destination, DarkCaribbeanBlue)
                    }
                },
                label = {
                    Text(text = stringResource(id = destination.titleRes))
                }
            )
        }
    }
}

@Composable
fun GetIcon(destination: TopLevelDestination, tintColor: Color) {
    when (destination.icon) {
        is CarefullyIcon.DrawableIcon ->
            Icon(
                painter = painterResource(destination.icon.res),
                contentDescription = destination.contentDescription,
                tint = tintColor
            )
    }
}

private fun isDestinationSelected(
    navElement: NavDestination?,
    route: String
): Boolean {
    return navElement?.hierarchy?.any() {
        it.route == route
    } ?: false
}

fun navigateToTopLevelDestination(
    destination: TopLevelDestination,
    navController: NavHostController
) {
    val topLevelNavOptions = navOptions {
//        popUpTo(navController.graph.findStartDestination().id) {
//            saveState = true
//        }
        launchSingleTop = true
        restoreState = true
    }

    when (destination) {
        HomeDestination -> navController.navigateToHome(topLevelNavOptions)
        CalendarDestination -> navController.navigateToCalendar(topLevelNavOptions)
        TrackersDestination -> navController.navigateToTrackers(topLevelNavOptions)
        SettingsDestination -> navController.navigateToSettings(topLevelNavOptions)
    }
}
