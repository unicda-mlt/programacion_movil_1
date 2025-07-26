package com.main.androidproject

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.lab_2025_07_24_navigation.route.Lab20250724AppRoute
import com.route.AppNestedRoute
import com.route.AppRouteInfo
import com.route.main.MainAppRoute


@Composable
fun MainScaffold(navController: NavHostController, content: @Composable (PaddingValues) -> Unit) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val parentRoute = backStackEntry?.destination?.parent?.route
    val currentRoute = backStackEntry?.destination?.route
    var currentAppRoute: AppRouteInfo? = null

    if (parentRoute !== null && currentRoute !== null) {
        currentAppRoute = when (parentRoute) {
            AppNestedRoute.MainLabs.route ->  MainAppRoute.fromRoute(currentRoute)
            AppNestedRoute.Lab20250724.route -> Lab20250724AppRoute.fromRoute(currentRoute)
            else -> null
        }
    }

    Scaffold(
        topBar = {
            CustomTopAppBar(currentAppRoute, navController)
        },
    ) { innerPadding ->
        content(innerPadding)
    }
}
