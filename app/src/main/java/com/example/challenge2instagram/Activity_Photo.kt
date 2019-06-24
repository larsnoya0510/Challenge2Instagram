package com.example.challenge2instagram

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.bottomnavigation.LabelVisibilityMode
import android.view.Menu
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.example.challenge2instagram.Data.TimeLineData
import kotlinx.android.synthetic.main.activity_photo.*

class Activity_Photo : AppCompatActivity() {
    lateinit var userPhoto : TimeLineData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)
        //取得intent資料
        userPhoto = intent.getParcelableExtra<TimeLineData>("userPhoto")
        initView()
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar_photo, menu)
        return true
    }
    fun initView(){
        //=========設定底部導覽=======//
        bottomNavigationView.itemIconTintList=null
        bottomNavigationView.labelVisibilityMode= LabelVisibilityMode.LABEL_VISIBILITY_LABELED
        bottomNavigationView.itemIconSize=90
        //=========設定toolbar=======//
        setSupportActionBar(toolbar_photo)
        this.supportActionBar?.title=""
        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        this.supportActionBar?.setDisplayShowHomeEnabled(true)
        //填入對應資料
        Glide.with(this).load(userPhoto.image).into(iv_pic)
        toolbar_title_photo.text="Photo"
        tv_comment.text = userPhoto.comment
        var randCount: Int = (Math.random() * 10000 + 1).toInt() //變數區間1-3 從1開始
        tv_like.text = randCount.toString() + " likes"
    }
}
