package com.main.androidproject

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.route.AppRouteInfo


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar (currentAppRoute: AppRouteInfo?, navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(elevation = 5.dp)
    ) {
        TopAppBar(
            title = {
                Text(
                    text = currentAppRoute?.title ?: "",
                    fontWeight = FontWeight(700)
                )
            },
            navigationIcon = {
                if (navController.previousBackStackEntry != null) {
                    IconButton (onClick = { navController.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            }
        )
    }
}