package com.example.fragment2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.fragment2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navCon: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHost = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)as NavHostFragment
        navCon = navHost.navController
        setupActionBarWithNavController(navCon)

    }

    override fun onSearchRequested(): Boolean {
        return navCon.navigateUp()||super.onSupportNavigateUp()
    }

}