package com.labs_2027_07_17

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.route.Screen
import com.route.ScreenRouter


@Composable
fun Lab20250717Screen(router: ScreenRouter<Screen.Labs20250717>) {
    Text(router.screen.title)
}