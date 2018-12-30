package com.sesang06.wa8upandroid.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import com.sesang06.wa8upandroid.R
import com.sesang06.wa8upandroid.model.FilterModel
import kotlinx.android.synthetic.main.item_filter.view.*
class FilterAdapter(val context: Context, val filter : ArrayList<FilterModel>) : RecyclerView.Adapter<FilterAdapter.FilterHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilterHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_filter, parent, false)
        return  FilterHolder(view)

    }

    override fun onBindViewHolder(holder: FilterHolder, position: Int) {
        holder?.title?.text = filter.get(position).filter

    }
    override fun getItemCount(): Int = this.filter.size
    inner class FilterHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title = itemView.textview_filteritem_title
    }

}
