package com.example.cuser.cotton3000x.drawerlayout

import android.graphics.Color.WHITE
import android.support.design.widget.AppBarLayout
import android.view.View
import com.example.cuser.cotton3000x.R
import com.example.cuser.cotton3000x.splach.SplashActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.fitWindowsFrameLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.themedAppBarLayout

class app_bar_main : AnkoComponent<SplashActivity> {
    override fun createView(ui: AnkoContext<SplashActivity>): View = with(ui) {
        coordinatorLayout{
            fitsSystemWindows = true
            themedAppBarLayout {
                toolbar {

                }
            }
            //include<View>(content_main)
            linearLayout{
                textView("MyName") {
                    text = "ХАЙХАЙХАЙ"
                }
            }
        }
    }
}