package com.jfsb.pruebadocsolutions.features.register.presentation.screen

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
fun RegisterScreen(
    modifier: Modifier = Modifier
) {
    Scaffold {
        Column(modifier = modifier.fillMaxSize().padding(it),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            TextField(value = "Username", onValueChange = {

            })
            Spacer(modifier = Modifier.height(16.dp))
            TextField(value = "Password", onValueChange = {

            })

            Spacer(modifier = Modifier.height(16.dp))
            TextField(value = "Name", onValueChange = {

            })

            Spacer(modifier = Modifier.height(16.dp))
            TextField(value = "FatherLastName", onValueChange = {

            })

            Spacer(modifier = Modifier.height(16.dp))
            TextField(value = "MotherLastName", onValueChange = {

            })

            Spacer(modifier = Modifier.height(16.dp))
            TextField(value = "Email", onValueChange = {

            })

            Spacer(modifier = Modifier.height(16.dp))
            TextField(value = "Phone", onValueChange = {

            })

            Spacer(modifier = Modifier.height(16.dp))


            Button(onClick = {

            }) {
                Text("Register")
            }
        }
    }


}

@Preview(name = "RegisterScreen")
@Composable
private fun PreviewRegisterScreen() {
    RegisterScreen()
}