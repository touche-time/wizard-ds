package com.touchetime.wizard.components.commons

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.touchetime.wizard.R
import com.touchetime.wizard.utils.EMPTY_STRING
import com.touchetime.wizard.utils.colors.WizardColors

@Composable
fun WizardLoading() {
    val rotationAnimatable = remember { Animatable(0f) }

    LaunchedEffect(Unit) {
        while (true) {
            rotationAnimatable.animateTo(
                targetValue = 360f,
                animationSpec =
                    infiniteRepeatable(
                        animation = tween(durationMillis = 2000),
                        repeatMode = RepeatMode.Restart,
                    ),
            )
        }
    }

    Box(
        modifier =
            Modifier
                .fillMaxSize()
                .background(WizardColors.colors().backgroundPrimary.copy(alpha = 0.5f)),
        contentAlignment = androidx.compose.ui.Alignment.Center,
    ) {
        Image(
            painter = painterResource(id = R.drawable.tt_logo),
            contentDescription = EMPTY_STRING,
            modifier = Modifier.rotate(rotationAnimatable.value),
            colorFilter = ColorFilter.tint(WizardColors.colors().backgroundInverse),
        )
    }
}

@Preview
@Composable
fun WizardLoadingPreview() {
    WizardLoading()
}
