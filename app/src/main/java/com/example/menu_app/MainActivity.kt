package com.example.menu_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.view.menu.MenuView
import android.view.Menu as ViewMenu

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val myMenu = findViewById<View>(R.menu.layout_menu)

    }

    @SuppressLint("ResourceType")
    private fun setIcon(menuItem: MenuItem)  {


          if (menuItem.title == "SignIn") menuItem.title = "sighOut"
        else menuItem.title = "SignIn"
    }

    override fun onCreateOptionsMenu(menu: android.view.Menu?): Boolean {
        menuInflater.inflate(R.menu.layout_menu, menu)
//        val signIn = menu!!.findItem(R.id.singIn)
        return true
    }

    @SuppressLint("ResourceType")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            R.id.singIn ->{  setIcon(item)
                return true }
            R.id.settings -> { settingMenu()
          return true  }
            R.id.studio -> {studioMenu()
           return true }
            else ->  super.onOptionsItemSelected(item)
        }


    }

    private fun settingMenu() {

        val intent = Intent(this@MainActivity, SettingActivity ::class.java )
        startActivity(intent)

    }

    private fun studioMenu() {

        val intent = Intent(this@MainActivity, StudioActivity ::class.java )
        startActivity(intent)

    }

}