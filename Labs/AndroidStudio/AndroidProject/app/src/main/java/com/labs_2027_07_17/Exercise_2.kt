package com.labs_2027_07_17

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ui.theme.AppTheme



@Composable
fun Lab20250717_Exercise_2_Screen() {
    MensajeSecreto(false)
}

@Composable
fun MensajeSecreto(initialValue: Boolean) {
    var mostrarMensaje by remember { mutableStateOf(initialValue) }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp, 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedButton (
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
            ),
            onClick = {
                mostrarMensaje = !mostrarMensaje
            }
        ) {
            Text(
                text = if (mostrarMensaje) "Ocultar Secreto" else "Revelar Secreto",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.surfaceTint,
                )
            )
        }

        Spacer(Modifier.height(30.dp))

        if (mostrarMensaje) {
            Text(
                text = "¡Mensaje Ultra Secreto!",
                style = TextStyle(
                    color = MaterialTheme.colorScheme.secondary,
                    fontSize = 18.sp
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Lab20250717_Exercise_2_Screen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        MensajeSecreto(true)
    }
}