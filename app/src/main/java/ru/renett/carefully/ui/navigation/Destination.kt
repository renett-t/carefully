package ru.renett.carefully.ui.navigation

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector
import ru.renett.carefully.R
import ru.renett.carefully.ui.theme.icons.CarefullyIcon
import ru.renett.carefully.ui.theme.icons.CarefullyIcons

sealed class Destination(
    @StringRes val titleRes: Int,
    @StringRes val route: Int,
    val icon: CarefullyIcon,
    val contentDescription: String? = null
)

sealed class TopLevelDestination(
    @StringRes titleRes: Int,
    @StringRes route: Int,
    icon: CarefullyIcon,
    val unselectedIcon: CarefullyIcon,
) : Destination(titleRes, route, icon)

object HomeDestination :
    TopLevelDestination(
        R.string.home_destination,
        R.string.home_route,
        CarefullyIcon.DrawableIcon(CarefullyIcons.Home),
        CarefullyIcon.DrawableIcon(CarefullyIcons.Home)
    )

object CalendarDestination :
    TopLevelDestination(
        R.string.calendar_destination,
        R.string.calendar_route,
        CarefullyIcon.DrawableIcon(CarefullyIcons.Calendar),
        CarefullyIcon.DrawableIcon(CarefullyIcons.Calendar)
    )

object TrackersDestination :
    TopLevelDestination(
        R.string.trackers_destination,
        R.string.trackers_route,
        CarefullyIcon.DrawableIcon(CarefullyIcons.Trackers),
        CarefullyIcon.DrawableIcon(CarefullyIcons.Trackers)
    )

object SettingsDestination :
    TopLevelDestination(
        R.string.settings_destination,
        R.string.settings_route,
        CarefullyIcon.DrawableIcon(CarefullyIcons.Settings),
        CarefullyIcon.DrawableIcon(CarefullyIcons.Settings)
    )
