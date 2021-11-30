package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationMenuView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navVieW = findViewById<BottomNavigationMenuView>(R.id.bottomNavMenu)

        val controller = findNavController(R.id.nav_host_fragment)

        val AppBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.DashboardFragment,
                R.id.notificationFragment,
                R.id.helpFragment

            )

        )

        setupActionBarWithNavController(controller, AppBarConfiguration)
        navVieW.setupwithNavController(controller)

    }
}

private fun BottomNavigationMenuView.setupwithNavController(navController: NavController) {
    TODO("Not yet implemented")
}
