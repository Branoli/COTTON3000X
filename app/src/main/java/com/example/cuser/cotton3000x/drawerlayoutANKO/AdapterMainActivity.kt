package com.example.cuser.cotton3000x.drawerlayoutANKO

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.cuser.cotton3000x.R
import org.jetbrains.anko.linearLayout

class AdapterMainActivity(private val mDataset:  ArrayList<GitHubRepositoryInfo>) : RecyclerView.Adapter<AdapterMainActivity.ViewHolder>()  {


    class ViewHolder(var view: SimpleTextView) : RecyclerView.ViewHolder(view)

    override fun onBindViewHolder(holder: AdapterMainActivity.ViewHolder, position: Int) {
        holder.view.text = mDataset[position].name
    }

    override fun getItemCount(): Int {
        return mDataset.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterMainActivity.ViewHolder{
        val context = parent.context
        val view = SimpleTextView(context)
        view.layoutParams = RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 150)
        return AdapterMainActivity.ViewHolder(view)
    }
}

