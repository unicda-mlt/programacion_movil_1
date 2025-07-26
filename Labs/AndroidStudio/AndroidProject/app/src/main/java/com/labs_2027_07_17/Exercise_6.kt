package com.labs_2027_07_17

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ui.theme.AppTheme
import kotlin.random.Random


@Composable
fun Lab20250717_Exercise_6_Screen() {
    CambiarColorDinamico()
}

@Composable
fun CambiarColorDinamico() {
    var color by remember { mutableStateOf(Color.Gray) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp, 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .size(100.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(color)
        )

        Spacer(Modifier.height(32.dp))

        OutlinedButton (
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
            ),
            onClick = {
                color = Color(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
            }
        ) {
            Text(
                text = "Cambiar Color",
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
fun Lab20250717_Exercise_6_Screen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        Lab20250717_Exercise_6_Screen()
    }
}