package com.labs_2027_07_08

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ui.theme.AppTheme

@Composable
fun Lab20250708_Exercise_10_Screen() {
    PantallaLogin()
}

@Composable
fun PantallaLogin() {
    Box(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.surface)
            .padding(20.dp)
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text (
                text = "Bienvenido",
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontSize = 36.sp,
                    color = MaterialTheme.colorScheme.primary,
                )
            )

            Spacer(Modifier.height(50.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, MaterialTheme.colorScheme.tertiary, RoundedCornerShape(8.dp))
                    .padding(10.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = "Usuario",
                    style = TextStyle(
                        fontSize = 20.sp,
                        color = Color(0,0,0,90)
                    )
                )
            }

            Spacer(Modifier.height(10.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, MaterialTheme.colorScheme.tertiary, RoundedCornerShape(8.dp))
                    .padding(10.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = "Contraseña",
                    style = TextStyle(
                        fontSize = 20.sp,
                        color = Color(0,0,0,90)
                    )
                )
            }

            Spacer(Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.tertiaryContainer) // 2️⃣ fondo circular
                    .border(0.dp, Color.Transparent, shape = CircleShape)
                    .padding(15.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Iniciar Sesión",
                    style = TextStyle(
                        fontSize = 26.sp,
                        color = MaterialTheme.colorScheme.tertiary
                    )
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Lab20250708_Exercise_10_Screen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        Lab20250708_Exercise_10_Screen()
    }
}