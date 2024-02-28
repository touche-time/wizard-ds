package com.touchetime.wizardds.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalContext
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.touchetime.wizard.utils.colors.WizardColors
import com.touchetime.wizard.utils.colors.WizardThemeColors
import com.touchetime.wizard.utils.theme.ThemeManager
import com.touchetime.wizard.utils.theme.ThemeType
import com.touchetime.wizardds.data.sharedpreferences.WizardSharedPreferences

@Composable
fun WizardDSTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
//    val colorScheme = when {
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }
//
//        darkTheme -> DarkColorScheme
//        else -> LightColorScheme
//    }
//    val view = LocalView.current
//    if (!view.isInEditMode) {
//        SideEffect {
//            val window = (view.context as Activity).window
//            window.statusBarColor = colorScheme.primary.toArgb()
//            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
//        }
//    }

//    MaterialTheme(
//        colorScheme = colorScheme,
//        typography = Typography,
//        content = content,
//    )
}

// TODO: Refactor Theme until here [WE]
@Composable
fun WizardTheme(
    theme: ThemeType? = null,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current

    theme?.let { WizardSharedPreferences(context).theme = it.name }

    val currentThemeUsed = ThemeType.getByName(WizardSharedPreferences(context).theme)

    ThemeManager.InitializeTheme(themeType = currentThemeUsed)

    val systemUiController = rememberSystemUiController()

    SideEffect {
        systemUiController.setStatusBarColor(
            color = WizardColors.colors().backgroundPrimary,
            darkIcons = false
        )
        systemUiController.setNavigationBarColor(
            color = WizardColors.colors().backgroundPrimary,
            darkIcons = false
        )
    }

    CompositionTheme(
        colors = WizardColors.colors(),
        content = content,
    )
}

@Composable
fun CompositionTheme(
    colors: WizardThemeColors,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColors provides colors,
    ) {
        content()
    }
}

internal val LocalColors = staticCompositionLocalOf { WizardColors.colors()  }

object Theme {
    val colors: WizardThemeColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current
}
