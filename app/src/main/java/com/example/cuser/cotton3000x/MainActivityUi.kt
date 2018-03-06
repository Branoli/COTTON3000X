package com.example.cuser.cotton3000x

import android.view.View
import android.widget.EditText
import com.example.cuser.cotton3000x.drawerlayoutANKO.DrawerActivity
import org.jetbrains.anko.*

class MainActivityUi : AnkoComponent<MainActivity> {
    private lateinit var loginEdit : EditText
    private lateinit var passwordEdit : EditText
    private lateinit var butIn : Unit

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            horizontalPadding = dip(50)
            loginEdit = editText {
                topPadding = dip(200)
                hint = "Login"
            }
            passwordEdit = editText {
                hint = "Password"
            }
            val progBar = progressBar {
                visibility = View.GONE
            }
            butIn = button("Войти").setOnClickListener{
                loginEdit.visibility = View.INVISIBLE
                passwordEdit.visibility = View.INVISIBLE
                it.visibility = View.INVISIBLE
                progBar.visibility = View.VISIBLE
                doAsync {
                    Thread.sleep(2000)
                    uiThread {
                        startActivity<DrawerActivity>()
                    }
                }

                //startActivity<SplashActivity>()
            }
        }
    }
}