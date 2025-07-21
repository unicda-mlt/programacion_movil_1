package com.route

sealed class Screen(val route: String, val title: String) {
    data object Home : Screen("home", "Home")
    data object Labs20250708 : Screen("labs_2025_07_08","Labs 2025-07-08")
    data object Labs20250717 : Screen("labs_2025_07_17","Labs 2025-07-17")

    companion object {
        private val screens = listOf(Home, Labs20250708, Labs20250717)

        fun fromRoute(route: String?): Screen? {
            return screens.find { it.route == route }
        }
    }
}