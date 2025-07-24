package com.labs_2027_07_08

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ui.theme.AppTheme

@Composable
fun Lab20250708_Exercise_4_Screen() {
    ArticuloSimple()
}

@Composable
fun ArticuloSimple() {
    Column (
        modifier = Modifier.fillMaxSize().padding(20.dp)
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Aprendiendo Jetpack Compose",
            style = TextStyle(
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline
            )
        )

        Spacer(Modifier.height(16.dp))

        Text(
            text = """
                Jetpack Compose simplifica enormemente la creación de interfaces en Android.

                En lugar de inflar layouts XML, describes tu UI en código Kotlin de manera declarativa.

                Cambios en el estado provocan recomposición automática, lo que reduce errores y hace el código más fácil de mantener.

                En este artículo veremos conceptos básicos como Composables, Column, Text y Spacer. Además, también hablaremos brevemente de cómo aplicar estilos tipográficos usando MaterialTheme.

                ¡Compose te permite iterar más rápido y escribir menos código!
            """.trimIndent(),
            style = TextStyle(
                fontSize = 16.sp,
                textAlign = TextAlign.Justify,
                color = MaterialTheme.colorScheme.secondary
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Lab20250708_Exercise_4_Screen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        Lab20250708_Exercise_4_Screen()
    }
}