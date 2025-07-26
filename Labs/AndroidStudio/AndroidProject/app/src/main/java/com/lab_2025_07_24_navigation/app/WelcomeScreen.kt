package com.lab_2025_07_24_navigation.app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lab_2025_07_24_navigation.route.AppRouterNext
import com.ui.theme.AppTheme


@Composable
fun WelcomeScreen(router: AppRouterNext) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Apply for your credit card easily")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = router.onNavigateToNext) {
            Text("Start Application")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        WelcomeScreen(
            router = AppRouterNext(
                onNavigateToNext = {}
            )
        )
    }
}

