package com.example.cuser.cotton3000x.drawerlayoutANKO

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.cuser.cotton3000x.R

class AdapterMainActivity(private val mDataset:  ArrayList<GitHubRepositoryInfo>) : RecyclerView.Adapter<AdapterMainActivity.ViewHolder>()  {

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val mTextView: TextView = v.findViewById<View>(R.id.repo) as TextView

    }

    override fun onBindViewHolder(holder: AdapterMainActivity.ViewHolder, position: Int) {
        holder.mTextView.text = mDataset[position].name
    }

    override fun getItemCount(): Int {
        return mDataset.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterMainActivity.ViewHolder{
        val context = parent.context
        val view = TextView(context)
        return AdapterMainActivity.ViewHolder(view)
    }
}