package com.touchetime.wizard.utils.colors

import com.touchetime.wizard.utils.primitive.WizardPrimitiveColor
import com.touchetime.wizard.utils.theme.ThemeManager
import com.touchetime.wizard.utils.theme.ThemeType

object WizardColors {
    fun colors(): WizardThemeColors =
        when (ThemeManager.currentTheme) {
            ThemeType.DARK -> darkColors
            ThemeType.LIGHT -> lightColors
        }

    private val darkColors =
        WizardThemeColors.create(
            backgroundBrand = WizardPrimitiveColor.brand400,
            backgroundBrandLight = WizardPrimitiveColor.brand800,
            backgroundPrimary = WizardPrimitiveColor.neutralDark0,
            backgroundSecondary = WizardPrimitiveColor.neutralDark200,
            backgroundTertiary = WizardPrimitiveColor.neutralDark300,
            backgroundInverse = WizardPrimitiveColor.neutralDark1100,
            backgroundAlwaysDark = WizardPrimitiveColor.neutralDark0,
            backgroundAlwaysLight = WizardPrimitiveColor.neutralDark1100,
            contentBrand = WizardPrimitiveColor.brand400,
            contentBrandLight = WizardPrimitiveColor.brand800,
            contentPrimary = WizardPrimitiveColor.neutralDark1100,
            contentSecondary = WizardPrimitiveColor.neutralDark900,
            contentTertiary = WizardPrimitiveColor.neutralDark800,
            contentDisabled = WizardPrimitiveColor.neutralDark500,
            contentInverse = WizardPrimitiveColor.neutralDark0,
            contentAlwaysDark = WizardPrimitiveColor.neutralDark0,
            contentAlwaysLight = WizardPrimitiveColor.neutralDark1100,
            strokeBrand = WizardPrimitiveColor.brand400,
            strokeBrandLight = WizardPrimitiveColor.brand900,
            strokePrimary = WizardPrimitiveColor.neutralDark200,
            strokeSecondary = WizardPrimitiveColor.neutralDark300,
            strokeTertiary = WizardPrimitiveColor.neutralDark400,
            strokeInverse = WizardPrimitiveColor.neutralDark900,
        )

    private val lightColors =
        WizardThemeColors.create(
            backgroundBrand = WizardPrimitiveColor.brand600,
            backgroundBrandLight = WizardPrimitiveColor.brand100,
            backgroundPrimary = WizardPrimitiveColor.neutralLight200,
            backgroundSecondary = WizardPrimitiveColor.neutralLight200,
            backgroundTertiary = WizardPrimitiveColor.neutralLight300,
            backgroundInverse = WizardPrimitiveColor.neutralLight1100,
            backgroundAlwaysDark = WizardPrimitiveColor.neutralLight1100,
            backgroundAlwaysLight = WizardPrimitiveColor.neutralLight0,
            contentBrand = WizardPrimitiveColor.brand600,
            contentPrimary = WizardPrimitiveColor.brand100,
            contentBrandLight = WizardPrimitiveColor.neutralLight1100,
            contentSecondary = WizardPrimitiveColor.neutralLight900,
            contentTertiary = WizardPrimitiveColor.neutralLight800,
            contentDisabled = WizardPrimitiveColor.neutralLight500,
            contentInverse = WizardPrimitiveColor.neutralLight0,
            contentAlwaysDark = WizardPrimitiveColor.neutralLight1100,
            contentAlwaysLight = WizardPrimitiveColor.neutralLight0,
            strokeBrand = WizardPrimitiveColor.brand600,
            strokeBrandLight = WizardPrimitiveColor.brand200,
            strokePrimary = WizardPrimitiveColor.neutralLight200,
            strokeSecondary = WizardPrimitiveColor.neutralLight300,
            strokeTertiary = WizardPrimitiveColor.neutralLight400,
            strokeInverse = WizardPrimitiveColor.neutralLight900,
        )
}
