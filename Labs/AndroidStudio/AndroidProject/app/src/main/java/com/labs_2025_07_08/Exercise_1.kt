package com.labs_2025_07_08

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun Lab20250708_Exercise_1_Screen() {
    MiPrimerComposable()
}

@Composable
fun MiPrimerComposable() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "¡Hola, Jetpack Compose!",
            color = MaterialTheme.colorScheme.secondary,
            style = TextStyle(
                fontWeight = FontWeight(700),
                fontSize = 26.sp,
                textAlign = TextAlign.Center,
            ),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Lab20250708_Exercise_1_Screen_Preview() {
    Lab20250708_Exercise_1_Screen()
}