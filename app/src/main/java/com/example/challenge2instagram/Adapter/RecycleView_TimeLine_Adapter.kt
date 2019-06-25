package com.example.challenge2instagram.Adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.challenge2instagram.Activity_UserInfo
import com.example.challenge2instagram.Data.TimeLineData
import com.example.challenge2instagram.Data.Userinfo
import com.example.challenge2instagram.RecycleView_Timeline_MVP.InterFace_View_RecycyleView_TimeLine
import com.example.challenge2instagram.RecycleView_Timeline_MVP.Presenter_RecycleView_Timeline
import com.example.challenge2instagram.R
class RecycleView_TimeLine_Adapter(
    private val context : Context,
    private val dataList: MutableList<TimeLineData>
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(),
    InterFace_View_RecycyleView_TimeLine {
    lateinit var mUserInfo : Userinfo
    override fun getUserinfoFromPresenter(returnUserinfo: Userinfo) {
        mUserInfo = returnUserinfo
    }
init{
    var mPresenter_RecycleViewTimelime =
        Presenter_RecycleView_Timeline(this)
    mPresenter_RecycleViewTimelime.requestUserinfo()
}
    lateinit var mContext: Context
    val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View = inflater.inflate(R.layout.item_timeline_recycleview_layout, parent, false)
        mContext = parent.getContext()
        return timelineViewHolder(view)
    }
    override fun getItemCount(): Int {
        return dataList.size
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var vh: timelineViewHolder = holder as timelineViewHolder
        Glide.with(mContext).load(dataList[position].image).into(vh.iv_image)
        //vh.isEllipsize=dataList[position].isEllipsize
        vh.tv_comment.text = dataList[position].comment
        vh.tv_comment.setOnClickListener {
            when(dataList[position].isEllipsize) {
                1 ->{
                    vh.tv_comment.ellipsize = TextUtils.TruncateAt.END
                    vh.tv_comment.setSingleLine(true)
                    dataList[position].isEllipsize= 0
                } else-> {
                    vh.tv_comment.ellipsize = null
                    vh.tv_comment.setSingleLine(false)
                    dataList[position].isEllipsize= 1
                }
            }
        }
        var randCount:Int = (Math.random()*10000+1).toInt() //變數區間1-3 從1開始
        vh.tv_like.text =randCount.toString()+" likes"
        vh.ll_item_user.setOnClickListener {
//            var userInfo = Userinfo.defaultData
            var userInfo = mUserInfo
            var intent_getUser=Intent(this.context,Activity_UserInfo::class.java)
            intent_getUser.putExtra("userinfo",userInfo)
            this.context.startActivity(intent_getUser)
        }
    }
    inner class timelineViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_image = view.findViewById<ImageView>(R.id.iv_pic)
        var tv_like = view.findViewById<TextView>(R.id.tv_like)
        var tv_comment = view.findViewById<TextView>(R.id.tv_comment)
        var ll_item_user = view.findViewById<LinearLayout>(R.id.ll_item_user)
        //var isEllipsize =0
    }
}