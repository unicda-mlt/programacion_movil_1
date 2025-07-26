package com.route

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.lab_2027_07_24_navigation.route.lab20250724NavGraph
import com.route.main.mainNavGraph


@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController, startDestination = AppNestedRoute.MainLabs.route) {
        mainNavGraph(navController)
        lab20250724NavGraph(navController)
    }
}