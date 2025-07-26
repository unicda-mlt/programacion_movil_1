package com.route


sealed class AppNestedRoute(val route: String) {
    data object MainLabs : AppNestedRoute("main_labs")
    data object Lab20250724 : AppNestedRoute("lab_20250724")
}