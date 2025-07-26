package com.labs_2027_07_17

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
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


@Composable
fun Lab20250717_Exercise_9_Screen() {
    ListaDeTareas()
}

@Composable
fun ListaDeTareas() {
    var nuevaTarea by remember { mutableStateOf("") }
    val tareas = remember { mutableStateListOf("Comprar pan") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 50.dp,
                start = 10.dp,
                bottom = 0.dp,
                end = 10.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = nuevaTarea,
            onValueChange = {
                nuevaTarea = it
            },
            placeholder = {
                Text("Nombre de la Tarea")
            }
        )

        Spacer(Modifier.height(20.dp))

        OutlinedButton (
            modifier = Modifier
                .fillMaxWidth(0.8f),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
            ),
            onClick = {
                if (nuevaTarea.isEmpty()) {
                    return@OutlinedButton
                }

                tareas.add(nuevaTarea)
            }
        ) {
            Text(
                text = "Añadir",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.surfaceTint,
                )
            )
        }

        Spacer(Modifier.height(40.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            itemsIndexed(tareas) { index, tarea ->
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(32.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.onTertiaryContainer)
                    ) {
                        Text(
                            text = "${index + 1}",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onTertiary,
                            fontSize = 20.sp
                        )
                    }

                    Spacer(Modifier.width(10.dp))

                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        text = tarea,
                        style = TextStyle(
                            fontSize = 18.sp
                        )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Lab20250717_Exercise_9_Screen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        Lab20250717_Exercise_9_Screen()
    }
}