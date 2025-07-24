package com.labs_2027_07_08

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ui.theme.AppTheme

@Composable
fun Lab20250708_Exercise_9_Screen() {
    val scrollState = rememberScrollState()

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        TarjetaDeNoticia()
        TarjetaDeNoticia()
    }
}

@Composable
fun TarjetaDeNoticia() {
    Column(
        modifier = Modifier
            .border(1.dp, MaterialTheme.colorScheme.primaryContainer, RoundedCornerShape(2.dp))
            .padding(5.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(MaterialTheme.colorScheme.primary)
        )

        Spacer(Modifier.height(14.dp))

        Text(
            text = "Tasas de interés alcanzan su nivel más bajo desde el inicio del mandato de Luis Abinader",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(8.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Roberto Almonte Mejía",
                color = Color(0,0,0,90)
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "23 Setiembre 2025",
                color = Color(0,0,0,90)
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Las tasas de interés en la República Dominicana han caído a sus niveles más bajos desde que Luis Abinader asumió la presidencia hace casi seis años...",
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun Lab20250708_Exercise_9_Screen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        Lab20250708_Exercise_9_Screen()
    }
}