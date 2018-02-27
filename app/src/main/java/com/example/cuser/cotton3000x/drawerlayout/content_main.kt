package com.example.cuser.cotton3000x.drawerlayout

import android.view.View
import com.example.cuser.cotton3000x.splach.SplashActivity
import org.jetbrains.anko.*

class content_main : AnkoComponent<SplashActivity> {
    override fun createView(ui: AnkoContext<SplashActivity>): View = with(ui) {
        linearLayout{
            textView("MyName") {
                text = "ХАЙХАЙХАЙ"
            }
        }
    }
}