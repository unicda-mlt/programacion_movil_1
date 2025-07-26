package com.route.main

import com.lab_2027_07_24_navigation.route.Lab20250724AppRoute
import com.route.AppRouteInfo


sealed class MainAppRoute(override val route: String, override val title: String) : AppRouteInfo {
    data object Home : MainAppRoute("home", "Home")

    data object Labs20250708 : MainAppRoute("labs_2025_07_08","Labs 2025-07-08")
    data object Labs20250708_Exercise_1 : MainAppRoute("labs_2025_07_08_exercise_1","Exercise#1 / 2025-07-08")
    data object Labs20250708_Exercise_2 : MainAppRoute("labs_2025_07_08_exercise_2","Exercise#2 / 2025-07-08")
    data object Labs20250708_Exercise_3 : MainAppRoute("labs_2025_07_08_exercise_3","Exercise#3 / 2025-07-08")
    data object Labs20250708_Exercise_4 : MainAppRoute("labs_2025_07_08_exercise_4","Exercise#4 / 2025-07-08")
    data object Labs20250708_Exercise_5 : MainAppRoute("labs_2025_07_08_exercise_5","Exercise#5 / 2025-07-08")
    data object Labs20250708_Exercise_6 : MainAppRoute("labs_2025_07_08_exercise_6","Exercise#6 / 2025-07-08")
    data object Labs20250708_Exercise_7 : MainAppRoute("labs_2025_07_08_exercise_7","Exercise#7 / 2025-07-08")
    data object Labs20250708_Exercise_8 : MainAppRoute("labs_2025_07_08_exercise_8","Exercise#8 / 2025-07-08")
    data object Labs20250708_Exercise_9 : MainAppRoute("labs_2025_07_08_exercise_9","Exercise#9 / 2025-07-08")
    data object Labs20250708_Exercise_10 : MainAppRoute("labs_2025_07_08_exercise_10","Exercise#10 / 2025-07-08")

    data object Labs20250717 : MainAppRoute("labs_2025_07_17","Labs 2025-07-17")
    data object Labs20250717_Exercise_1 : MainAppRoute("labs_2025_07_17_exercise_1","Exercise#1 / 2025-07-17")
    data object Labs20250717_Exercise_2 : MainAppRoute("labs_2025_07_17_exercise_2","Exercise#2 / 2025-07-17")
    data object Labs20250717_Exercise_3 : MainAppRoute("labs_2025_07_17_exercise_3","Exercise#3 / 2025-07-17")
    data object Labs20250717_Exercise_4 : MainAppRoute("labs_2025_07_17_exercise_4","Exercise#4 / 2025-07-17")
    data object Labs20250717_Exercise_5 : MainAppRoute("labs_2025_07_17_exercise_5","Exercise#5 / 2025-07-17")
    data object Labs20250717_Exercise_6 : MainAppRoute("labs_2025_07_17_exercise_6","Exercise#6 / 2025-07-17")
    data object Labs20250717_Exercise_7 : MainAppRoute("labs_2025_07_17_exercise_7","Exercise#7 / 2025-07-17")
    data object Labs20250717_Exercise_8 : MainAppRoute("labs_2025_07_17_exercise_8","Exercise#8 / 2025-07-17")
    data object Labs20250717_Exercise_9 : MainAppRoute("labs_2025_07_17_exercise_9","Exercise#9 / 2025-07-17")
    data object Labs20250717_Exercise_10 : MainAppRoute("labs_2025_07_17_exercise_10","Exercise#10 / 2025-07-17")

    data object Lab20250724 : MainAppRoute(Lab20250724AppRoute.WELCOME.route,"")

    companion object {
        private val screens: List<MainAppRoute> by lazy {
            listOfNotNull(
                Home,
                Labs20250708,
                Labs20250708_Exercise_1,
                Labs20250708_Exercise_2,
                Labs20250708_Exercise_3,
                Labs20250708_Exercise_4,
                Labs20250708_Exercise_5,
                Labs20250708_Exercise_6,
                Labs20250708_Exercise_7,
                Labs20250708_Exercise_8,
                Labs20250708_Exercise_9,
                Labs20250708_Exercise_10,
                Labs20250717,
                Labs20250717_Exercise_1,
                Labs20250717_Exercise_2,
                Labs20250717_Exercise_3,
                Labs20250717_Exercise_4,
                Labs20250717_Exercise_5,
                Labs20250717_Exercise_6,
                Labs20250717_Exercise_7,
                Labs20250717_Exercise_8,
                Labs20250717_Exercise_9,
                Labs20250717_Exercise_10,
                Lab20250724
            )
        }

        fun fromRoute(route: String): AppRouteInfo? {
            return screens.singleOrNull { it.route == route }
        }
    }
}