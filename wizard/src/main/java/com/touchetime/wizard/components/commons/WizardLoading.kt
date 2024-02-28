package com.touchetime.wizard.components.commons

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.touchetime.wizard.R

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
        modifier = Modifier.fillMaxSize(),
        contentAlignment = androidx.compose.ui.Alignment.Center,
    ) {
        Image(
            painter = painterResource(id = R.drawable.tt_logo),
            contentDescription = null,
            modifier = Modifier.rotate(rotationAnimatable.value),
        )
    }
}

@Preview
@Composable
fun PreviewRotatingSVG() {
    WizardLoading()
}
