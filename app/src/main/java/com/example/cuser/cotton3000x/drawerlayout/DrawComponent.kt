package com.example.cuser.cotton3000x.drawerlayout

import android.support.design.R.id.start
import android.view.View
import com.example.cuser.cotton3000x.R
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
                    themedAbsoluteLayout(
                        theme = R.style.ThemeOverlay_AppCompat
                    )
                    toolbar {

                    }.lparams(
                            width = matchParent,
                            height = matchParent
                    )
                }.lparams(
                        width = matchParent,
                        height = matchParent
                )
                linearLayout{
                    lparams(width = matchParent, height = dip(145))
                    textView("MyName") {
                        text = "ХАЙХАЙХАЙ"
                    }
                }
            }.lparams(
                    width = matchParent,
                    height = matchParent
            )
            navigationView {
                fitsSystemWindows = true
            }.lparams(
                    width = matchParent,
                    height = matchParent,
                    gravity = start
            )
        }
    }
}