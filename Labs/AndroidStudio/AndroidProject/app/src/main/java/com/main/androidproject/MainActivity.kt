package com.main.androidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.component.LabItem
import com.component.LabListScreen
import com.route.AppNavHost
import com.route.Screen
import com.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            AppTheme (
                darkTheme = false,
                dynamicColor = false
            ) {
                MainScaffold(navController = navController) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    ) {
                        AppNavHost(navController = navController)
                    }
                }
            }
        }
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {
    val labs: List<LabItem> = listOf(
        LabItem(Screen.Labs20250708, "2025-07-08"),
        LabItem(Screen.Labs20250717, "2025-07-17")
    )

    LabListScreen(
        title = "Summary Lab List",
        labs,
        navController
    )
}

@Composable
fun MainScaffold(navController: NavHostController, content: @Composable (PaddingValues) -> Unit) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route
    val currentScreen = Screen.fromRoute(currentRoute)

    Scaffold(
        topBar = {
            CustomTopAppBar(currentScreen, navController)
        },
    ) { innerPadding ->
        content(innerPadding)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar (currentScreen: Screen?, navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(elevation = 5.dp)
    ) {
        TopAppBar(
            title = {
                Text(
                    text = currentScreen?.title ?: "",
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
