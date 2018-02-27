package com.example.cuser.cotton3000x

import com.example.cuser.cotton3000x.splach.SplashActivity
import org.jetbrains.anko.*

class MainActivityUi : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            horizontalPadding = dip(50)
            val loginEdit = editText {
                topPadding = dip(200)
                hint = "Login"
            }
            val passwordEdit = editText {
                hint = "Password"
            }
            button("Войти").setOnClickListener{
                startActivity<SplashActivity>()
            }
        }
    }
}