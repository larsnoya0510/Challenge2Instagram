package com.example.challenge2instagram.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.challenge2instagram.Data.IconData
import com.example.challenge2instagram.R

class RecycleView_Icon_Adapter(
    private val context : Context,
    private val dataList: MutableList<IconData>
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    lateinit var mContext: Context
    val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View = inflater.inflate(R.layout.item_icon_recycleview_layout, parent, false)
        mContext = parent.getContext()
        Log.d("github"," in onCreateViewHolder")
        return iconViewHolder(view)
    }
    override fun getItemCount(): Int {
        return dataList.size
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d("github"," in onBindViewHolder")
        var vh: iconViewHolder = holder as iconViewHolder
        Glide.with(mContext).load(dataList[position].icon).into(vh.iv_headicon)
        vh.tv_userName.text = dataList[position].name
    }

    inner class iconViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_headicon = view.findViewById<ImageView>(R.id.iv_item)
        var tv_userName = view.findViewById<TextView>(R.id.tv_item)
    }
}