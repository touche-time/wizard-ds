package com.touchetime.wizardds.data.sharedpreferences

import android.content.Context
import androidx.core.content.edit
import com.touchetime.wizard.utils.theme.ThemeType

class WizardSharedPreferences(context: Context) {

    private val sharedPreferences =
        context.getSharedPreferences(
            WizardSharedPreferences::class.java.name,
            Context.MODE_PRIVATE,
        )

    var theme: String?
        get() = sharedPreferences.getString("GET_THEME_VISIBILITY", ThemeType.DARK.name)
        set(value) {
            sharedPreferences.edit {
                putString("GET_THEME_VISIBILITY", value)
            }
        }
}
