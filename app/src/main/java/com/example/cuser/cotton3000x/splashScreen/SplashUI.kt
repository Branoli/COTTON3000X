package com.example.cuser.cotton3000x.splashScreen

import android.content.Context
import android.graphics.Color
import org.jetbrains.anko._FrameLayout
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.progressBar

class SplashUI(context: Context) : _FrameLayout(context) {
    init {
        backgroundColor = Color.BLUE
        progressBar{
        }
    }
}