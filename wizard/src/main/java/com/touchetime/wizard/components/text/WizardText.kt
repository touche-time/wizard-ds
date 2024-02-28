package com.touchetime.wizard.components.text

import androidx.compose.foundation.background
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.touchetime.wizard.utils.colors.WizardColors

/**
 *  WIZARD TEXT
 *
 *  @param modifier: Modifier should be passed if necessary [OPTIONAL]
 *  @param text: Text shown on Wizard Text [MANDATORY]
 *  @param style: Type text [MANDATORY]
 *  @param backgroundColor: Background color [Optional]
 *  @param textAlign: Alignment text [OPTIONAL] Default -> Start
 *
 *
 * Created by Wellyngson Elias on 01/10/24.
 * github: /wellyngson
 * email: wellyngson.guedes@gmail.com
 * linkedin: /in/wellyngson
 *
 * */

@Composable
fun WizardText(
    modifier: Modifier = Modifier,
    text: String,
    style: WizardTextStyle,
    textColor: Color = WizardColors.colors().foregroundPrimary,
    backgroundColor: Color = Color.Transparent,
    textAlign: TextAlign = TextAlign.Start
) {
    Text(
        text = text,
        color = textColor,
        fontWeight = FontWeight(style.weight),
        fontFamily = style.font,
        fontSize = style.size,
        letterSpacing = style.letterSpacing,
        lineHeight = style.lineHeight,
        textAlign = textAlign,
        modifier = modifier.background(backgroundColor),
    )
}
