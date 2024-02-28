package com.touchetime.wizard.utils.colors

import com.touchetime.wizard.utils.primitive.WizardPrimitiveColor
import com.touchetime.wizard.utils.theme.ThemeManager
import com.touchetime.wizard.utils.theme.ThemeType

object WizardColors {
    fun colors(): WizardThemeColors {
        return when (ThemeManager.currentTheme) {
            ThemeType.DARK -> darkColors
            ThemeType.LIGHT -> lightColors
            ThemeType.PARIS_2024 -> parisColors
        }
    }

    private val darkColors = WizardThemeColors.create(
        backgroundPrimary = WizardPrimitiveColor.neutralDark0,
        backgroundSecondary = WizardPrimitiveColor.neutralDark200,
        backgroundTertiary = WizardPrimitiveColor.neutralDark400,
        backgroundDisabled = WizardPrimitiveColor.neutralDark100,
        backgroundInversePrimary = WizardPrimitiveColor.neutralDark1100,
        backgroundInverseSecondary = WizardPrimitiveColor.neutralDark900,
        backgroundInverseDisabled = WizardPrimitiveColor.neutralDark1000,
        backgroundButtonPrimary = WizardPrimitiveColor.neutralDark1100,
        backgroundButtonDisabled = WizardPrimitiveColor.neutralDark100,
        foregroundPrimary = WizardPrimitiveColor.neutralDark1100,
        foregroundSecondary = WizardPrimitiveColor.neutralDark900,
        foregroundTertiary = WizardPrimitiveColor.neutralDark700,
        foregroundQuaternary = WizardPrimitiveColor.orange500,
        foregroundDisabled = WizardPrimitiveColor.neutralDark500,
        foregroundInversePrimary = WizardPrimitiveColor.neutralDark0,
        foregroundInverseSecondary = WizardPrimitiveColor.neutralDark200,
        foregroundInverseTertiary = WizardPrimitiveColor.neutralDark400,
        foregroundInverseDisabled = WizardPrimitiveColor.neutralDark500
    )

    private val lightColors = WizardThemeColors.create(
        backgroundPrimary = WizardPrimitiveColor.neutralLight0,
        backgroundSecondary = WizardPrimitiveColor.neutralLight100,
        backgroundTertiary = WizardPrimitiveColor.neutralLight200,
        backgroundDisabled = WizardPrimitiveColor.neutralLight100,
        backgroundInversePrimary = WizardPrimitiveColor.neutralLight1100,
        backgroundInverseSecondary = WizardPrimitiveColor.neutralLight900,
        backgroundInverseDisabled = WizardPrimitiveColor.neutralLight1000,
        backgroundButtonPrimary = WizardPrimitiveColor.orange500,
        backgroundButtonDisabled = WizardPrimitiveColor.neutralLight200,
        foregroundPrimary = WizardPrimitiveColor.neutralLight1100,
        foregroundSecondary = WizardPrimitiveColor.neutralLight800,
        foregroundTertiary = WizardPrimitiveColor.neutralLight700,
        foregroundQuaternary = WizardPrimitiveColor.orange600,
        foregroundDisabled = WizardPrimitiveColor.neutralLight300,
        foregroundInversePrimary = WizardPrimitiveColor.neutralLight0,
        foregroundInverseSecondary = WizardPrimitiveColor.neutralLight200,
        foregroundInverseTertiary = WizardPrimitiveColor.neutralLight400,
        foregroundInverseDisabled = WizardPrimitiveColor.neutralLight500
    )

    private val parisColors = WizardThemeColors.create(
        backgroundPrimary = WizardPrimitiveColor.parisBlueDark,
        backgroundSecondary = WizardPrimitiveColor.parisBluePrimary,
        backgroundTertiary = WizardPrimitiveColor.parisBlueMiddle,
        backgroundDisabled = WizardPrimitiveColor.neutralDark1100, // TODO: Change this color [WE]
        backgroundInversePrimary = WizardPrimitiveColor.neutralLight1100,
        backgroundInverseSecondary = WizardPrimitiveColor.neutralDark900,
        backgroundInverseDisabled = WizardPrimitiveColor.neutralDark1000,
        backgroundButtonPrimary = WizardPrimitiveColor.parisPurpleMiddle,
        backgroundButtonDisabled = WizardPrimitiveColor.parisPurpleDark,
        foregroundPrimary = WizardPrimitiveColor.neutralDark1100,
        foregroundSecondary = WizardPrimitiveColor.neutralDark800,
        foregroundTertiary = WizardPrimitiveColor.neutralDark600,
        foregroundQuaternary = WizardPrimitiveColor.orange500,
        foregroundDisabled = WizardPrimitiveColor.neutralLight800,
        foregroundInversePrimary = WizardPrimitiveColor.neutralDark0,
        foregroundInverseSecondary = WizardPrimitiveColor.neutralDark200,
        foregroundInverseTertiary = WizardPrimitiveColor.neutralDark400,
        foregroundInverseDisabled = WizardPrimitiveColor.neutralDark500
    )
}
