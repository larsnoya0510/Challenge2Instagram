package com.example.challenge2instagram

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.Menu
import com.bumptech.glide.Glide
import com.example.challenge2instagram.Data.Userinfo
import kotlinx.android.synthetic.main.activity__user_info.*

class Activity_UserInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__user_info)
        var userinfo = intent.getParcelableExtra<Userinfo>("userinfo")

        setSupportActionBar(toolbar_userinfo)
        this.supportActionBar?.title=""
        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        this.supportActionBar?.setDisplayShowHomeEnabled(true)
        toolbar_title_username.text=userinfo.userName

        tv_Posts_value.text = userinfo.posts.toString()+"K"
        tv_followers_Value.text = userinfo.followers.toString()+"M"
        tv_following_Value.text = userinfo.following.toString()
        Glide.with(this).load(userinfo.userIcon).into(iv_icon)
        tv_company.text = userinfo.company
        tv_companydescribe.text = userinfo.companydescribe
        tv_describe.text = userinfo.describe
        tv_website.setText(Html.fromHtml("<a href=\"https://google.com.tw/\">"+userinfo.website+"</a>"))
        var followers :String = "Followed by "
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
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar_userinfo, menu)
        return true
    }
}
