@file:OptIn(ExperimentalFoundationApi::class)

package com.touchetime.wizard.utils

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import com.touchetime.wizard.utils.primitive.WizardPrimitiveSize

@Composable
fun ContentClicked(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    elevation: Dp = WizardPrimitiveSize.size80,
    onLongClick: (() -> Unit)? = null,
    onDoubleClick: (() -> Unit)? = null,
    enabled: Boolean = true,
    shape: Shape = CircleShape,
    border: BorderStroke? = null,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    content: @Composable RowScope.() -> Unit,
) {
//    val contentColor by colors.contentColor(enabled)

    Surface(
        shape = shape,
//        color = colors.backgroundColor(enabled).value,
//        contentColor = contentColor,
        tonalElevation = elevation,
        shadowElevation = elevation,
        border = border,
        modifier = modifier,
    ) {
        ProvideTextStyle(
            value = MaterialTheme.typography.bodyMedium,
        ) {
            Row(
                modifier = Modifier
                    .combinedClickable(
                        onClick = onClick,
                        onDoubleClick = onDoubleClick,
                        onLongClick = onLongClick,
                        enabled = enabled,
                        role = Role.Button,
                    )
                    .clip(shape),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                content = content,
            )
        }
    }
}
