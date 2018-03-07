package com.example.cuser.cotton3000x.drawerlayoutANKO

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import com.example.cuser.cotton3000x.R
import org.jetbrains.anko.custom.customView
import org.jetbrains.anko.findOptional

class DrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var draw : DrawUI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        draw = customView{}
        setContentView(draw)
        val toolbar = findOptional<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        /*
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
                this, draw, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        draw.addDrawerListener(toggle)
        toggle.syncState()

        findOptional<NavigationView>(R.id.nav_bar)!!.setNavigationItemSelectedListener(this)
        */

    }

    override fun onBackPressed() {
        if (draw.isDrawerOpen(GravityCompat.START)) {
            draw.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_camera -> {

            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        draw.closeDrawer(GravityCompat.START)
        return true
    }

}