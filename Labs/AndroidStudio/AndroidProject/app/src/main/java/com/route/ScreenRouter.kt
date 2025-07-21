package com.route

import androidx.navigation.NavController

class ScreenRouter<T : Screen>(val screen: T, navController: NavController)
