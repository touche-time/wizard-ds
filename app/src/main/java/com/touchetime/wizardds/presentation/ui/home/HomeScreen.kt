package com.touchetime.wizardds.presentation.ui.home

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
import com.touchetime.wizard.utils.global.WizardGlobalSpacing

@Composable
fun HomeScreen(
    goToButton: () -> Unit,
    goToText: () -> Unit,
    goToLoading: () -> Unit,
    goToTheme: () -> Unit,
) {
    Column(
        modifier = Modifier.padding(WizardGlobalSpacing.middle),
        verticalArrangement = Arrangement.spacedBy(WizardGlobalSpacing.small),
    ) {
        WizardText(
            text = "Components",
            style = WizardTextStyle.DisplayLarge,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )

        WizardButton(
            text = "Button",
            buttonStyle = WizardButtonStyle.PrimarySmallMatchSolid,
            onClick = goToButton,
        )

        WizardButton(
            text = "Text",
            buttonStyle = WizardButtonStyle.PrimarySmallMatchSolid,
            onClick = goToText,
        )

        WizardButton(
            text = "Loading",
            buttonStyle = WizardButtonStyle.PrimarySmallMatchSolid,
            onClick = goToLoading,
        )

        WizardButton(
            text = "Theme",
            buttonStyle = WizardButtonStyle.PrimarySmallMatchSolid,
            onClick = goToTheme,
        )
    }
}
