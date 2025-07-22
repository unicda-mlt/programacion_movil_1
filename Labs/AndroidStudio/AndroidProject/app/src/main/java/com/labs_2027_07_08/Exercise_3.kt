package com.labs_2027_07_08

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Lab20250708_Exercise_3_Screen() {
    IconosSociales()
}

@Composable
fun IconosSociales() {
    val emojiFontSize = 40.sp

    Row(
        modifier = Modifier.fillMaxSize().padding(30.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text(
            text = "\uD83D\uDC26",
            fontSize = emojiFontSize
        )
        Text(
            text = "\uD83D\uDCBC",
            fontSize = emojiFontSize
        )
        Text(
            text = "\uD83D\uDCF8",
            fontSize = emojiFontSize
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Lab20250708_Exercise_3_Screen_Preview() {
    IconosSociales()
}