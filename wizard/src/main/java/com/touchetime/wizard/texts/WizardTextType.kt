package com.touchetime.wizard.texts

import androidx.compose.ui.graphics.Color

sealed class WizardTextType(
    val backgroundColor: Color,
    val textColor: Color,
) {
    object Primary : WizardTextType(
        backgroundColor = Color.Blue,
        textColor = Color.Cyan,
    )

    object Secondary : WizardTextType(
        backgroundColor = Color.Red,
        textColor = Color.Cyan,
    )

    object Terciary : WizardTextType(
        backgroundColor = Color.Gray,
        textColor = Color.Cyan,
    )
}
