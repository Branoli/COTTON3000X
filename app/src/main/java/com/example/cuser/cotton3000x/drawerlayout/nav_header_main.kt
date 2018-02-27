package com.example.cuser.cotton3000x.drawerlayout

import android.view.View
import android.widget.LinearLayout
import com.example.cuser.cotton3000x.splach.SplashActivity
import org.jetbrains.anko.*


class nav_header_main : AnkoComponent<SplashActivity> {
    override fun createView(ui: AnkoContext<SplashActivity>): View = with(ui) {
        linearLayout{
            horizontalPadding = dip(16)
            verticalPadding = dip(16)
            textView("MyName") {
                text = "ХАЙ"
            }
            textView("MyName") {
                text = "ХАЙХАЙ"
            }
        }
    }
}