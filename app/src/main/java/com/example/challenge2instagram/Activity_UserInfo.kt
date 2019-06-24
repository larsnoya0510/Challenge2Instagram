package com.example.challenge2instagram

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.bottomnavigation.LabelVisibilityMode
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.text.Html
import android.view.Gravity
import android.view.Menu
import com.bumptech.glide.Glide
import com.example.challenge2instagram.Adapter.RecycleView_Icon_Adapter
import com.example.challenge2instagram.Data.IconData
import com.example.challenge2instagram.Data.Userinfo
import kotlinx.android.synthetic.main.activity__user_info.*
import kotlinx.android.synthetic.main.activity__user_info.RecycleView_Icons
import kotlinx.android.synthetic.main.activity__user_info.bottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.FrameLayout
import android.widget.TableLayout

import android.support.design.widget.TabLayout
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import android.view.MenuItem
import com.example.challenge2instagram.Adapter.Switch_Layout_RecycleAdapter


class Activity_UserInfo : AppCompatActivity() {
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var itemsAdapter: Switch_Layout_RecycleAdapter
    lateinit var userinfo:Userinfo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__user_info)
        //取得資料
        userinfo = intent.getParcelableExtra<Userinfo>("userinfo")

        initView()
    }
    //綁定toobar menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar_userinfo, menu)
        return true
    }
    private fun switchLayout(mInt:Int) {
        gridLayoutManager.spanCount = mInt
        itemsAdapter.notifyItemRangeChanged(0, itemsAdapter.getItemCount())
    }
    //點選toolbar 返回鍵事件
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
    fun initView(){
        //=========設定底部導覽=======//
        bottomNavigationView.itemIconTintList=null
        bottomNavigationView.labelVisibilityMode= LabelVisibilityMode.LABEL_VISIBILITY_LABELED
        bottomNavigationView.itemIconSize=90
        //=========設定toolbar=======//
        setSupportActionBar(toolbar_userinfo)
        this.supportActionBar?.title=""
        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        this.supportActionBar?.setDisplayShowHomeEnabled(true)
        toolbar_title_username.text=userinfo.userName
        //填入對應資料
        tv_Posts_value.text = userinfo.posts.toString()+"K"
        tv_followers_Value.text = userinfo.followers.toString()+"M"
        tv_following_Value.text = userinfo.following.toString()
        Glide.with(this).load(userinfo.userIcon).into(iv_icon)
        tv_company.text = userinfo.company
        tv_companydescribe.text = userinfo.companydescribe
        tv_describe.text = userinfo.describe
        //設定文字超連結效果
        tv_website.setText(Html.fromHtml("<a href=\"https://google.com.tw/\">"+userinfo.website+"</a>"))
        var followers :String = "Followed by "
        //設定部分文字顯示特效
        for(i in 0 until userinfo.followBy.size){
            if(i==0){
                followers +="<font color=\"black\">"+userinfo.followBy[i].name+"</font>"
            }
            else if(i!=0 && i!=userinfo.followBy.size-1){
                followers += ", "+"<font color=\"black\">"+userinfo.followBy[i].name+"</font>"
            }
            else{
                followers +=" and "+"<font color=\"black\">"+ userinfo.followBy[i].name+"</font>"
            }
        }
        tv_followBy.setText(Html.fromHtml(followers))
        //=========設定icon 頭像=======//
        var lm= LinearLayoutManager(this)
        lm.orientation= LinearLayoutManager.HORIZONTAL
        RecycleView_Icons.layoutManager= lm
        var adapter = RecycleView_Icon_Adapter(this, IconData.defaultList)
        RecycleView_Icons.adapter = adapter
        var mDivider = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        RecycleView_Icons.addItemDecoration(mDivider)
        //設定文字超連結效果
        tv_email.setText(Html.fromHtml("<a href=\"https://google.com.tw/\">"+"Email"+"</a>"))
        //覆寫toolbar icon圖示大小
        var tablaytout = findViewById<android.support.design.widget.TabLayout>(R.id.Tablayout_this)
        for (i in 0 until tablaytout.tabCount) {
            val tab = tablaytout.getTabAt(i)
            if (tab != null) tab!!.setCustomView(R.layout.item_custom_tablayout)
        }
        //設定切換tablayout 改變recycleview 顯示樣式//
        var mTabSelectedListener = object :TabLayout.OnTabSelectedListener{
            override fun onTabReselected(p0: TabLayout.Tab?) {
            }
            override fun onTabUnselected(p0: TabLayout.Tab?) {
            }
            override fun onTabSelected(p0: TabLayout.Tab?) {
                Log.d("AAAAA",p0?.position.toString())
                if (p0?.position==0) {
                    switchLayout(3)
                }
                else if(p0?.position==1){
                    switchLayout(1)
                }
            }
        }
        tablaytout.addOnTabSelectedListener(mTabSelectedListener)
        //根據GridLayoutManager spanCount設定多個樣式
        gridLayoutManager= GridLayoutManager(this, 3)
        itemsAdapter = Switch_Layout_RecycleAdapter(userinfo.Gallery, gridLayoutManager)

        RecycleView_Tablayout_Switch.adapter = itemsAdapter
        RecycleView_Tablayout_Switch.layoutManager = gridLayoutManager
    }
}
