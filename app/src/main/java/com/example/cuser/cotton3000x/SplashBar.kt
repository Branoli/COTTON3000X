package com.example.cuser.cotton3000x

import android.view.View
import org.jetbrains.anko.*

class SplashBar : AnkoComponent<SplashActivity> {
    override fun createView(ui: AnkoContext<SplashActivity>): View = with(ui) {
        verticalLayout {
            progressBar{ }
        }
    }
}