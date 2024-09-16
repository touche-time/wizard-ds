package com.touchetime.wizard.components.avatar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.touchetime.wizard.components.text.WizardText
import com.touchetime.wizard.utils.colors.WizardColors

@Composable
fun WizardAvatar(
    modifier: Modifier = Modifier,
    style: WizardAvatarStyle,
    onClick: () -> Unit,
) {
    Column(
        modifier =
            modifier
                .background(color = WizardColors.colors().contentBrand, shape = CircleShape)
                .size(style.size),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        when (style) {
            is WizardAvatarStyle.Image -> Unit
            is WizardAvatarStyle.Icon -> Unit
            is WizardAvatarTypography ->
                WizardText(
                    text = style.text,
                    style = style.style,
                    textColor = WizardColors.colors().contentAlwaysDark,
                )
        }
    }
}

@Preview
@Composable
private fun WizardAvatarPreview() {
    Column {
        WizardAvatar(
            style = WizardAvatarTypography.TypographyXSmall(text = "BA"),
            onClick = {},
        )

        WizardAvatar(
            style = WizardAvatarTypography.TypographyMiddle(text = "BA"),
            onClick = {},
        )

        WizardAvatar(
            style = WizardAvatarTypography.TypographyLarge(text = "BA"),
            onClick = {},
        )

        WizardAvatar(
            style = WizardAvatarTypography.TypographyBigger(text = "BA"),
            onClick = {},
        )
    }
}
