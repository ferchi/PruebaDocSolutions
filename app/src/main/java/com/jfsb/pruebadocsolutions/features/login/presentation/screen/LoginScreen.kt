package com.jfsb.pruebadocsolutions.features.login.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    Scaffold {
        Column(modifier = modifier.fillMaxSize().padding(it),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            TextField(value = "username", onValueChange = {

            })
            Spacer(modifier = Modifier.height(16.dp))
            TextField(value = "password", onValueChange = {

            })

            Spacer(modifier = Modifier.height(16.dp))


            Button(onClick = {

            }) {
                Text("Login")
            }
        }
    }


}

@Preview(name = "LoginScreen")
@Composable
private fun PreviewLoginScreen() {
    LoginScreen()
}