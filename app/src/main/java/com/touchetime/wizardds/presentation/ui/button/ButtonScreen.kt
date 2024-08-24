package com.touchetime.wizardds.presentation.ui.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.touchetime.wizard.components.button.WizardButton
import com.touchetime.wizard.components.button.WizardButtonStyle
import com.touchetime.wizard.components.text.WizardText
import com.touchetime.wizard.components.text.WizardTextStyle
import com.touchetime.wizard.utils.global.WizardGlobalSpacing

@Composable
fun ButtonScreen() {
    val verticalScroll = rememberScrollState()

    Column(
        modifier = Modifier.padding(WizardGlobalSpacing.middle).verticalScroll(verticalScroll),
        verticalArrangement = Arrangement.spacedBy(WizardGlobalSpacing.small),
    ) {
        WizardText(
            text = "Buttons",
            style = WizardTextStyle.displayLarge,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )

        // Region Primary
        WizardButton(
            text = "Primary Solid Enabled",
            buttonStyle = WizardButtonStyle.PrimarySolid,
            onClick = {},
        )

        WizardButton(
            text = "Primary Solid Disabled",
            buttonStyle = WizardButtonStyle.PrimarySolid,
            enabled = false,
            onClick = {},
        )

        WizardButton(
            text = "Primary Light Enabled",
            buttonStyle = WizardButtonStyle.PrimaryLight,
            onClick = {},
        )

        WizardButton(
            text = "Primary Light Disabled",
            buttonStyle = WizardButtonStyle.PrimaryLight,
            enabled = false,
            onClick = {},
        )

        WizardButton(
            text = "Primary Outlined Enabled",
            buttonStyle = WizardButtonStyle.PrimaryOutlined,
            onClick = {},
        )

        WizardButton(
            text = "Primary Outlined Disabled",
            buttonStyle = WizardButtonStyle.PrimaryOutlined,
            enabled = false,
            onClick = {},
        )

        WizardButton(
            text = "Primary Ghost Enabled",
            buttonStyle = WizardButtonStyle.PrimaryGhost,
            onClick = {},
        )

        WizardButton(
            text = "Primary Ghost Disabled",
            buttonStyle = WizardButtonStyle.PrimaryGhost,
            enabled = false,
            onClick = {},
        )

        // Region Neutral
        WizardButton(
            text = "Neutral Solid Enabled",
            buttonStyle = WizardButtonStyle.NeutralSolid,
            onClick = {},
        )

        WizardButton(
            text = "Neutral Solid Disabled",
            buttonStyle = WizardButtonStyle.NeutralSolid,
            enabled = false,
            onClick = {},
        )

        WizardButton(
            text = "Neutral Light Enabled",
            buttonStyle = WizardButtonStyle.NeutralLight,
            onClick = {},
        )

        WizardButton(
            text = "Neutral Light Disabled",
            buttonStyle = WizardButtonStyle.NeutralLight,
            enabled = false,
            onClick = {},
        )

        WizardButton(
            text = "Neutral Outlined Enabled",
            buttonStyle = WizardButtonStyle.NeutralOutlined,
            onClick = {},
        )

        WizardButton(
            text = "Neutral Outlined Disabled",
            buttonStyle = WizardButtonStyle.NeutralOutlined,
            enabled = false,
            onClick = {},
        )

        WizardButton(
            text = "Neutral Ghost Enabled",
            buttonStyle = WizardButtonStyle.NeutralGhost,
            onClick = {},
        )

        WizardButton(
            text = "Neutral Ghost Disabled",
            buttonStyle = WizardButtonStyle.NeutralGhost,
            enabled = false,
            onClick = {},
        )
    }
}
