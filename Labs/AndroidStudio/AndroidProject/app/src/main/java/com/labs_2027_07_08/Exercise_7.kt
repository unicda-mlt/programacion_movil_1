package com.labs_2027_07_08

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ui.theme.AppTheme

@Composable
fun Lab20250708_Exercise_7_Screen() {
    ItemDeRecibo()
}

@Composable
fun ItemDeRecibo() {
    Column (
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "Café Italiano",
                style = TextStyle(
                    fontSize = 22.sp,
                    color = MaterialTheme.colorScheme.tertiary
                )
            )
            Spacer(Modifier.weight(1f))
            Text(
                text = "$3.40",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Café Americano",
                style = TextStyle(
                    fontSize = 22.sp,
                    color = MaterialTheme.colorScheme.tertiary
                )
            )
            Spacer(Modifier.weight(1f))
            Text(
                text = "$2.90",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Lab20250708_Exercise_7_Screen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        Lab20250708_Exercise_7_Screen()
    }
}