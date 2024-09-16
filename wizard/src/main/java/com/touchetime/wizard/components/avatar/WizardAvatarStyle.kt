package com.touchetime.wizard.components.avatar

import androidx.annotation.DrawableRes
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.touchetime.wizard.components.text.WizardTextStyle
import com.touchetime.wizard.utils.global.WizardGlobalSpacing

sealed class WizardAvatarStyle(
    open val size: Dp,
) {
    data class Image(
        override val size: Dp,
        @DrawableRes val image: Int,
    ) : WizardAvatarStyle(size)

    data class Icon(
        override val size: Dp,
    ) : WizardAvatarStyle(size)
}

abstract class WizardAvatarTypography(
    override val size: Dp,
    val style: TextStyle,
    val text: String,
) : WizardAvatarStyle(size) {
    data class TypographyXSmall(
        override val size: Dp = WizardGlobalSpacing.xxNormal,
        val style: TextStyle = WizardTextStyle.primaryCaptionSmallMedium,
        val text: String,
    ) : WizardAvatarStyle(size)

    data class TypographyMiddle(
        override val size: Dp = WizardGlobalSpacing.xLarge,
        val style: TextStyle = WizardTextStyle.primaryBodyMiddleMedium,
        val text: String,
    ) : WizardAvatarStyle(size)

    data class TypographyLarge(
        override val size: Dp = WizardGlobalSpacing.xxLarge,
        val style: TextStyle = WizardTextStyle.primaryTitleMiddleMedium,
        val text: String,
    ) : WizardAvatarStyle(size)

    data class TypographyBigger(
        override val size: Dp = WizardGlobalSpacing.bigger,
        val style: TextStyle = WizardTextStyle.primaryHeadingXXSmallMedium,
        val text: String,
    ) : WizardAvatarStyle(size)
}
