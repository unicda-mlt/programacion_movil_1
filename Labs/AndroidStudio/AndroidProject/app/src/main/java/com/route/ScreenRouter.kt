package com.route

import androidx.navigation.NavHostController

class ScreenRouter<T : Screen>(val screen: T, val navController: NavHostController)
