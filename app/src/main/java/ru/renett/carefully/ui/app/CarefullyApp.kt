package ru.renett.carefully.ui.app

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import ru.renett.carefully.ui.navigation.CarefullyNavHost
import ru.renett.carefully.ui.navigation.Destination

@Composable
fun CarefullyApp() {
    val appState = CarefullyAppState(
        navController = rememberNavController()
    )

    Scaffold(
        modifier = Modifier,
        topBar = {
            val currentDestination: Destination? = appState.getCurrentDestination()

            if (currentDestination != null) {
                CarefullyTopAppBar(
                    titleRes = currentDestination.titleRes,
                    actions = listOf(),
                    isNavigationIconEnabled = false,
                    navigationAction = null
                )
            }
        },
        bottomBar = {
            if (appState.isBottomBarShowed) {
                val navBackStackEntry by appState.navController
                    .currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                CarefullyBottomBar(
                    navController = appState.navController,
                    destinations = appState.topLevelDestinations,
                    currentDestination = currentDestination
                )
            }
        }
    ) { padding ->

        CarefullyNavHost(
            navController = appState.navController,
            modifier = Modifier
                .padding(padding)
//                .consumedWindowInsets(padding)
        )
    }

}
