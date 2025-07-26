package com.labs_2025_07_08

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ui.theme.AppTheme

@Composable
fun Lab20250708_Exercise_5_Screen() {
    PerfilDeUsuario()
}

@Composable
fun PerfilDeUsuario() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(10.dp),
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "\uD83E\uDDD1\u200D\uD83D\uDCBB",
                fontSize = 80.sp
            )

            Spacer(Modifier.width(12.dp))

            Column {
                Text(
                    text = "Máximo Liberata Torres",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0,0,0,95)
                    )
                )
                Spacer(Modifier.height(10.dp))
                Text(
                    text = "En línea",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Lab20250708_Exercise_5_Screen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        Lab20250708_Exercise_5_Screen()
    }
}