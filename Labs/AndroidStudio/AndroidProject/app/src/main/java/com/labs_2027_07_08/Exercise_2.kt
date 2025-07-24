package com.labs_2027_07_08

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Lab20250708_Exercise_2_Screen() {
    TarjetaDePresentacion()
}

@Composable
fun TarjetaDePresentacion() {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp)
    ) {
        Text(
            text = "Máximo Liberata Torres",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "Desarrollador BackEnd",
            fontSize = 18.sp,
            color = Color.Gray
        )
        Text(
            text = "maximo.liberata@unicda.edu.do",
            fontSize = 16.sp,
            color = Color.DarkGray
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Lab20250708_Exercise_2_Screen_Preview() {
    Lab20250708_Exercise_2_Screen()
}