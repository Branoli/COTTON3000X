package com.example.cuser.cotton3000x.drawerlayout

import android.view.View
import com.example.cuser.cotton3000x.splach.SplashActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.*
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.navigationView
import org.jetbrains.anko.design.themedAppBarLayout
import org.jetbrains.anko.support.v4.drawerLayout
import org.jetbrains.anko.textView

class DrawComponent : AnkoComponent<DrawerActivity> {
    override fun createView(ui: AnkoContext<DrawerActivity>): View = with(ui) {
        drawerLayout{
            coordinatorLayout{
                fitsSystemWindows = true
                themedAppBarLayout {
                    toolbar {

                    }
                }
                linearLayout{
                    textView("MyName") {
                        text = "ХАЙХАЙХАЙ"
                    }
                }
            }
            navigationView {

            }
        }
    }
}