package com.touchetime.wizardds.presentation.navigation

import com.touchetime.wizardds.utils.BUTTON_SCREEN
import com.touchetime.wizardds.utils.HOME_SCREEN
import com.touchetime.wizardds.utils.LOADING_SCREEN
import com.touchetime.wizardds.utils.TEXT_SCREEN
import com.touchetime.wizardds.utils.THEME_SCREEN

sealed class Route(val route: String) {
    object Button : Route(BUTTON_SCREEN)

    object Home : Route(HOME_SCREEN)

    object Text : Route(TEXT_SCREEN)

    object Loading : Route(LOADING_SCREEN)

    object Theme : Route(THEME_SCREEN)
}
