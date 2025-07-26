package com.labs_2027_07_17

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ui.theme.AppTheme


@Composable
fun Lab20250717_Exercise_3_Screen() {
    EspejoDeTexto()
}

@Composable
fun EspejoDeTexto() {
    var texto by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp, 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = texto,
            onValueChange = {
                texto = it
            }
        )

        Spacer(Modifier.height(30.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = if (texto.isEmpty()) "Texto Espejo, Boom!" else texto,
            style = TextStyle(
                color = MaterialTheme.colorScheme.secondary,
                fontSize = 18.sp,
                textAlign = TextAlign.Start
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Lab20250717_Exercise_3_Screen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        Lab20250717_Exercise_3_Screen()
    }
}