package com.example.cuser.cotton3000x.drawerlayoutANKO

import android.content.Context
import android.graphics.Color
import android.support.design.widget.AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS
import android.view.Gravity
import android.widget.LinearLayout.VERTICAL
import android.widget.TextView
import com.example.cuser.cotton3000x.R
import org.jetbrains.anko.*
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.navigationView
import org.jetbrains.anko.design.themedAppBarLayout
import org.jetbrains.anko.support.v4._DrawerLayout

class DrawUI(context: Context) : _DrawerLayout(context) {


    private lateinit var textBlock: TextView

    init {
        fitsSystemWindows = true
        coordinatorLayout{
            themedAppBarLayout(R.style.AppTheme_AppBarOverlay) {
                toolbar {
                    id = R.id.toolbar
                    backgroundColor = Color.RED
                    popupTheme = R.style.AppTheme_PopupOverlay
                    title = resources.getString(R.string.app_name)
                }.lparams(matchParent, dip(55)){
                    scrollFlags = SCROLL_FLAG_ENTER_ALWAYS
                }
            }.lparams(matchParent, wrapContent)

            linearLayout{
                topPadding = dip(55)
                orientation = VERTICAL
                textView("MyName") {
                }.lparams(wrapContent, wrapContent)
            }.lparams(matchParent, matchParent)

        }.lparams(matchParent, matchParent)


        navigationView {
            id = R.id.nav_bar
            fitsSystemWindows = true
            backgroundColor = Color.WHITE

            val header = context.themedLinearLayout(R.style.Base_ThemeOverlay_AppCompat_Dark) {
                orientation = VERTICAL
                horizontalPadding = dip(16)
                verticalPadding = dip(16)
                gravity = Gravity.BOTTOM
                backgroundColor = R.drawable.side_nav_bar

                imageView {
                    setImageResource(R.mipmap.ic_launcher_round)
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