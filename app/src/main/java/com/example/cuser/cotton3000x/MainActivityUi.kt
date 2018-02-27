package com.example.cuser.cotton3000x

import android.widget.Toast
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

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