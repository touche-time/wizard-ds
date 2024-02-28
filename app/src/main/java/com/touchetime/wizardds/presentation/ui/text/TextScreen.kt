package com.touchetime.wizardds.presentation.ui.text

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.touchetime.wizard.components.text.WizardText
import com.touchetime.wizard.components.text.WizardTextStyle
import com.touchetime.wizard.utils.global.WizardGlobalSpacing

@Composable
fun TextScreen() {
    Column(
        modifier = Modifier.padding(WizardGlobalSpacing.middle),
        verticalArrangement = Arrangement.spacedBy(WizardGlobalSpacing.small),
    ) {
        WizardText(
            text = "Texts",
            style = WizardTextStyle.DisplayLarge,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )

        WizardText(
            text = "Display Large",
            style = WizardTextStyle.DisplayLarge,
        )

        WizardText(
            text = "Display Medium",
            style = WizardTextStyle.DisplayMedium,
        )

        WizardText(
            text = "Display Small",
            style = WizardTextStyle.DisplaySmall,
        )

        WizardText(
            text = "Heading XX Large",
            style = WizardTextStyle.HeadingXXLarge,
        )

        WizardText(
            text = "Heading X Large",
            style = WizardTextStyle.HeadingXLarge,
        )

        WizardText(
            text = "Heading Large",
            style = WizardTextStyle.HeadingLarge,
        )

        WizardText(
            text = "Heading Medium",
            style = WizardTextStyle.HeadingMedium,
        )

        WizardText(
            text = "Heading Small",
            style = WizardTextStyle.HeadingSmall,
        )

        WizardText(
            text = "Heading X Small",
            style = WizardTextStyle.HeadingXSmall,
        )

        WizardText(
            text = "Label Large",
            style = WizardTextStyle.LabelLarge,
        )

        WizardText(
            text = "Label Medium",
            style = WizardTextStyle.LabelMedium,
        )

        WizardText(
            text = "Label Small",
            style = WizardTextStyle.LabelSmall,
        )

        WizardText(
            text = "Label X Small",
            style = WizardTextStyle.LabelXSmall,
        )
    }
}
