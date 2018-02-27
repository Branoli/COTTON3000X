package com.example.cuser.cotton3000x

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SplashBar().setContentView(this)

        doAsync {
            Thread.sleep(2000)
            uiThread {
                startActivity<MainActivity>()
            }
        }
    }
}