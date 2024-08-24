package com.touchetime.wizardds.presentation.ui.text

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.touchetime.wizard.components.text.WizardText
import com.touchetime.wizard.components.text.WizardTextStyle
import com.touchetime.wizard.utils.global.WizardGlobalSpacing

@Composable
fun TextScreen() {
    val verticalScroll = rememberScrollState()

    Column(
        modifier = Modifier.padding(WizardGlobalSpacing.middle).verticalScroll(verticalScroll),
        verticalArrangement = Arrangement.spacedBy(WizardGlobalSpacing.small),
    ) {
        WizardText(
            text = "Texts",
            style = WizardTextStyle.displayLarge,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )

        WizardText(
            text = "Display Large",
            style = WizardTextStyle.displayLarge,
        )

        WizardText(
            text = "Display Medium",
            style = WizardTextStyle.displayMedium,
        )

        WizardText(
            text = "Display Small",
            style = WizardTextStyle.displaySmall,
        )

        WizardText(
            text = "Heading XX Large",
            style = WizardTextStyle.headingXXLarge,
        )

        WizardText(
            text = "Heading X Large",
            style = WizardTextStyle.headingXLarge,
        )

        WizardText(
            text = "Heading Large",
            style = WizardTextStyle.headingLarge,
        )

        WizardText(
            text = "Heading Medium",
            style = WizardTextStyle.headingMedium,
        )

        WizardText(
            text = "Heading Small",
            style = WizardTextStyle.headingSmall,
        )

        WizardText(
            text = "Heading X Small",
            style = WizardTextStyle.headingXSmall,
        )

        WizardText(
            text = "Label Large",
            style = WizardTextStyle.labelLarge,
        )

        WizardText(
            text = "Label Medium",
            style = WizardTextStyle.labelMedium,
        )

        WizardText(
            text = "Label Small",
            style = WizardTextStyle.labelSmall,
        )

        WizardText(
            text = "Label X Small",
            style = WizardTextStyle.labelXSmall,
        )

        WizardText(
            text = "Paragraph Large",
            style = WizardTextStyle.paragraphLarge,
        )

        WizardText(
            text = "Paragraph Medium",
            style = WizardTextStyle.paragraphMedium,
        )

        WizardText(
            text = "Paragraph Small",
            style = WizardTextStyle.paragraphSmall,
        )

        WizardText(
            text = "Paragraph X Small",
            style = WizardTextStyle.paragraphXSmall,
        )
    }
}
