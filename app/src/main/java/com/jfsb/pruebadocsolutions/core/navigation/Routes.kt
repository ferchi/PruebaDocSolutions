package com.jfsb.pruebadocsolutions.core.navigation

sealed class Routes (val route: String){
    object Auth: Routes("auth")
    object Login: Routes("login")
    object Register: Routes("register")
}