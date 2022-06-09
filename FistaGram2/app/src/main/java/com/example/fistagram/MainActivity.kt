package com.example.fistagram

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.appbar.CollapsingToolbarLayout
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    lateinit var navController:NavController
    lateinit var BottomNavigationView:BottomNavigationView
    val permissions = arrayOf(android.Manifest.permission.CAMERA, android.Manifest.permission.WRITE_EXTERNAL_STORAGE, android.Manifest.permission.READ_EXTERNAL_STORAGE)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController =findNavController(R.id.nav_host_fragment_activity_main)

        BottomNavigationView = findViewById(R.id.bottom_navigation)


        BottomNavigationView.setupWithNavController(navController)

    }

    fun cameraAccess(view: View) {
        val intent = Intent(this,cameraActivity::class.java)


            startActivity(intent)

    }


//    val onNevigationItemSelectedListener = BottomNavigationView.setOnNavigationItemSelectedListener {
//        when(item.itemid()){
//            R.id.home->
//        }
//    }


}