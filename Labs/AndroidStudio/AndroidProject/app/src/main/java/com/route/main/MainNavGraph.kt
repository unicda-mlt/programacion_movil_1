package com.route.main

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.labs_2025_07_08.Lab20250708Screen
import com.labs_2025_07_08.Lab20250708_Exercise_10_Screen
import com.labs_2025_07_08.Lab20250708_Exercise_1_Screen
import com.labs_2025_07_08.Lab20250708_Exercise_2_Screen
import com.labs_2025_07_08.Lab20250708_Exercise_3_Screen
import com.labs_2025_07_08.Lab20250708_Exercise_4_Screen
import com.labs_2025_07_08.Lab20250708_Exercise_5_Screen
import com.labs_2025_07_08.Lab20250708_Exercise_6_Screen
import com.labs_2025_07_08.Lab20250708_Exercise_7_Screen
import com.labs_2025_07_08.Lab20250708_Exercise_8_Screen
import com.labs_2025_07_08.Lab20250708_Exercise_9_Screen
import com.labs_2025_07_17.Lab20250717Screen
import com.labs_2025_07_17.Lab20250717_Exercise_10_Screen
import com.labs_2025_07_17.Lab20250717_Exercise_1_Screen
import com.labs_2025_07_17.Lab20250717_Exercise_2_Screen
import com.labs_2025_07_17.Lab20250717_Exercise_3_Screen
import com.labs_2025_07_17.Lab20250717_Exercise_4_Screen
import com.labs_2025_07_17.Lab20250717_Exercise_5_Screen
import com.labs_2025_07_17.Lab20250717_Exercise_6_Screen
import com.labs_2025_07_17.Lab20250717_Exercise_7_Screen
import com.labs_2025_07_17.Lab20250717_Exercise_8_Screen
import com.labs_2025_07_17.Lab20250717_Exercise_9_Screen
import com.main.androidproject.HomeScreen
import com.route.AppNestedRoute


fun NavGraphBuilder.mainNavGraph(navController: NavHostController) {
    navigation(
        route = AppNestedRoute.MainLabs.route,
        startDestination = MainAppRoute.Home.route,
    ) {
        composable(MainAppRoute.Home.route) {
            HomeScreen(navController)
        }
        composable(MainAppRoute.Labs20250708.route) {
            Lab20250708Screen(
                router = AppRouter(MainAppRoute.Labs20250708, navController)
            )
        }
        composable(MainAppRoute.Labs20250708_Exercise_1.route) {
            Lab20250708_Exercise_1_Screen()
        }
        composable(MainAppRoute.Labs20250708_Exercise_2.route) {
            Lab20250708_Exercise_2_Screen()
        }
        composable(MainAppRoute.Labs20250708_Exercise_3.route) {
            Lab20250708_Exercise_3_Screen()
        }
        composable(MainAppRoute.Labs20250708_Exercise_4.route) {
            Lab20250708_Exercise_4_Screen()
        }
        composable(MainAppRoute.Labs20250708_Exercise_5.route) {
            Lab20250708_Exercise_5_Screen()
        }
        composable(MainAppRoute.Labs20250708_Exercise_6.route) {
            Lab20250708_Exercise_6_Screen()
        }
        composable(MainAppRoute.Labs20250708_Exercise_7.route) {
            Lab20250708_Exercise_7_Screen()
        }
        composable(MainAppRoute.Labs20250708_Exercise_8.route) {
            Lab20250708_Exercise_8_Screen()
        }
        composable(MainAppRoute.Labs20250708_Exercise_9.route) {
            Lab20250708_Exercise_9_Screen()
        }
        composable(MainAppRoute.Labs20250708_Exercise_10.route) {
            Lab20250708_Exercise_10_Screen()
        }
        composable(MainAppRoute.Labs20250717.route) {
            Lab20250717Screen(
                router = AppRouter(MainAppRoute.Labs20250717, navController)
            )
        }
        composable(MainAppRoute.Labs20250717_Exercise_1.route) {
            Lab20250717_Exercise_1_Screen()
        }
        composable(MainAppRoute.Labs20250717_Exercise_2.route) {
            Lab20250717_Exercise_2_Screen()
        }
        composable(MainAppRoute.Labs20250717_Exercise_3.route) {
            Lab20250717_Exercise_3_Screen()
        }
        composable(MainAppRoute.Labs20250717_Exercise_4.route) {
            Lab20250717_Exercise_4_Screen()
        }
        composable(MainAppRoute.Labs20250717_Exercise_5.route) {
            Lab20250717_Exercise_5_Screen()
        }
        composable(MainAppRoute.Labs20250717_Exercise_6.route) {
            Lab20250717_Exercise_6_Screen()
        }
        composable(MainAppRoute.Labs20250717_Exercise_7.route) {
            Lab20250717_Exercise_7_Screen()
        }
        composable(MainAppRoute.Labs20250717_Exercise_8.route) {
            Lab20250717_Exercise_8_Screen()
        }
        composable(MainAppRoute.Labs20250717_Exercise_9.route) {
            Lab20250717_Exercise_9_Screen()
        }
        composable(MainAppRoute.Labs20250717_Exercise_10.route) {
            Lab20250717_Exercise_10_Screen()
        }
    }
}