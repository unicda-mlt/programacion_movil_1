package com.lab_2025_07_24_navigation.app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
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
import com.lab_2025_07_24_navigation.route.AppRouterNext
import com.ui.theme.AppTheme


@Composable
fun PersonalDataScreen(router: AppRouterNext) {
    var fullName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "Step 1: Personal Data",
            style = MaterialTheme.typography.headlineSmall.merge(TextStyle(
                color = MaterialTheme.colorScheme.secondary,
                fontWeight = FontWeight.SemiBold
            ))
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = fullName,
            onValueChange = { fullName = it },
            singleLine = true,
            label = {
                Text(
                    text = "Full Name",
                    color = MaterialTheme.colorScheme.primary
                )
            }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = email,
            onValueChange = { email = it },
            singleLine = true,
            label = {
                Text(
                    text = "Email",
                    color = MaterialTheme.colorScheme.primary
                )
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = router.onNavigateToNext,
            enabled = fullName.isNotBlank() && email.isNotBlank(),
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("Siguiente")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PersonalDataScreen_Preview() {
    AppTheme (
        darkTheme = false,
        dynamicColor = false
    ) {
        PersonalDataScreen(
            router = AppRouterNext(
                onNavigateToNext = {}
            )
        )
    }
}

