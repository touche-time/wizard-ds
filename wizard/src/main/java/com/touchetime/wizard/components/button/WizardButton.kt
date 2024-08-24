package com.touchetime.wizard.components.button

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.touchetime.wizard.R
import com.touchetime.wizard.components.text.WizardTextStyle
import com.touchetime.wizard.utils.EMPTY_STRING
import com.touchetime.wizard.utils.global.WizardGlobalSpacing
import com.touchetime.wizard.utils.global.WizardGlobalStroke

@Composable
fun WizardButton(
    modifier: Modifier = Modifier,
    text: String,
    buttonStyle: WizardButtonStyle,
    enabled: Boolean = true,
    @DrawableRes iconLeft: Int? = null,
    @DrawableRes iconRight: Int? = null,
    onClick: () -> Unit,
) {
    Button(
        modifier = modifier,
        contentPadding =
            PaddingValues(
                horizontal = WizardGlobalSpacing.xxNormal,
                vertical = WizardGlobalSpacing.xNormal,
            ),
        enabled = enabled,
        colors =
            ButtonDefaults.buttonColors(
                containerColor =
                    WizardButtonStyle.getContainerColor(
                        buttonStyle = buttonStyle,
                        color = buttonStyle.containerColorEnable,
                    ),
                disabledContainerColor =
                    WizardButtonStyle.getContainerColor(
                        buttonStyle = buttonStyle,
                        color = buttonStyle.containerColorDisable,
                    ),
            ),
        border =
            BorderStroke(
                WizardGlobalStroke.light,
                buttonStyle.containerColorEnable.takeIf { enabled }
                    ?: buttonStyle.containerColorDisable,
            ).takeIf { buttonStyle.buttonType == WizardButtonType.OUTLINED },
        onClick = { onClick() },
        content = {
            Box(
                modifier = Modifier.fillMaxWidth(),
                content = {
                    iconLeft?.let {
                        Icon(
                            painter = painterResource(id = it),
                            contentDescription = EMPTY_STRING,
                            modifier =
                                Modifier
                                    .size(WizardGlobalSpacing.xxNormal)
                                    .align(alignment = Alignment.CenterStart),
                            tint =
                                buttonStyle.contentColorEnable.takeIf { enabled }
                                    ?: buttonStyle.contentColorDisable,
                        )
                    }

                    Text(
                        text = text,
                        color =
                            buttonStyle.contentColorEnable.takeIf { enabled }
                                ?: buttonStyle.contentColorDisable,
                        style = WizardTextStyle.labelMedium,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.align(alignment = Alignment.Center),
                    )

                    iconRight?.let {
                        Icon(
                            painter = painterResource(id = it),
                            contentDescription = EMPTY_STRING,
                            modifier =
                                Modifier
                                    .size(WizardGlobalSpacing.xxNormal)
                                    .align(alignment = Alignment.CenterEnd),
                            tint =
                                buttonStyle.contentColorEnable.takeIf { enabled }
                                    ?: buttonStyle.contentColorDisable,
                        )
                    }
                },
            )
        },
    )
}

@Preview
@Composable
private fun ShowWizardButton() {
    WizardButton(
        modifier = Modifier,
        text = "Wizard Button",
        buttonStyle = WizardButtonStyle.NeutralSolid,
        iconLeft = R.drawable.ic_add,
        iconRight = R.drawable.ic_remove,
        enabled = false,
        onClick = {},
    )
}
