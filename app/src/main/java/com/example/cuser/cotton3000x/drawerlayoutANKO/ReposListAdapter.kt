package com.example.cuser.cotton3000x.drawerlayoutANKO

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT

class ReposListAdapter(
        private val repos: List<String>,
        private val onItemClick: (String) -> Unit) : RecyclerView.Adapter<ReposListAdapter.ReposListViewHolder>() {

    class ReposListViewHolder(val view: SimpleTextView) : RecyclerView.ViewHolder(view)

    override fun getItemCount() = repos.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReposListViewHolder {
        val context = parent.context
        val view = SimpleTextView(context)
        view.layoutParams = RecyclerView.LayoutParams(MATCH_PARENT, 150)
        return ReposListViewHolder(view).apply {
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