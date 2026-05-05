package com.example.pertemuan7navigation.uiapps

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan7navigation.navigation.Destination

@Composable
fun AppScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNav(
                navController = navController,
                items = Destination.toList
            )
        }
    ) { padding ->

        Box(modifier = Modifier.padding(padding)) {
            AppNavigation(navController)
        }
    }
}