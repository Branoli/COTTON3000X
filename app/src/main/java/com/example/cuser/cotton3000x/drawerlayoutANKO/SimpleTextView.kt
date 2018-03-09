package com.example.cuser.cotton3000x.drawerlayoutANKO

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.text.TextPaint
import android.view.View

class SimpleTextView(context: Context) : View(context) {

    var text: String = ""

    private val paint = TextPaint().apply {
        color = Color.BLACK
        textSize = 42f
    }

    override fun onDraw(canvas: Canvas?) {
        if (canvas == null) return
        canvas.drawText(text, 100f, 100f, paint)
    }
}