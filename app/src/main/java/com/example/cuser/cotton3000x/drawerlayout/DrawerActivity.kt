package com.example.cuser.cotton3000x.drawerlayout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.cuser.cotton3000x.splach.SplashBar
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.uiThread

class DrawerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DrawComponent().setContentView(this)
    }
}