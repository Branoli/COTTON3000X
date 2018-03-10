package com.example.cuser.cotton3000x.drawerlayoutANKO

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.widget.TextView
import org.jetbrains.anko.dip
import org.jetbrains.anko.padding
import org.jetbrains.anko.textColor

class ReposListAdapter(
            private val repos: List<String>,
            private val onItemClick: (String) -> Unit) : RecyclerView.Adapter<ReposListAdapter.ReposListViewHolder>() {

    class ReposListViewHolder(val view: TextView) : RecyclerView.ViewHolder(view)

    override fun getItemCount() = repos.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReposListViewHolder {
        val textView = TextView(parent.context).apply {
            textSize = 32f
            textColor = Color.BLACK
            padding = dip(16)
        }
        return ReposListViewHolder(textView).apply {
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
        holder.view.text = repos[position]
    }
}