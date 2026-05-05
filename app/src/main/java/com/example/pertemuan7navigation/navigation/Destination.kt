package com.example.pertemuan7navigation.navigation

import com.example.pertemuan7navigation.R

sealed class Destination (val route: String, val icon: Int, val title: String){
    object Transaction : Destination("transactions", R.drawable.ic_wallet, "Home")
    object Budgets: Destination("budget", R.drawable.ic_budget, "Budget")
    object Task: Destination("tasks", R.drawable.ic_task, "Tasks")
    object Settings: Destination("settings", R.drawable.ic_settings, "Settings")
    object Counters: Destination("counters", R.drawable.ic_counter, "Counter")

    companion object {
        val  toList = listOf(
            Transaction,
            Budgets,
            Task,
            Settings
        )
    }
}