package com.touchetime.wizardds.presentation.ui.text

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.touchetime.wizard.components.text.WizardText
import com.touchetime.wizard.components.text.WizardTextStyle
import com.touchetime.wizard.utils.colors.WizardColors
import com.touchetime.wizard.utils.global.WizardGlobalSpacing

@Composable
fun TextScreen() {
    val verticalScroll = rememberScrollState()

    Column(
        modifier =
            Modifier
                .padding(WizardGlobalSpacing.middle)
                .verticalScroll(verticalScroll),
        verticalArrangement = Arrangement.spacedBy(WizardGlobalSpacing.small),
    ) {
        WizardText(
            text = "Primary Display",
            textColor = WizardColors.colors().contentPrimary,
            style = WizardTextStyle.primaryHeadingMiddleBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )

        WizardText(
            text = "Large Regular",
            style = WizardTextStyle.primaryDisplayLargeRegular,
        )
        WizardText(
            text = "Large Medium",
            style = WizardTextStyle.primaryDisplayLargeMedium,
        )
        WizardText(
            text = "Large Bold",
            style = WizardTextStyle.primaryDisplayLargeBold,
        )
        WizardText(
            text = "Middle Regular",
            style = WizardTextStyle.primaryDisplayMiddleRegular,
        )
        WizardText(
            text = "Middle Medium",
            style = WizardTextStyle.primaryDisplayMiddleMedium,
        )
        WizardText(
            text = "Middle Bold",
            style = WizardTextStyle.primaryDisplayMiddleBold,
        )
        WizardText(
            text = "Small Regular",
            style = WizardTextStyle.primaryDisplaySmallRegular,
        )
        WizardText(
            text = "Small Medium",
            style = WizardTextStyle.primaryDisplaySmallMedium,
        )
        WizardText(
            text = "Small Bold",
            style = WizardTextStyle.primaryDisplaySmallBold,
        )

        WizardText(
            text = "Primary Heading",
            textColor = WizardColors.colors().contentPrimary,
            style = WizardTextStyle.primaryHeadingMiddleBold,
            modifier = Modifier.fillMaxWidth().padding(top = WizardGlobalSpacing.middle),
            textAlign = TextAlign.Center,
        )

        WizardText(
            text = "XLarge Regular",
            style = WizardTextStyle.primaryHeadingXLargeRegular,
        )
        WizardText(
            text = "XLarge Medium",
            style = WizardTextStyle.primaryHeadingXLargeMedium,
        )
        WizardText(
            text = "XLarge Bold",
            style = WizardTextStyle.primaryHeadingXLargeBold,
        )
        WizardText(
            text = "Large Regular",
            style = WizardTextStyle.primaryHeadingLargeRegular,
        )
        WizardText(
            text = "Large Medium",
            style = WizardTextStyle.primaryHeadingLargeMedium,
        )
        WizardText(
            text = "Large Bold",
            style = WizardTextStyle.primaryHeadingLargeBold,
        )
        WizardText(
            text = "Middle Regular",
            style = WizardTextStyle.primaryHeadingMiddleRegular,
        )
        WizardText(
            text = "Middle Medium",
            style = WizardTextStyle.primaryHeadingMiddleMedium,
        )
        WizardText(
            text = "Middle Bold",
            style = WizardTextStyle.primaryHeadingMiddleBold,
        )
        WizardText(
            text = "Small Regular",
            style = WizardTextStyle.primaryHeadingSmallRegular,
        )
        WizardText(
            text = "Small Medium",
            style = WizardTextStyle.primaryHeadingSmallMedium,
        )
        WizardText(
            text = "Small Bold",
            style = WizardTextStyle.primaryHeadingSmallBold,
        )
        WizardText(
            text = "XSmall Regular",
            style = WizardTextStyle.primaryHeadingXSmallRegular,
        )
        WizardText(
            text = "XSmall Medium",
            style = WizardTextStyle.primaryHeadingXSmallMedium,
        )
        WizardText(
            text = "XSmall Bold",
            style = WizardTextStyle.primaryHeadingXSmallBold,
        )
        WizardText(
            text = "XXSmall Regular",
            style = WizardTextStyle.primaryHeadingXXSmallRegular,
        )
        WizardText(
            text = "XXSmall Medium",
            style = WizardTextStyle.primaryHeadingXXSmallMedium,
        )
        WizardText(
            text = "XXSmall Bold",
            style = WizardTextStyle.primaryHeadingXXSmallBold,
        )

        WizardText(
            text = "Primary Title",
            textColor = WizardColors.colors().contentPrimary,
            style = WizardTextStyle.primaryHeadingMiddleBold,
            modifier = Modifier.fillMaxWidth().padding(top = WizardGlobalSpacing.middle),
            textAlign = TextAlign.Center,
        )

        WizardText(
            text = "Middle Regular",
            style = WizardTextStyle.primaryTitleMiddleRegular,
        )
        WizardText(
            text = "Middle Medium",
            style = WizardTextStyle.primaryTitleMiddleMedium,
        )
        WizardText(
            text = "Middle Bold",
            style = WizardTextStyle.primaryTitleMiddleBold,
        )
        WizardText(
            text = "Small Regular",
            style = WizardTextStyle.primaryTitleSmallRegular,
        )
        WizardText(
            text = "Small Medium",
            style = WizardTextStyle.primaryTitleSmallMedium,
        )
        WizardText(
            text = "Small Bold",
            style = WizardTextStyle.primaryTitleSmallBold,
        )

        WizardText(
            text = "Primary Body",
            textColor = WizardColors.colors().contentPrimary,
            style = WizardTextStyle.primaryHeadingMiddleBold,
            modifier = Modifier.fillMaxWidth().padding(top = WizardGlobalSpacing.middle),
            textAlign = TextAlign.Center,
        )

        WizardText(
            text = "Middle Regular",
            style = WizardTextStyle.primaryBodyMiddleRegular,
        )
        WizardText(
            text = "Middle Medium",
            style = WizardTextStyle.primaryBodyMiddleMedium,
        )
        WizardText(
            text = "Middle Bold",
            style = WizardTextStyle.primaryBodyMiddleBold,
        )
        WizardText(
            text = "Small Regular",
            style = WizardTextStyle.primaryBodySmallRegular,
        )
        WizardText(
            text = "Small Medium",
            style = WizardTextStyle.primaryBodySmallMedium,
        )
        WizardText(
            text = "Small Bold",
            style = WizardTextStyle.primaryBodySmallBold,
        )

        WizardText(
            text = "Primary Caption",
            textColor = WizardColors.colors().contentPrimary,
            style = WizardTextStyle.primaryHeadingMiddleBold,
            modifier = Modifier.fillMaxWidth().padding(top = WizardGlobalSpacing.middle),
            textAlign = TextAlign.Center,
        )

        WizardText(
            text = "Middle Regular",
            style = WizardTextStyle.primaryCaptionMiddleRegular,
        )
        WizardText(
            text = "Middle Medium",
            style = WizardTextStyle.primaryCaptionMiddleMedium,
        )
        WizardText(
            text = "Middle Bold",
            style = WizardTextStyle.primaryCaptionMiddleBold,
        )
        WizardText(
            text = "Small Regular",
            style = WizardTextStyle.primaryCaptionSmallRegular,
        )
        WizardText(
            text = "Small Medium",
            style = WizardTextStyle.primaryCaptionSmallMedium,
        )
        WizardText(
            text = "Small Bold",
            style = WizardTextStyle.primaryCaptionSmallBold,
        )

        WizardText(
            text = "Primary Overline",
            textColor = WizardColors.colors().contentPrimary,
            style = WizardTextStyle.primaryHeadingMiddleBold,
            modifier = Modifier.fillMaxWidth().padding(top = WizardGlobalSpacing.middle),
            textAlign = TextAlign.Center,
        )

        WizardText(
            text = "Small Regular",
            style = WizardTextStyle.primaryOverlineSmallRegular,
        )
        WizardText(
            text = "Small Medium",
            style = WizardTextStyle.primaryOverlineSmallMedium,
        )
        WizardText(
            text = "Small Bold",
            style = WizardTextStyle.primaryOverlineSmallBold,
        )

        WizardText(
            text = "Secondary Display",
            textColor = WizardColors.colors().contentPrimary,
            style = WizardTextStyle.primaryHeadingMiddleBold,
            modifier = Modifier.fillMaxWidth().padding(top = WizardGlobalSpacing.middle),
            textAlign = TextAlign.Center,
        )

        WizardText(
            text = "Large Regular",
            style = WizardTextStyle.secondaryDisplayLargeRegular,
        )
        WizardText(
            text = "Large Medium",
            style = WizardTextStyle.secondaryDisplayLargeMedium,
        )
        WizardText(
            text = "Large Bold",
            style = WizardTextStyle.secondaryDisplayLargeBold,
        )
        WizardText(
            text = "Middle Regular",
            style = WizardTextStyle.secondaryDisplayMiddleRegular,
        )
        WizardText(
            text = "Middle Medium",
            style = WizardTextStyle.secondaryDisplayMiddleMedium,
        )
        WizardText(
            text = "Middle Bold",
            style = WizardTextStyle.secondaryDisplayMiddleBold,
        )
        WizardText(
            text = "Small Regular",
            style = WizardTextStyle.secondaryDisplaySmallRegular,
        )
        WizardText(
            text = "Small Medium",
            style = WizardTextStyle.secondaryDisplaySmallMedium,
        )
        WizardText(
            text = "Small Bold",
            style = WizardTextStyle.secondaryDisplaySmallBold,
        )

        WizardText(
            text = "Secondary Heading",
            textColor = WizardColors.colors().contentPrimary,
            style = WizardTextStyle.primaryHeadingMiddleBold,
            modifier = Modifier.fillMaxWidth().padding(top = WizardGlobalSpacing.middle),
            textAlign = TextAlign.Center,
        )

        WizardText(
            text = "XLarge Regular",
            style = WizardTextStyle.secondaryHeadingXLargeRegular,
        )
        WizardText(
            text = "XLarge Medium",
            style = WizardTextStyle.secondaryHeadingXLargeMedium,
        )
        WizardText(
            text = "XLarge Bold",
            style = WizardTextStyle.secondaryHeadingXLargeBold,
        )
        WizardText(
            text = "Large Regular",
            style = WizardTextStyle.secondaryHeadingLargeRegular,
        )
        WizardText(
            text = "Large Medium",
            style = WizardTextStyle.secondaryHeadingLargeMedium,
        )
        WizardText(
            text = "Large Bold",
            style = WizardTextStyle.secondaryHeadingLargeBold,
        )
        WizardText(
            text = "Middle Regular",
            style = WizardTextStyle.secondaryHeadingMiddleRegular,
        )
        WizardText(
            text = "Middle Medium",
            style = WizardTextStyle.secondaryHeadingMiddleMedium,
        )
        WizardText(
            text = "Middle Bold",
            style = WizardTextStyle.secondaryHeadingMiddleBold,
        )
        WizardText(
            text = "Small Regular",
            style = WizardTextStyle.secondaryHeadingSmallRegular,
        )
        WizardText(
            text = "Small Medium",
            style = WizardTextStyle.secondaryHeadingSmallMedium,
        )
        WizardText(
            text = "Small Bold",
            style = WizardTextStyle.secondaryHeadingSmallBold,
        )
        WizardText(
            text = "XSmall Regular",
            style = WizardTextStyle.secondaryHeadingXSmallRegular,
        )
        WizardText(
            text = "XSmall Medium",
            style = WizardTextStyle.secondaryHeadingXSmallMedium,
        )
        WizardText(
            text = "XSmall Bold",
            style = WizardTextStyle.secondaryHeadingXSmallBold,
        )
        WizardText(
            text = "XXSmall Regular",
            style = WizardTextStyle.secondaryHeadingXXSmallRegular,
        )
        WizardText(
            text = "XXSmall Medium",
            style = WizardTextStyle.secondaryHeadingXXSmallMedium,
        )
        WizardText(
            text = "XXSmall Bold",
            style = WizardTextStyle.secondaryHeadingXXSmallBold,
        )

        WizardText(
            text = "Secondary Title",
            textColor = WizardColors.colors().contentPrimary,
            style = WizardTextStyle.primaryHeadingMiddleBold,
            modifier = Modifier.fillMaxWidth().padding(top = WizardGlobalSpacing.middle),
            textAlign = TextAlign.Center,
        )

        WizardText(
            text = "Middle Regular",
            style = WizardTextStyle.secondaryTitleMiddleRegular,
        )
        WizardText(
            text = "Middle Medium",
            style = WizardTextStyle.secondaryTitleMiddleMedium,
        )
        WizardText(
            text = "Middle Bold",
            style = WizardTextStyle.secondaryTitleMiddleBold,
        )
        WizardText(
            text = "Small Regular",
            style = WizardTextStyle.secondaryTitleSmallRegular,
        )
        WizardText(
            text = "Small Medium",
            style = WizardTextStyle.secondaryTitleSmallMedium,
        )
        WizardText(
            text = "Small Bold",
            style = WizardTextStyle.secondaryTitleSmallBold,
        )

        WizardText(
            text = "Secondary Body",
            textColor = WizardColors.colors().contentPrimary,
            style = WizardTextStyle.primaryHeadingMiddleBold,
            modifier = Modifier.fillMaxWidth().padding(top = WizardGlobalSpacing.middle),
            textAlign = TextAlign.Center,
        )

        WizardText(
            text = "Middle Regular",
            style = WizardTextStyle.secondaryBodyMiddleRegular,
        )
        WizardText(
            text = "Middle Medium",
            style = WizardTextStyle.secondaryBodyMiddleMedium,
        )
        WizardText(
            text = "Middle Bold",
            style = WizardTextStyle.secondaryBodyMiddleBold,
        )
        WizardText(
            text = "Small Regular",
            style = WizardTextStyle.secondaryBodySmallRegular,
        )
        WizardText(
            text = "Small Medium",
            style = WizardTextStyle.secondaryBodySmallMedium,
        )
        WizardText(
            text = "Small Bold",
            style = WizardTextStyle.secondaryBodySmallBold,
        )

        WizardText(
            text = "Secondary Caption",
            textColor = WizardColors.colors().contentPrimary,
            style = WizardTextStyle.primaryHeadingMiddleBold,
            modifier = Modifier.fillMaxWidth().padding(top = WizardGlobalSpacing.middle),
            textAlign = TextAlign.Center,
        )

        WizardText(
            text = "Middle Regular",
            style = WizardTextStyle.secondaryCaptionMiddleRegular,
        )
        WizardText(
            text = "Middle Medium",
            style = WizardTextStyle.secondaryCaptionMiddleMedium,
        )
        WizardText(
            text = "Middle Bold",
            style = WizardTextStyle.secondaryCaptionMiddleBold,
        )
        WizardText(
            text = "Small Regular",
            style = WizardTextStyle.secondaryCaptionSmallRegular,
        )
        WizardText(
            text = "Small Medium",
            style = WizardTextStyle.secondaryCaptionSmallMedium,
        )
        WizardText(
            text = "Small Bold",
            style = WizardTextStyle.secondaryCaptionSmallBold,
        )

        WizardText(
            text = "Secondary Overline",
            textColor = WizardColors.colors().contentPrimary,
            style = WizardTextStyle.primaryHeadingMiddleBold,
            modifier = Modifier.fillMaxWidth().padding(top = WizardGlobalSpacing.middle),
            textAlign = TextAlign.Center,
        )

        WizardText(
            text = "Small Regular",
            style = WizardTextStyle.secondaryOverlineSmallRegular,
        )
        WizardText(
            text = "Small Medium",
            style = WizardTextStyle.secondaryOverlineSmallMedium,
        )
        WizardText(
            text = "Small Bold",
            style = WizardTextStyle.secondaryOverlineSmallBold,
        )
    }
}
