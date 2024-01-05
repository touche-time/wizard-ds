package com.touchetime.wizard.texts

import androidx.compose.foundation.background
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WizardText(
    text: String,
    type: WizardTextType,
) {
    Text(
        text = text,
        color = type.textColor,
        modifier = Modifier.background(color = type.backgroundColor),
    )
}
