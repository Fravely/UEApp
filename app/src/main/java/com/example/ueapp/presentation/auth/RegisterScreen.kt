package com.example.ueapp.presentation.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.Navigator
import androidx.navigation.internal.NavContext

@Composable
fun RegisterScreen(navController: NavController){
    var name by remember { mutableStateOf("")}
    var email by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}
    var confirmpassword by remember { mutableStateOf("")}

    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Spacer(modifier = Modifier.height(16.dp))

        Text("Registro de usuario", style =
            MaterialTheme.typography.titleLarge)

        OutlinedTextField(
            value = name,
            onValueChange = {name = it},
            label = {Text("Nombre")},
            placeholder = {Text("Nombre")},
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value =  email,
            onValueChange = {email = it},
            label = {Text("Correo electronico")},
            placeholder = {Text("Correo electronico")},
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value =  password,
            onValueChange = {password = it},
            label = {Text("Contraseña")},
            placeholder = {Text("Contraseña")},
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value =  confirmpassword,
            onValueChange = {confirmpassword = it},
            label = {Text("Confirmar contraseña")},
            placeholder = {Text("Confirmar contraseña")},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            if(email.isNotBlank()
                && password.isNotBlank()
                && password == confirmpassword){
                navController.navigate("login")
            }
        }, modifier = Modifier.fillMaxWidth()
        ) {
            Text("Registrarse")
        }
    }
}