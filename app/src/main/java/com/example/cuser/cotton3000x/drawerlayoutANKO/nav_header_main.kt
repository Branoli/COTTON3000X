package com.example.cuser.cotton3000x.drawerlayoutANKO


import android.view.View
import com.example.cuser.cotton3000x.R
import com.example.cuser.cotton3000x.splach.SplashActivity
import org.jetbrains.anko.*


class nav_header_main : AnkoComponent<DrawComponent> {
    override fun createView(ui: AnkoContext<DrawComponent>): View = with(ui) {
        linearLayout{
            lparams(width = matchParent, height = dip(176))
            horizontalPadding = dip(16)
            verticalPadding = dip(16)
            gravity = bottom
            themedAbsoluteLayout(theme = R.style.ThemeOverlay_AppCompat_Dark)

            //backgroundResource = R.d
            textView("MyName") {
                topPadding = dip(16)
            }.lparams(
                    width = wrapContent,
                    height = wrapContent
            )
            textView("MyName") {
                text = "ХАЙХАЙ"
            }.lparams(
                    width = wrapContent,
                    height = wrapContent
            )
        }
    }
}