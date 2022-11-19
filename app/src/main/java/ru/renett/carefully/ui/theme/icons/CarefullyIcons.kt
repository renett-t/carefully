package ru.renett.carefully.ui.theme.icons

import androidx.annotation.DrawableRes
import ru.renett.carefully.R

object CarefullyIcons {
    val Home = R.drawable.home
    val Settings = R.drawable.settings
    val Trackers = R.drawable.bulb
    val Calendar = R.drawable.calendar
}

sealed class CarefullyIcon {
    class DrawableIcon(@DrawableRes val res: Int) : CarefullyIcon()
}
