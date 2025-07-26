package com.labs_2025_07_08

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ui.theme.AppTheme

@Composable
fun Lab20250708_Exercise_8_Screen() {
    BarraDeProgreso(0.4f)
}

@Composable
fun BarraDeProgreso(progressValue: Float) {
    require(progressValue in 0.0f..1.0f) { "progress must be in 0.0..1.0 (was $progressValue)" }

    val boxSize = 20.dp

    Box(
        modifier = Modifier.padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(boxSize)
                .background(MaterialTheme.colorScheme.primaryContainer)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(progressValue)
                    .height(boxSize)
                    .background(MaterialTheme.colorScheme.primary)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Lab20250708_Exercise_8_Screen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        BarraDeProgreso(0.6f)
    }
}