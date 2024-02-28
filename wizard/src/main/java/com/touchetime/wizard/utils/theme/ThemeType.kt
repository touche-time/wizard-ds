package com.touchetime.wizard.utils.theme

enum class ThemeType {
    LIGHT,
    DARK,
    PARIS_2024;

    companion object {
        fun getByName(themeType: String?): ThemeType {
            return ThemeType.values().find { it.name == themeType } ?: DARK
        }
    }
}
