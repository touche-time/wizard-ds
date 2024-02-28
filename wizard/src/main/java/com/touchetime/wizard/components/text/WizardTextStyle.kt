package com.touchetime.wizard.components.text

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.touchetime.wizard.utils.primitive.WizardPrimitiveFonts

sealed class WizardTextStyle(
    val font: FontFamily,
    val weight: Int,
    val size: TextUnit,
    val lineHeight: TextUnit,
    val letterSpacing: TextUnit,
) {
    // Display
    object DisplayLarge : WizardTextStyle(
        font = WizardPrimitiveFonts.CabinetGroteskExtraBold,
        weight = 800,
        size = 52.sp,
        lineHeight = 64.sp,
        letterSpacing = 0.sp,
    )

    object DisplayMedium : WizardTextStyle(
        font = WizardPrimitiveFonts.CabinetGroteskExtraBold,
        weight = 800,
        size = 44.sp,
        lineHeight = 52.sp,
        letterSpacing = 0.sp,
    )

    object DisplaySmall : WizardTextStyle(
        font = WizardPrimitiveFonts.CabinetGroteskExtraBold,
        weight = 800,
        size = 36.sp,
        lineHeight = 44.sp,
        letterSpacing = 0.sp,
    )

    // Heading
    object HeadingXXLarge : WizardTextStyle(
        font = WizardPrimitiveFonts.CabinetGroteskBold,
        weight = 700,
        size = 40.sp,
        lineHeight = 52.sp,
        letterSpacing = 0.sp,
    )

    object HeadingXLarge : WizardTextStyle(
        font = WizardPrimitiveFonts.CabinetGroteskBold,
        weight = 700,
        size = 36.sp,
        lineHeight = 44.sp,
        letterSpacing = 0.sp,
    )

    object HeadingLarge : WizardTextStyle(
        font = WizardPrimitiveFonts.CabinetGroteskBold,
        weight = 700,
        size = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp,
    )

    object HeadingMedium : WizardTextStyle(
        font = WizardPrimitiveFonts.CabinetGroteskBold,
        weight = 700,
        size = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp,
    )

    object HeadingSmall : WizardTextStyle(
        font = WizardPrimitiveFonts.CabinetGroteskBold,
        weight = 700,
        size = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp,
    )

    object HeadingXSmall : WizardTextStyle(
        font = WizardPrimitiveFonts.CabinetGroteskBold,
        weight = 700,
        size = 20.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp,
    )

    // Label
    object LabelLarge : WizardTextStyle(
        font = WizardPrimitiveFonts.ArchivoSemibold,
        weight = 600,
        size = 18.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.3.sp,
    )

    object LabelMedium : WizardTextStyle(
        font = WizardPrimitiveFonts.ArchivoSemibold,
        weight = 600,
        size = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.3.sp,
    )

    object LabelSmall : WizardTextStyle(
        font = WizardPrimitiveFonts.ArchivoSemibold,
        weight = 600,
        size = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.3.sp,
    )

    object LabelXSmall : WizardTextStyle(
        font = WizardPrimitiveFonts.ArchivoSemibold,
        weight = 600,
        size = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.3.sp,
    )
}
