package com.route

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.labs_2027_07_08.Lab20250708Screen
import com.labs_2027_07_08.Lab20250708_Exercise_10_Screen
import com.labs_2027_07_08.Lab20250708_Exercise_1_Screen
import com.labs_2027_07_08.Lab20250708_Exercise_2_Screen
import com.labs_2027_07_08.Lab20250708_Exercise_3_Screen
import com.labs_2027_07_08.Lab20250708_Exercise_4_Screen
import com.labs_2027_07_08.Lab20250708_Exercise_5_Screen
import com.labs_2027_07_08.Lab20250708_Exercise_6_Screen
import com.labs_2027_07_08.Lab20250708_Exercise_7_Screen
import com.labs_2027_07_08.Lab20250708_Exercise_8_Screen
import com.labs_2027_07_08.Lab20250708_Exercise_9_Screen
import com.labs_2027_07_17.Lab20250717Screen
import com.labs_2027_07_17.Lab20250717_Exercise_10_Screen
import com.labs_2027_07_17.Lab20250717_Exercise_1_Screen
import com.labs_2027_07_17.Lab20250717_Exercise_2_Screen
import com.labs_2027_07_17.Lab20250717_Exercise_3_Screen
import com.labs_2027_07_17.Lab20250717_Exercise_4_Screen
import com.labs_2027_07_17.Lab20250717_Exercise_5_Screen
import com.labs_2027_07_17.Lab20250717_Exercise_6_Screen
import com.labs_2027_07_17.Lab20250717_Exercise_7_Screen
import com.labs_2027_07_17.Lab20250717_Exercise_8_Screen
import com.labs_2027_07_17.Lab20250717_Exercise_9_Screen
import com.main.androidproject.HomeScreen


@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(Screen.Labs20250708.route) {
            Lab20250708Screen(
                router = ScreenRouter(Screen.Labs20250708, navController)
            )
        }
        composable(Screen.Labs20250708_Exercise_1.route) {
            Lab20250708_Exercise_1_Screen()
        }
        composable(Screen.Labs20250708_Exercise_2.route) {
            Lab20250708_Exercise_2_Screen()
        }
        composable(Screen.Labs20250708_Exercise_3.route) {
            Lab20250708_Exercise_3_Screen()
        }
        composable(Screen.Labs20250708_Exercise_4.route) {
            Lab20250708_Exercise_4_Screen()
        }
        composable(Screen.Labs20250708_Exercise_5.route) {
            Lab20250708_Exercise_5_Screen()
        }
        composable(Screen.Labs20250708_Exercise_6.route) {
            Lab20250708_Exercise_6_Screen()
        }
        composable(Screen.Labs20250708_Exercise_7.route) {
            Lab20250708_Exercise_7_Screen()
        }
        composable(Screen.Labs20250708_Exercise_8.route) {
            Lab20250708_Exercise_8_Screen()
        }
        composable(Screen.Labs20250708_Exercise_9.route) {
            Lab20250708_Exercise_9_Screen()
        }
        composable(Screen.Labs20250708_Exercise_10.route) {
            Lab20250708_Exercise_10_Screen()
        }
        composable(Screen.Labs20250717.route) {
            Lab20250717Screen(
                router = ScreenRouter(Screen.Labs20250717, navController)
            )
        }
        composable(Screen.Labs20250717_Exercise_1.route) {
            Lab20250717_Exercise_1_Screen()
        }
        composable(Screen.Labs20250717_Exercise_2.route) {
            Lab20250717_Exercise_2_Screen()
        }
        composable(Screen.Labs20250717_Exercise_3.route) {
            Lab20250717_Exercise_3_Screen()
        }
        composable(Screen.Labs20250717_Exercise_4.route) {
            Lab20250717_Exercise_4_Screen()
        }
        composable(Screen.Labs20250717_Exercise_5.route) {
            Lab20250717_Exercise_5_Screen()
        }
        composable(Screen.Labs20250717_Exercise_6.route) {
            Lab20250717_Exercise_6_Screen()
        }
        composable(Screen.Labs20250717_Exercise_7.route) {
            Lab20250717_Exercise_7_Screen()
        }
        composable(Screen.Labs20250717_Exercise_8.route) {
            Lab20250717_Exercise_8_Screen()
        }
        composable(Screen.Labs20250717_Exercise_9.route) {
            Lab20250717_Exercise_9_Screen()
        }
        composable(Screen.Labs20250717_Exercise_10.route) {
            Lab20250717_Exercise_10_Screen()
        }
    }
}