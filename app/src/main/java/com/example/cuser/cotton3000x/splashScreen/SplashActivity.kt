package com.example.cuser.cotton3000x.splashScreen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.cuser.cotton3000x.MainActivity
import com.example.cuser.cotton3000x.drawerlayoutANKO.DrawerActivity
import org.jetbrains.anko.custom.customView
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.uiThread

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        customView<SplashUI> {  }
        doAsync {
            doAsync {
                Thread.sleep(100)
                uiThread {
                    startActivity<MainActivity>()
                }
            }
        }
    }
}
