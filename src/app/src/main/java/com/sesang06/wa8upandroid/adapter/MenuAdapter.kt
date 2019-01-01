package com.sesang06.wa8upandroid.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.sesang06.wa8upandroid.R
import com.sesang06.wa8upandroid.model.MenuModel
import kotlinx.android.synthetic.main.item_menu.view.*

class MenuAdapter(val context: Context, val menus : ArrayList<MenuModel>) : RecyclerView.Adapter<MenuAdapter.MenuHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_menu, parent, false)
        return MenuHolder(view)

    }

    override fun onBindViewHolder(holder: MenuHolder, position: Int) {
        holder.title?.text = menus[position].menu
        holder.description?.text = menus[position].description
        holder.price?.text = menus[position].price.toString()

        Glide.with(context)
                .load(R.drawable.ic_launcher_background)
                .apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL))
                .apply(RequestOptions.bitmapTransform(RoundedCorners(14)))
                .into(holder.thumbnail)
    }
    override fun getItemCount(): Int = this.menus.size
    inner class MenuHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var title = itemView.textview_menuitem_title
        var thumbnail = itemView.imageview_menuitem_thumbnail
        var description = itemView.textview_menuitem_description
        var price = itemView.textview_menuitem_price

    }

}