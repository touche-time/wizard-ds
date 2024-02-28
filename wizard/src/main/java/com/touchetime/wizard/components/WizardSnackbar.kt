package com.touchetime.wizard.components

import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import com.touchetime.wizard.components.text.WizardText
import com.touchetime.wizard.components.text.WizardTextStyle
import com.touchetime.wizard.utils.EMPTY_STRING
import com.touchetime.wizard.utils.colors.WizardColors
import com.touchetime.wizard.utils.global.WizardGlobalRadius
import com.touchetime.wizard.utils.global.WizardGlobalSpacing

/**
 * WIZARD SNACK BAR
 *
 * Toast shown for time defined after the visibility
 *
 * @param modifier: Modifier should be passed if necessary [OPTIONAL]
 * @param message: Text shown on Snack Bar [MANDATORY]
 * @param icon: Icon shown on Snack Bar. If null, the icon will be hide [OPTIONAL]
 * @param visible: State to control the composable visibility [MANDATORY]
 *
 *
 * How to use:
 *
 * val coroutineScope = rememberCoroutineScope()
 * val wizardSnackBarVisibilityState = remember { mutableStateOf(false) }
 *
 * coroutineScope.launch {
 *  wizardSnackBarVisibilityState.value = true
 *
 *  delay (3000L) -> Time of visibility
 *
 *  wizardSnackBarVisibilityState.value = false
 * } -> It should be called in a click button
 *
 * WizardSnackBar(
 *  message = "Text",
 *  visible = wizardSnackBarVisibilityState.value
 * )
 *
 *
 * Created by Wellyngson Elias on 01/10/24.
 * github: /wellyngson
 * email: wellyngson.guedes@gmail.com
 * linkedin: /in/wellyngson
 *
 * */

@Composable
fun WizardSnackBar(
    modifier: Modifier = Modifier,
    message: String,
    @DrawableRes icon: Int? = null,
    visible: MutableState<Boolean>
) {
    AnimatedVisibility(
        visible = visible.value,
        enter = slideInHorizontally(initialOffsetX = { it }),
        exit = slideOutHorizontally(targetOffsetX = { -it })
    ) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(WizardGlobalRadius.middle))
                .background(WizardColors.colors().backgroundSecondary) // TODO: Change this color [WE]

        ) {
            Row(
                modifier = Modifier.padding(all = WizardGlobalSpacing.small),
                verticalAlignment = Alignment.CenterVertically
            ) {
                icon?.let {
                    Icon(
                        painter = painterResource(id = icon),
                        modifier = Modifier.padding(end = WizardGlobalSpacing.small),
                        tint = WizardColors.colors().backgroundPrimary, // TODO: Change this color [WE]
                        contentDescription = EMPTY_STRING
                    )
                }

                WizardText(
                    text = message,
                    style = WizardTextStyle.DisplayLarge
                )
            }
        }
    }
}
