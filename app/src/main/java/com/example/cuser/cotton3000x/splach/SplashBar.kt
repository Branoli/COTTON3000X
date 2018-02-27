package com.example.cuser.cotton3000x.splach

import android.view.View
import com.example.cuser.cotton3000x.splach.SplashActivity
import org.jetbrains.anko.*

class SplashBar : AnkoComponent<SplashActivity> {
    override fun createView(ui: AnkoContext<SplashActivity>): View = with(ui) {
        verticalLayout {
            progressBar{ }
        }
    }
}