package com.main.androidproject

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.component.LabItem
import com.component.LabListScreen
import com.route.main.MainAppRoute

@Composable
fun HomeScreen(navController: NavHostController) {
    val labs: List<LabItem> = listOf(
        LabItem(MainAppRoute.Labs20250708, "2025-07-08"),
        LabItem(MainAppRoute.Labs20250717, "2025-07-17"),
        LabItem(MainAppRoute.Lab20250724, "2025-07-24"),
    )

    LabListScreen(
        title = "Summary Lab List",
        labs,
        navController
    )
}