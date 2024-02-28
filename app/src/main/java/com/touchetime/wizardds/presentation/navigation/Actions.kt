package com.touchetime.wizardds.presentation.navigation

import androidx.navigation.NavHostController

class Actions(navHostController: NavHostController) {

    val navigateBack: () -> Unit = {
        navHostController.navigateUp()
    }

    val goToButton: () -> Unit = {
        navHostController.navigate(Route.Button.route)
    }

    val goToText: () -> Unit = {
        navHostController.navigate(Route.Text.route)
    }

    val goToLoading: () -> Unit = {
        navHostController.navigate(Route.Loading.route)
    }

    val goToTheme: () -> Unit = {
        navHostController.navigate(Route.Theme.route)
    }
}
