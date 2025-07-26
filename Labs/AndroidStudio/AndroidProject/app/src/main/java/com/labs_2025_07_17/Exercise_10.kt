package com.labs_2025_07_17

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ui.theme.AppTheme


@Composable
fun Lab20250717_Exercise_10_Screen() {
    EditorDeTextoConContador()
}

@Composable
fun EditorDeTextoConContador() {
    var texto by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 40.dp,
                start = 10.dp,
                bottom = 0.dp,
                end = 10.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Conteo de Caracteres \uD83D\uDC47",
                style = TextStyle(
                    color = MaterialTheme.colorScheme.tertiary,
                    fontSize = 18.sp,
                    textAlign = TextAlign.End
                )
            )

            Spacer(Modifier.height(5.dp))

            Text(
                modifier = Modifier.fillMaxWidth(),
                text = texto.length.toString(),
                style = TextStyle(
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.End
                )
            )
        }

        Spacer(Modifier.height(25.dp))

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = texto,
            onValueChange = {
                texto = it
            },
            placeholder = {
                Text("Escribe y el contador subirá")
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Lab20250717_Exercise_10_Screen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        Lab20250717_Exercise_10_Screen()
    }
}