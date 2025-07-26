package com.labs_2027_07_08

import androidx.compose.runtime.Composable
import com.component.LabItem
import com.component.LabListScreen
import com.route.main.MainAppRoute
import com.route.main.AppRouter


@Composable
fun Lab20250708Screen(router: AppRouter<MainAppRoute.Labs20250708>) {
    val labs: List<LabItem> = listOf(
        LabItem(MainAppRoute.Labs20250708_Exercise_1, "Exercise #1"),
        LabItem(MainAppRoute.Labs20250708_Exercise_2, "Exercise #2"),
        LabItem(MainAppRoute.Labs20250708_Exercise_3, "Exercise #3"),
        LabItem(MainAppRoute.Labs20250708_Exercise_4, "Exercise #4"),
        LabItem(MainAppRoute.Labs20250708_Exercise_5, "Exercise #5"),
        LabItem(MainAppRoute.Labs20250708_Exercise_6, "Exercise #6"),
        LabItem(MainAppRoute.Labs20250708_Exercise_7, "Exercise #7"),
        LabItem(MainAppRoute.Labs20250708_Exercise_8, "Exercise #8"),
        LabItem(MainAppRoute.Labs20250708_Exercise_9, "Exercise #9"),
        LabItem(MainAppRoute.Labs20250708_Exercise_10, "Exercise #10"),
    )

    LabListScreen(
        title = "2025-07-08 Exercises",
        labs,
        navController = router.navController
    )
}