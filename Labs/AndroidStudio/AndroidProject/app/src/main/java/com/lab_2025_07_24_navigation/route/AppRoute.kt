package com.lab_2025_07_24_navigation.route

import com.route.AppRouteInfo

sealed class Lab20250724AppRoute(override val route: String, override val title: String) : AppRouteInfo {
    data object WELCOME : Lab20250724AppRoute("lab_20250724_welcome", "Mobile Bank")
    data object PERSONAL_DATA : Lab20250724AppRoute("lab_20250724_personal_data", "Personal Data")
    data object FINANCIAL_DATA : Lab20250724AppRoute("lab_20250724_financial_data", "Financial Data")
    data object CONFIRMATION : Lab20250724AppRoute("lab_20250724_confirmation", "Confirmation")
    data object SUCCESS : Lab20250724AppRoute("lab_20250724_success", "Success")

    companion object {
        private val screens: List<Lab20250724AppRoute> by lazy {
            listOfNotNull(
                WELCOME,
                PERSONAL_DATA,
                FINANCIAL_DATA,
                CONFIRMATION,
                SUCCESS
            )
        }

        fun fromRoute(route: String): AppRouteInfo? {
            return screens.singleOrNull { it.route == route }
        }
    }
}