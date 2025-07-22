package com.labs_2027_07_17

import androidx.compose.runtime.Composable
import com.component.LabItem
import com.component.LabListScreen
import com.route.Screen
import com.route.ScreenRouter


@Composable
fun Lab20250717Screen(router: ScreenRouter<Screen.Labs20250717>) {
    val labs: List<LabItem> = listOf(
        LabItem(Screen.Labs20250717_Exercise_1, "Exercise #1"),
        LabItem(Screen.Labs20250717_Exercise_2, "Exercise #2"),
        LabItem(Screen.Labs20250717_Exercise_3, "Exercise #3"),
        LabItem(Screen.Labs20250717_Exercise_4, "Exercise #4"),
        LabItem(Screen.Labs20250717_Exercise_5, "Exercise #5"),
        LabItem(Screen.Labs20250717_Exercise_6, "Exercise #6"),
        LabItem(Screen.Labs20250717_Exercise_7, "Exercise #7"),
        LabItem(Screen.Labs20250717_Exercise_8, "Exercise #8"),
        LabItem(Screen.Labs20250717_Exercise_9, "Exercise #9"),
        LabItem(Screen.Labs20250717_Exercise_10, "Exercise #10"),
    )

    LabListScreen(
        title = "2025-07-17 Exercises",
        labs,
        navController = router.navController
    )
}