package com.labs_2027_07_17

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
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
fun Lab20250717_Exercise_5_Screen() {
    ContadorDeClicsConRotacion()
}

@Composable
fun ContadorDeClicsConRotacion() {
    var contadorRemember by remember { mutableStateOf(0) }
    var contadorSaveable by rememberSaveable { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp, 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Only Remember",
                    style = TextStyle(
                        color = MaterialTheme.colorScheme.tertiary,
                        fontSize = 16.sp,
                        textDecoration = TextDecoration.Underline,
                        textAlign = TextAlign.Center
                    )
                )

                Spacer(Modifier.height(5.dp))

                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = contadorRemember.toString(),
                    style = TextStyle(
                        color = MaterialTheme.colorScheme.primary,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Remember Saveable",
                    style = TextStyle(
                        color = MaterialTheme.colorScheme.tertiary,
                        fontSize = 16.sp,
                        textDecoration = TextDecoration.Underline,
                        textAlign = TextAlign.Center
                    )
                )

                Spacer(Modifier.height(5.dp))

                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = contadorSaveable.toString(),
                    style = TextStyle(
                        color = MaterialTheme.colorScheme.primary,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                )
            }
        }

        Spacer(Modifier.height(24.dp))

        OutlinedButton (
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
            ),
            onClick = {
                contadorRemember++
                contadorSaveable++
            }
        ) {
            Text(
                text = "Incrementar Contador",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.surfaceTint,
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Lab20250717_Exercise_5_Screen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        Lab20250717_Exercise_5_Screen()
    }
}