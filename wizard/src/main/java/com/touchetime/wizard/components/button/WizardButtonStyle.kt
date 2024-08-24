package com.touchetime.wizard.components.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.touchetime.wizard.utils.colors.WizardColors

sealed class WizardButtonStyle(
    val buttonType: WizardButtonType,
    val containerColorEnable: Color,
    val containerColorDisable: Color,
    val contentColorEnable: Color,
    val contentColorDisable: Color,
) {
    // Region primary
    object PrimarySolid : WizardButtonStyle(
        buttonType = WizardButtonType.SOLID,
        containerColorEnable = WizardColors.colors().backgroundBrand,
        containerColorDisable = WizardColors.colors().backgroundTertiary,
        contentColorEnable = WizardColors.colors().contentInverse,
        contentColorDisable = WizardColors.colors().contentDisabled,
    )

    object PrimaryLight : WizardButtonStyle(
        buttonType = WizardButtonType.SOLID,
        containerColorEnable = WizardColors.colors().backgroundBrandLight,
        containerColorDisable = WizardColors.colors().backgroundTertiary,
        contentColorEnable = WizardColors.colors().contentPrimary,
        contentColorDisable = WizardColors.colors().contentDisabled,
    )

    object PrimaryOutlined : WizardButtonStyle(
        buttonType = WizardButtonType.OUTLINED,
        containerColorEnable = WizardColors.colors().strokeBrand,
        containerColorDisable = WizardColors.colors().strokeTertiary,
        contentColorEnable = WizardColors.colors().contentBrand,
        contentColorDisable = WizardColors.colors().contentDisabled,
    )

    object PrimaryGhost : WizardButtonStyle(
        buttonType = WizardButtonType.GHOST,
        containerColorEnable = Color.Transparent,
        containerColorDisable = Color.Transparent,
        contentColorEnable = WizardColors.colors().contentBrand,
        contentColorDisable = WizardColors.colors().contentDisabled,
    )

    // Region Neutral
    object NeutralSolid : WizardButtonStyle(
        buttonType = WizardButtonType.SOLID,
        containerColorEnable = WizardColors.colors().backgroundInverse,
        containerColorDisable = WizardColors.colors().backgroundTertiary,
        contentColorEnable = WizardColors.colors().contentInverse,
        contentColorDisable = WizardColors.colors().contentDisabled,
    )

    object NeutralLight : WizardButtonStyle(
        buttonType = WizardButtonType.SOLID,
        containerColorEnable = WizardColors.colors().backgroundSecondary,
        containerColorDisable = WizardColors.colors().backgroundTertiary,
        contentColorEnable = WizardColors.colors().contentPrimary,
        contentColorDisable = WizardColors.colors().contentDisabled,
    )

    object NeutralOutlined : WizardButtonStyle(
        buttonType = WizardButtonType.OUTLINED,
        containerColorEnable = WizardColors.colors().strokeTertiary,
        containerColorDisable = WizardColors.colors().strokeTertiary,
        contentColorEnable = WizardColors.colors().contentPrimary,
        contentColorDisable = WizardColors.colors().contentDisabled,
    )

    object NeutralGhost : WizardButtonStyle(
        buttonType = WizardButtonType.GHOST,
        containerColorEnable = Color.Transparent,
        containerColorDisable = Color.Transparent,
        contentColorEnable = WizardColors.colors().contentPrimary,
        contentColorDisable = WizardColors.colors().contentDisabled,
    )

    companion object {
        @Composable
        fun getContainerColor(
            buttonStyle: WizardButtonStyle,
            color: Color,
        ): Color =
            when (buttonStyle.buttonType) {
                WizardButtonType.SOLID -> color
                WizardButtonType.OUTLINED -> Color.Transparent
                WizardButtonType.GHOST -> Color.Transparent
            }
    }
}
