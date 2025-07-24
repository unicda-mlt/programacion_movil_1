package com.labs_2027_07_08

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ui.theme.AppTheme

@Composable
fun Lab20250708_Exercise_6_Screen() {
    CuadriculaSimple()
}

@Composable
fun CuadriculaSimple() {
    Column (
        modifier = Modifier.fillMaxWidth().padding(20.dp)
    ) {
        Box {
            Row {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .background(MaterialTheme.colorScheme.primary)
                )
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .background(MaterialTheme.colorScheme.tertiary)
                )
            }
        }
        Box {
            Row {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .background(MaterialTheme.colorScheme.onBackground)
                )
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .background(MaterialTheme.colorScheme.inverseOnSurface)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Lab20250708_Exercise_6_Screen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        Lab20250708_Exercise_6_Screen()
    }
}