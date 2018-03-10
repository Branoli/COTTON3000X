package com.example.cuser.cotton3000x.drawerlayoutANKO

import android.app.Activity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.widget.LinearLayout.VERTICAL
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import com.example.cuser.cotton3000x.R
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request

import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.contentFrameLayout

import org.jetbrains.anko.custom.customView
import org.jetbrains.anko.recyclerview.v7.recyclerView


class DrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var draw : DrawUI

    private val okHttpClient = OkHttpClient()
    private val repos = mutableListOf<String>()
    private val reposAdapter = ReposListAdapter(repos) { repoName ->
        Toast.makeText(this, repoName, Toast.LENGTH_SHORT).show()
    }


    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        draw = customView{}

        val toolbar = findOptional<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
                this, draw, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        draw.addDrawerListener(toggle)
        toggle.syncState()

        findOptional<NavigationView>(R.id.nav_bar)!!.setNavigationItemSelectedListener(this)

        linearLayoutManager = LinearLayoutManager(this)
        //-------------------------------------------------
        findOptional<LinearLayout>(R.id.linear_layout)!!.linearLayout {
            orientation = VERTICAL
            recyclerView {
                id = R.id.recycler_news
                lparams(matchParent, matchParent)
                adapter = reposAdapter
                layoutManager = linearLayoutManager
            }
        }
        loadData(this::showData)
    }

    private fun showData(repos: List<String>) {
        this.repos.run {
            clear()
            addAll(repos)
        }
        reposAdapter.notifyDataSetChanged()
    }

    private fun loadData(onComplete: (List<String>) -> Unit) {
        Thread {
            val request = Request.Builder()
                    .url("https://api.github.com/users/square/repos")
                    .build()
            val response = okHttpClient.newCall(request).execute()
            val respBody = response.body()!!.string()
            val repos = Gson().fromJson(respBody, GitHubRepositoryInfo.List::class.java)
            val names = repos.map { it.name }
            runOnUiThread {
                onComplete(names)
            }
        }.start()
    }

    override fun onBackPressed() {
        if (draw.isDrawerOpen(GravityCompat.START)) {
            draw.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_camera -> {
                findOptional<RecyclerView>(R.id.recycler_news)!!.visibility = View.GONE
                findOptional<LinearLayout>(R.id.linear_layout)!!.contentFrameLayout {
                    textView("nav_camera")
                }
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

data class GitHubRepositoryInfo(val name: String) {
    class List : ArrayList<GitHubRepositoryInfo>()
}

