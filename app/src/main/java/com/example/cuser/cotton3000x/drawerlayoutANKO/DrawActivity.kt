package com.example.cuser.cotton3000x.drawerlayoutANKO

import android.content.Context
import android.graphics.Color
import android.support.v7.appcompat.R.attr.theme

import android.view.Gravity
import android.view.Menu
import android.view.View
import android.widget.TextView
import com.example.cuser.cotton3000x.R
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.actionMenuItemView
import org.jetbrains.anko.custom.style
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
                    id = R.id.toolbar
                    backgroundColor = Color.RED
                    popupTheme = R.style.AppTheme_PopupOverlay
                }.lparams(matchParent, dip(70))
            }.lparams(matchParent, wrapContent)

            linearLayout{
                textView("MyName") {
                }.lparams(wrapContent, wrapContent)
            }.lparams(matchParent, matchParent)

        }.lparams(matchParent, matchParent)


        navigationView {
            id = R.id.nav_bar
            fitsSystemWindows = true
            backgroundColor = Color.RED

            val header = context.verticalLayout {
                horizontalPadding = dip(16)
                verticalPadding = dip(16)
                gravity = Gravity.BOTTOM
                backgroundColor = Color.GREEN

                imageView {

                }.lparams(wrapContent, wrapContent){
                    topPadding = dip(8)
                }

                textView("MyName") {
                    topPadding = dip(16)
                }.lparams(wrapContent, wrapContent)

                textView("MyName") {
                }.lparams(wrapContent, wrapContent)

            }.lparams(matchParent, dip(176))
            addHeaderView(header)

            inflateMenu(R.menu.activity_main_drawer)

        }.lparams(wrapContent, matchParent) {
            fitsSystemWindows = true
            gravity = Gravity.LEFT
        }
    }
}