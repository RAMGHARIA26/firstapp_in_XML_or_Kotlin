package com.example.orderofpeaky

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var navController:NavController = findNavController(R.id.upperFragmentContainerView)
       var bottomNavigationView:BottomNavigationView = findViewById(R.id.bottomNavigationView)
       bottomNavigationView.setupWithNavController(navController)

    }
}