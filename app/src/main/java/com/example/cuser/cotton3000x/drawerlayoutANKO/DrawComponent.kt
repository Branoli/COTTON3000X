package com.example.cuser.cotton3000x.drawerlayoutANKO

import android.graphics.Color
import android.view.Gravity
import android.view.View
import com.example.cuser.cotton3000x.R
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.*
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.navigationView
import org.jetbrains.anko.support.v4.drawerLayout
import org.jetbrains.anko.textView

class DrawComponent : AnkoComponent<DrawerActivity> {
    override fun createView(ui: AnkoContext<DrawerActivity>): View = with(ui) {
        drawerLayout{
            //fitsSystemWindows = true
            coordinatorLayout{
                fitsSystemWindows = true

                appBarLayout {
                        //theme = R.style.AppTheme_AppBarOverlay
                    //themedAbsoluteLayout(theme = R.style.AppTheme_AppBarOverlay)
                    toolbar {
                        popupTheme = R.style.AppTheme_PopupOverlay
                    }.lparams(
                            width = matchParent,
                            height = R.attr.actionBarSize
                    )

                }.lparams(width = matchParent)

                linearLayout{
                    lparams(width = matchParent, height = dip(145))
                    textView("MyName")
                }

            }.lparams(
                    width = matchParent,
                    height = matchParent
            )
            navigationView {
                fitsSystemWindows = true
                val header = context.frameLayout {
                    backgroundColor = Color.GREEN
                }
                addHeaderView(header)
            }.lparams(
                    width = matchParent,
                    height = matchParent,
                    gravity = Gravity.LEFT
            )
        }
    }
}