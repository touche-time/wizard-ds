package com.touchetime.wizardds.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.touchetime.wizard.utils.theme.ThemeType
import com.touchetime.wizardds.presentation.ui.button.ButtonScreen
import com.touchetime.wizardds.presentation.ui.home.HomeScreen
import com.touchetime.wizardds.presentation.ui.loading.LoadingScreen
import com.touchetime.wizardds.presentation.ui.text.TextScreen
import com.touchetime.wizardds.presentation.ui.theme.ThemeScreen

@Composable
fun NavGraph(navController: NavHostController, actions: Actions, updateTheme: (ThemeType) -> Unit) {
    NavHost(
        navController = navController,
        startDestination = Route.Home.route,
    ) {
        composable(route = Route.Button.route) {
            ButtonScreen()
        }

        composable(route = Route.Home.route) {
            HomeScreen(
                goToButton = actions.goToButton,
                goToText = actions.goToText,
                goToLoading = actions.goToLoading,
                goToTheme = actions.goToTheme
            )
        }

        composable(route = Route.Text.route) {
            TextScreen()
        }

        composable(route = Route.Loading.route) {
            LoadingScreen()
        }

        composable(route = Route.Theme.route) {
            ThemeScreen(updateTheme = updateTheme)
        }
    }
}
