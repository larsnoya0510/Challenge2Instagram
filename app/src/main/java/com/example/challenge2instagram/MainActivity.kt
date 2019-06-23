package com.example.challenge2instagram

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.bottomnavigation.LabelVisibilityMode
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.example.challenge2instagram.Adapter.RecycleView_Icon_Adapter
import kotlinx.android.synthetic.main.activity_main.*
import android.view.Menu
import com.example.challenge2instagram.Adapter.RecycleView_TimeLine_Adapter
import com.example.challenge2instagram.Data.IconData
import com.example.challenge2instagram.Data.TimeLineData


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var lm= LinearLayoutManager(this)
        lm.orientation=LinearLayoutManager.HORIZONTAL
        RecycleView_Icons.layoutManager= lm
        var adapter = RecycleView_Icon_Adapter(this, IconData.defaultList)
        RecycleView_Icons.adapter = adapter
        var mDivider = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        RecycleView_Icons.addItemDecoration(mDivider)
        bottomNavigationView.itemIconTintList=null
        bottomNavigationView.labelVisibilityMode= LabelVisibilityMode.LABEL_VISIBILITY_LABELED
        bottomNavigationView.itemIconSize=90
        setSupportActionBar(toolbar_this)
        this.getSupportActionBar()?.title=""
        var tlm= LinearLayoutManager(this)
        RecycleView_TimeLine.layoutManager=tlm
        var timelineAdapter = RecycleView_TimeLine_Adapter(this, TimeLineData.defaultList)
        RecycleView_TimeLine.adapter=timelineAdapter
        RecycleView_TimeLine.addItemDecoration(mDivider)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }
}
