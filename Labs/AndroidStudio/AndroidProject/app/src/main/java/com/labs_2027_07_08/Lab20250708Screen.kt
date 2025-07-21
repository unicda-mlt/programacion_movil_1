package com.labs_2027_07_08

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.route.Screen
import com.route.ScreenRouter


@Composable
fun Lab20250708Screen(router: ScreenRouter<Screen.Labs20250708>) {
    Text(router.screen.title)
}