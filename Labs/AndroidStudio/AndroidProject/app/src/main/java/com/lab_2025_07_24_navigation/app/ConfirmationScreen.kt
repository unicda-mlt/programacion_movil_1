package com.lab_2025_07_24_navigation.app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lab_2025_07_24_navigation.route.AppRouterNext
import com.ui.theme.AppTheme


@Composable
fun ConfirmationScreen(router: AppRouterNext) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "Final Step: Confirmation",
            style = MaterialTheme.typography.headlineSmall.merge(TextStyle(
                color = MaterialTheme.colorScheme.secondary,
                fontWeight = FontWeight.SemiBold
            ))
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Ensure your information is correct before submitting your application.",
            color = MaterialTheme.colorScheme.tertiary
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = router.onNavigateToNext,
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ConfirmationScreen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        ConfirmationScreen(
            router = AppRouterNext(
                onNavigateToNext = {}
            )
        )
    }
}

