package com.touchetime.wizardds.presentation.ui.button

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
import com.touchetime.wizardds.R

@Composable
fun ButtonScreen() {
    Column(
        modifier = Modifier.padding(WizardGlobalSpacing.middle),
        verticalArrangement = Arrangement.spacedBy(WizardGlobalSpacing.small),
    ) {
        WizardText(
            text = "Buttons",
            style = WizardTextStyle.DisplayLarge,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )

        WizardButton(
            text = "askdfjgha",
            buttonStyle = WizardButtonStyle.PrimarySmallMatchSolid,
            onClick = {},
        )

        WizardButton(
            text = "askdfjgha",
            buttonStyle = WizardButtonStyle.PrimarySmallMatchSolid,
            iconLeft = com.touchetime.wizard.R.drawable.ic_arrow_up_right,
            onClick = {},
        )
    }
}
