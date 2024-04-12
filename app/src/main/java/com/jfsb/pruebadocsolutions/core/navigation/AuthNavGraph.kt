package com.jfsb.pruebadocsolutions.core.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.jfsb.pruebadocsolutions.features.login.presentation.screen.LoginScreen
import com.jfsb.pruebadocsolutions.features.register.presentation.screen.RegisterScreen

fun NavGraphBuilder.authNavGraph(
) {
    navigation(
        route = Routes.Auth.route,
        startDestination = Routes.Login.route
    )
    {
        composable(route = Routes.Login.route) {
            LoginScreen()
        }

        composable(route = Routes.Register.route) {
            RegisterScreen()
        }
    }
}