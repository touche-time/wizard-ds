package com.touchetime.wizard.components.button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.touchetime.wizard.utils.colors.WizardColors
import com.touchetime.wizard.utils.global.WizardGlobalSpacing

sealed class WizardButtonStyle(
    val width: Modifier,
    val backgroundColor: Color,
    val backgroundType: WizardBackgroundButtonType,
    val textColor: Color,
    val horizontalPadding: Dp,
    val verticalPadding: Dp,
    val iconSize: Dp?,
) {
    object PrimarySmallMatchSolid : WizardButtonStyle(
        width = Modifier.fillMaxWidth(),
        backgroundColor = WizardColors.colors().foregroundQuaternary,
        backgroundType = WizardBackgroundButtonType.GHOST,
        textColor = WizardColors.colors().foregroundPrimary,
        horizontalPadding = WizardGlobalSpacing.normal,
        verticalPadding = WizardGlobalSpacing.tiny,
        iconSize = WizardGlobalSpacing.normal,
    )
}
