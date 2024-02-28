package com.touchetime.wizard.utils.theme

import androidx.compose.runtime.Composable

object ThemeManager {

    var currentTheme: ThemeType = ThemeType.DARK
        private set

    @Composable
    fun InitializeTheme(themeType: ThemeType?) {
        currentTheme = themeType ?: ThemeType.DARK
    }
}
