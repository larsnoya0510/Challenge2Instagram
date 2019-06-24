package com.example.challenge2instagram.Adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.challenge2instagram.Activity_Photo
import com.example.challenge2instagram.Data.TimeLineData
import com.example.challenge2instagram.R

class Switch_Layout_RecycleAdapter(
    //private val context: Context,
    private val items: MutableList<TimeLineData>,
    val layoutManager: GridLayoutManager
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    lateinit var mContext: Context
    //val inflater: LayoutInflater = LayoutInflater.from(context)
    val VIEW_TYPE_Gallery = 1
    val VIEW_TYPE_Large = 2
    override fun getItemViewType(position: Int): Int {
        val spanCount = layoutManager.spanCount
        when (spanCount) {
            3 -> return VIEW_TYPE_Gallery
            else -> return VIEW_TYPE_Large
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        mContext = parent.getContext()
        val metrics = parent.context.resources.displayMetrics

        // 指定了 layout
        when (viewType) {
            VIEW_TYPE_Gallery -> {
                //println("create view holder gallery")
                var view =
                    LayoutInflater.from(parent.context).inflate(R.layout.item_switchlayout_gallery, parent, false)
                var mImageView = view.findViewById<ImageView>(R.id.iv_small)

                //view.minimumWidth = 720 * (1080 / metrics.widthPixels)
                //view.minimumHeight = 220
                return galleryViewHolder(view)
            }
            else -> {
                //println("create view holder big")
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_timeline_recycleview_layout, parent, false)
                view.minimumWidth = metrics.widthPixels - 16
                return timelineViewHolder(view)
            }
        }
    }

    override fun getItemCount(): Int {
        //Log.d("multi", "items.size " + items.size)
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        //holder?.bindModel(item)
        if (holder is galleryViewHolder) {
            Log.d("AAAA", "AAA")
            Glide.with(mContext).load(item.image).into(holder.iv_image)
            holder.iv_image.setOnClickListener {
                var userPhoto = items[position]
                var intent_goPhoto = Intent(this.mContext, Activity_Photo::class.java)
                intent_goPhoto.putExtra("userPhoto", userPhoto)
                this.mContext.startActivity(intent_goPhoto)
            }
//            var userPhoto = items[position]
//            var intent_goPhoto = Intent(this.mContext, Activity_Photo::class.java)
//            intent_goPhoto.putExtra("userPhoto", userPhoto)
//            this.mContext.startActivity(intent_goPhoto)
        } else if (holder is timelineViewHolder) {
            Log.d("AAAA", "BBB")
            Glide.with(mContext).load(item.image).into(holder.iv_image)
            holder.tv_comment.text = item.comment
            var randCount: Int = (Math.random() * 10000 + 1).toInt() //變數區間1-3 從1開始
            holder.tv_like.text = randCount.toString() + " likes"
            holder.ll_item_user.setOnClickListener {
                //            var userInfo = Userinfo.defaultData
//            var intent_getUser = Intent(this.context, Activity_UserInfo::class.java)
//            intent_getUser.putExtra("userinfo", userInfo)
//            this.context.startActivity(intent_getUser)
            }
        }
    }

    class timelineViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_image = view.findViewById<ImageView>(R.id.iv_pic)
        var tv_like = view.findViewById<TextView>(R.id.tv_like)
        var tv_comment = view.findViewById<TextView>(R.id.tv_comment)
        var ll_item_user = view.findViewById<LinearLayout>(R.id.ll_item_user)
    }

    class galleryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_image = view.findViewById<ImageView>(R.id.iv_small)
    }
}
