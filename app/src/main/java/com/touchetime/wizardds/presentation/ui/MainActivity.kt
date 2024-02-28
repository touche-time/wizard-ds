package com.touchetime.wizardds.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.touchetime.wizard.utils.theme.ThemeType
import com.touchetime.wizardds.data.sharedpreferences.WizardSharedPreferences
import com.touchetime.wizardds.presentation.navigation.Actions
import com.touchetime.wizardds.presentation.navigation.NavGraph
import com.touchetime.wizardds.presentation.theme.Theme
import com.touchetime.wizardds.presentation.theme.WizardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val currentThemeUsed = ThemeType.getByName(WizardSharedPreferences(this).theme)
            val theme = remember { mutableStateOf(currentThemeUsed) }

            val navHostController = rememberNavController()
            val actions = remember(navHostController) { Actions(navHostController = navHostController) }

            WizardTheme(
                theme = theme.value,
                content = {
                    Scaffold(
                        containerColor = Theme.colors.backgroundPrimary,
                    ) { _ ->
                        NavGraph(
                            navController = navHostController,
                            actions = actions,
                            updateTheme = {
                                theme.value = it
                            }
                        )
                    }
                }
            )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WizardTheme {
        Greeting("Android")
    }
}
