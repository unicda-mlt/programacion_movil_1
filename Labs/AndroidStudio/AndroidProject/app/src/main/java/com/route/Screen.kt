package com.route

sealed class Screen(val route: String, val title: String) {
    data object Home : Screen("home", "Home")

    data object Labs20250708 : Screen("labs_2025_07_08","Labs 2025-07-08")
    data object Labs20250708_Exercise_1 : Screen("labs_2025_07_08_exercise_1","Exercise#1 / 2025-07-08")
    data object Labs20250708_Exercise_2 : Screen("labs_2025_07_08_exercise_2","Exercise#2 / 2025-07-08")
    data object Labs20250708_Exercise_3 : Screen("labs_2025_07_08_exercise_3","Exercise#3 / 2025-07-08")
    data object Labs20250708_Exercise_4 : Screen("labs_2025_07_08_exercise_4","Exercise#4 / 2025-07-08")
    data object Labs20250708_Exercise_5 : Screen("labs_2025_07_08_exercise_5","Exercise#5 / 2025-07-08")
    data object Labs20250708_Exercise_6 : Screen("labs_2025_07_08_exercise_6","Exercise#6 / 2025-07-08")
    data object Labs20250708_Exercise_7 : Screen("labs_2025_07_08_exercise_7","Exercise#7 / 2025-07-08")
    data object Labs20250708_Exercise_8 : Screen("labs_2025_07_08_exercise_8","Exercise#8 / 2025-07-08")
    data object Labs20250708_Exercise_9 : Screen("labs_2025_07_08_exercise_9","Exercise#9 / 2025-07-08")
    data object Labs20250708_Exercise_10 : Screen("labs_2025_07_08_exercise_10","Exercise#10 / 2025-07-08")

    data object Labs20250717 : Screen("labs_2025_07_17","Labs 2025-07-17")
    data object Labs20250717_Exercise_1 : Screen("labs_2025_07_17_exercise_1","Exercise#1 / 2025-07-17")
    data object Labs20250717_Exercise_2 : Screen("labs_2025_07_17_exercise_2","Exercise#2 / 2025-07-17")
    data object Labs20250717_Exercise_3 : Screen("labs_2025_07_17_exercise_3","Exercise#3 / 2025-07-17")
    data object Labs20250717_Exercise_4 : Screen("labs_2025_07_17_exercise_4","Exercise#4 / 2025-07-17")
    data object Labs20250717_Exercise_5 : Screen("labs_2025_07_17_exercise_5","Exercise#5 / 2025-07-17")
    data object Labs20250717_Exercise_6 : Screen("labs_2025_07_17_exercise_6","Exercise#6 / 2025-07-17")
    data object Labs20250717_Exercise_7 : Screen("labs_2025_07_17_exercise_7","Exercise#7 / 2025-07-17")
    data object Labs20250717_Exercise_8 : Screen("labs_2025_07_17_exercise_8","Exercise#8 / 2025-07-17")
    data object Labs20250717_Exercise_9 : Screen("labs_2025_07_17_exercise_9","Exercise#9 / 2025-07-17")
    data object Labs20250717_Exercise_10 : Screen("labs_2025_07_17_exercise_10","Exercise#10 / 2025-07-17")

    companion object {
        private val screens = listOf(
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
            Labs20250717_Exercise_10
        )

        fun fromRoute(route: String?): Screen? {
            return screens.find { it.route == route }
        }
    }
}