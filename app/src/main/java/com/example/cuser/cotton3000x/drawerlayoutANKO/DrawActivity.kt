package com.example.cuser.cotton3000x.drawerlayoutANKO

import android.content.Context
import android.graphics.Color
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.view.Gravity
import android.widget.TextView
import com.example.cuser.cotton3000x.R
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.customView
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.navigationView
import org.jetbrains.anko.support.v4._DrawerLayout

class DrawActivity(context: Context) : _DrawerLayout(context) {


    private lateinit var textBlock: TextView

    init {
        fitsSystemWindows = true
        coordinatorLayout{
            appBarLayout{
                toolbar {
                    backgroundColor = Color.WHITE
                    popupTheme =R.style.AppTheme_PopupOverlay
                }.lparams(matchParent, R.attr.actionBarSize)
            }.lparams(matchParent, wrapContent)

        }.lparams(matchParent, matchParent)

        linearLayout{
            textView("MyName") {
                text = "ХАЙХАЙХАЙ"
            }
        }.lparams(matchParent, matchParent)

        navigationView {
            fitsSystemWindows = true
            backgroundColor = Color.RED

            val header = context.verticalLayout {
                horizontalPadding = dip(16)
                verticalPadding = dip(16)
                gravity = Gravity.BOTTOM
                backgroundColor = Color.GREEN

                textView("MyName") {
                    topPadding = dip(16)
                }.lparams(wrapContent, wrapContent)

                textView("MyName") {
                }.lparams(wrapContent, wrapContent)

            }.lparams(matchParent, dip(176))

            addHeaderView(header)

        }.lparams(matchParent, matchParent) {
            gravity = Gravity.START
        }
        openDrawer(Gravity.START)
    }
}