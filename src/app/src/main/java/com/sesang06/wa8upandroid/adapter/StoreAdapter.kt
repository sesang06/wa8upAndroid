package com.sesang06.wa8upandroid.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.sesang06.wa8upandroid.R
import com.sesang06.wa8upandroid.model.StoreModel
import kotlinx.android.synthetic.main.item_store.view.*
class StoreAdapter(val context: Context, val stores : ArrayList<StoreModel>) : RecyclerView.Adapter<StoreAdapter.StoreHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_store, parent, false)
        return StoreHolder(view)

    }

    override fun onBindViewHolder(holder: StoreHolder, position: Int) {
        holder?.title?.text = stores.get(position).store
        Glide.with(context)
                .load(R.drawable.ic_launcher_background)
                .apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL))
                .apply(RequestOptions.bitmapTransform(RoundedCorners(14)))
                .into(holder?.thumbnail)
    }
    override fun getItemCount(): Int = this.stores.size
    inner class StoreHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var title = itemView.textview_storeitem_title
        var thumbnail = itemView.imageview_storeitem_thumbnail

    }

}
