package com.touchetime.wizard.components.button

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.touchetime.wizard.R
import com.touchetime.wizard.utils.EMPTY_STRING
import com.touchetime.wizard.utils.global.WizardGlobalStroke
import com.touchetime.wizard.utils.primitive.WizardPrimitiveFonts

@Composable
fun WizardButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    buttonStyle: WizardButtonStyle,
    @DrawableRes iconLeft: Int? = null,
    @DrawableRes iconRight: Int? = null,
    onClick: () -> Unit,
) {
    Button(
        modifier = modifier.then(buttonStyle.width),
        contentPadding =
            PaddingValues(
                horizontal = buttonStyle.horizontalPadding,
                vertical = buttonStyle.verticalPadding,
            ),
        colors =
            ButtonDefaults.buttonColors(
                containerColor =
                    Color.Transparent.takeIf {
                        buttonStyle.backgroundType == WizardBackgroundButtonType.OUTLINED
                    } ?: buttonStyle.backgroundColor,
            ),
        border =
            BorderStroke(
                WizardGlobalStroke.light,
                buttonStyle.backgroundColor,
            ).takeIf { buttonStyle.backgroundType == WizardBackgroundButtonType.OUTLINED },
        onClick = { onClick() },
        content = {
            Box(
                modifier = Modifier.fillMaxWidth(),
                content = {
                    iconLeft?.let {
                        Icon(
                            painter = painterResource(id = it),
                            contentDescription = EMPTY_STRING,
                            modifier = Modifier.align(alignment = Alignment.CenterStart),
                        )
                    }

                    text?.let {
                        Text(
                            text = it,
                            color = buttonStyle.textColor,
                            fontFamily = WizardPrimitiveFonts.ArchivoSemibold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.align(alignment = Alignment.Center),
                        )
                    }

                    iconRight?.let {
                        Icon(
                            painter = painterResource(id = it),
                            contentDescription = EMPTY_STRING,
                            modifier = Modifier.align(alignment = Alignment.CenterEnd),
                        )
                    }
                },
            )
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun ShowWizardButton() {
    WizardButton(
        modifier = Modifier,
        text = "Wizard Button",
        iconLeft = R.drawable.ic_add,
        iconRight = R.drawable.ic_remove,
        buttonStyle = WizardButtonStyle.PrimarySmallMatchSolid,
        onClick = {},
    )
}
