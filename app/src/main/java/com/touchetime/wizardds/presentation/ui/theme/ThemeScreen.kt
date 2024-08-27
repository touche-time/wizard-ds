package com.touchetime.wizardds.presentation.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.touchetime.wizard.components.button.WizardButton
import com.touchetime.wizard.components.button.WizardButtonStyle
import com.touchetime.wizard.components.text.WizardText
import com.touchetime.wizard.components.text.WizardTextStyle
import com.touchetime.wizard.utils.colors.WizardColors
import com.touchetime.wizard.utils.global.WizardGlobalSpacing
import com.touchetime.wizard.utils.theme.ThemeType

@Composable
fun ThemeScreen(updateTheme: (ThemeType) -> Unit) {
    Column(
        modifier = Modifier.padding(WizardGlobalSpacing.middle),
        verticalArrangement = Arrangement.spacedBy(WizardGlobalSpacing.small),
    ) {
        WizardText(
            text = "Themes",
            textColor = WizardColors.colors().contentPrimary,
            style = WizardTextStyle.primaryHeadingMiddleBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )

        WizardButton(
            text = "Dark",
            buttonStyle = WizardButtonStyle.PrimarySolid,
            onClick = { updateTheme(ThemeType.DARK) },
        )

        WizardButton(
            text = "Light",
            buttonStyle = WizardButtonStyle.PrimarySolid,
            onClick = { updateTheme(ThemeType.LIGHT) },
        )
    }
}
