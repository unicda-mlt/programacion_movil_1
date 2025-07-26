package com.lab_2025_07_24_navigation.route

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.route.AppNestedRoute
import androidx.navigation.compose.composable
import com.lab_2025_07_24_navigation.app.ConfirmationScreen
import com.lab_2025_07_24_navigation.app.FinancialDataScreen
import com.lab_2025_07_24_navigation.app.PersonalDataScreen
import com.lab_2025_07_24_navigation.app.SuccessScreen
import com.lab_2025_07_24_navigation.app.WelcomeScreen


fun NavGraphBuilder.lab20250724NavGraph(navController: NavHostController) {
    navigation(
        route = AppNestedRoute.Lab20250724.route,
        startDestination = Lab20250724AppRoute.WELCOME.route,
    ) {
        composable(Lab20250724AppRoute.WELCOME.route) {
            WelcomeScreen(router = AppRouterNext(onNavigateToNext = {
                navController.navigate(Lab20250724AppRoute.PERSONAL_DATA.route)
            }))
        }
        composable(Lab20250724AppRoute.PERSONAL_DATA.route) {
            PersonalDataScreen(router = AppRouterNext(onNavigateToNext = {
                navController.navigate(Lab20250724AppRoute.FINANCIAL_DATA.route)
            }))
        }
        composable(Lab20250724AppRoute.FINANCIAL_DATA.route) {
            FinancialDataScreen(router = AppRouterNext(onNavigateToNext = {
                navController.navigate(Lab20250724AppRoute.CONFIRMATION.route)
            }))
        }
        composable(Lab20250724AppRoute.CONFIRMATION.route) {
            ConfirmationScreen(router = AppRouterNext(onNavigateToNext = {
                navController.navigate(Lab20250724AppRoute.SUCCESS.route)
            }))
        }
        composable(Lab20250724AppRoute.SUCCESS.route) {
            SuccessScreen(router = AppRouterHome(onNavigateToHome = {
                navController.popBackStack(Lab20250724AppRoute.WELCOME.route, false)
            }))
        }
    }
}