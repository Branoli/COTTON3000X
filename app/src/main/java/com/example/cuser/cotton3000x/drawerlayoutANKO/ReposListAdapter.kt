package com.example.cuser.cotton3000x.drawerlayoutANKO

import android.graphics.Color
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.cuser.cotton3000x.R
import android.widget.LinearLayout.VERTICAL
import org.jetbrains.anko.dip
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

class ReposListAdapter(
            private val repos: List<String>,
            private val onItemClick: (String) -> Unit) : RecyclerView.Adapter<ReposListAdapter.ReposListViewHolder>() {

    class ReposListViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val mTextView: TextView = view.findViewById<View>(R.id.text_news) as TextView
    }


    override fun getItemCount() = repos.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReposListViewHolder {

        val linear = LinearLayout(parent.context).apply {
            layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            orientation = VERTICAL
            cardView {
                //elevation = 5f
                lparams(matchParent, dip(220)){
                    bottomMargin = dip(10)
                }
                gravity = Gravity.CENTER
                setContentPadding(dip(40), dip(10), dip(10), dip(10))
                cardElevation = 5f
                radius = 10f

                linearLayout {
                    orientation = VERTICAL
                    textView {
                        id = R.id.text_news
                    }.lparams(matchParent, matchParent)
                }.lparams(wrapContent, wrapContent)
            }
        }

        return ReposListViewHolder(linear).apply {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val name = repos[position]
                    onItemClick(name)
                }
            }
        }
    }

    override fun onBindViewHolder(holder: ReposListViewHolder, position: Int) {
        //if (holder == null) return
        holder.mTextView.text = repos[position]
    }
}