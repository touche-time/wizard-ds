package com.touchetime.wizard.utils.colors

import androidx.compose.ui.graphics.Color

open class WizardThemeColors protected constructor(
    val backgroundPrimary: Color,
    val backgroundSecondary: Color,
    val backgroundTertiary: Color,
    val backgroundDisabled: Color,
    val backgroundInversePrimary: Color,
    val backgroundInverseSecondary: Color,
    val backgroundInverseDisabled: Color,
    val backgroundButtonPrimary: Color,
    val backgroundButtonDisabled: Color,
    val foregroundPrimary: Color,
    val foregroundSecondary: Color,
    val foregroundTertiary: Color,
    val foregroundQuaternary: Color,
    val foregroundDisabled: Color,
    val foregroundInversePrimary: Color,
    val foregroundInverseSecondary: Color,
    val foregroundInverseTertiary: Color,
    val foregroundInverseDisabled: Color,
) {
    companion object {
        @JvmStatic
        fun create(
            backgroundPrimary: Color,
            backgroundSecondary: Color,
            backgroundTertiary: Color,
            backgroundDisabled: Color,
            backgroundInversePrimary: Color,
            backgroundInverseSecondary: Color,
            backgroundInverseDisabled: Color,
            backgroundButtonPrimary: Color,
            backgroundButtonDisabled: Color,
            foregroundPrimary: Color,
            foregroundSecondary: Color,
            foregroundTertiary: Color,
            foregroundQuaternary: Color,
            foregroundDisabled: Color,
            foregroundInversePrimary: Color,
            foregroundInverseSecondary: Color,
            foregroundInverseTertiary: Color,
            foregroundInverseDisabled: Color,
        ): WizardThemeColors {
            return WizardThemeColors(
                backgroundPrimary = backgroundPrimary,
                backgroundSecondary = backgroundSecondary,
                backgroundTertiary = backgroundTertiary,
                backgroundDisabled = backgroundDisabled,
                backgroundInversePrimary = backgroundInversePrimary,
                backgroundInverseSecondary = backgroundInverseSecondary,
                backgroundInverseDisabled = backgroundInverseDisabled,
                backgroundButtonPrimary = backgroundButtonPrimary,
                backgroundButtonDisabled = backgroundButtonDisabled,
                foregroundPrimary = foregroundPrimary,
                foregroundSecondary = foregroundSecondary,
                foregroundTertiary = foregroundTertiary,
                foregroundQuaternary = foregroundQuaternary,
                foregroundDisabled = foregroundDisabled,
                foregroundInversePrimary = foregroundInversePrimary,
                foregroundInverseSecondary = foregroundInverseSecondary,
                foregroundInverseTertiary = foregroundInverseTertiary,
                foregroundInverseDisabled = foregroundInverseDisabled
            )
        }
    }
}
