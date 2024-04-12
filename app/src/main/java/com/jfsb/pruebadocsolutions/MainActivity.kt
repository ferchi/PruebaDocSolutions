package com.jfsb.pruebadocsolutions

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.jfsb.pruebadocsolutions.core.navigation.RootNavGraph
import com.jfsb.pruebadocsolutions.ui.theme.PruebaDocSolutionsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()


            PruebaDocSolutionsTheme {
                RootNavGraph(navController = navController)
            }
        }
    }
}