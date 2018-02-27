package com.example.cuser.cotton3000x

import com.example.cuser.cotton3000x.splach.SplashActivity
import org.jetbrains.anko.*

class MainActivityUi : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            val loginEdit = editText {
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