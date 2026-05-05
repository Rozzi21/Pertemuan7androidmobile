package com.example.pertemuan7navigation.uiapps

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pertemuan7navigation.navigation.Destination
import com.example.pertemuan7navigation.screens.Budget
import com.example.pertemuan7navigation.screens.Counters
import com.example.pertemuan7navigation.screens.Settings
import com.example.pertemuan7navigation.screens.Tasks
import com.example.pertemuan7navigation.screens.Transaction
@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Destination.Transaction.route
    ) {
        composable(Destination.Transaction.route) {
            Transaction(navController)
        }
        composable(Destination.Budgets.route) {
            Budget()
        }
        composable(Destination.Task.route) {
            Tasks()
        }
        composable(Destination.Settings.route){
            Settings()
        }
        composable("counters/{value}") { backStack ->
            val data = backStack.arguments?.getString("value")
            Counters(data)
        }
    }
}