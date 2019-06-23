package com.example.challenge2instagram

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.bottomnavigation.LabelVisibilityMode
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import com.example.challenge2instagram.Adapter.RecycleView_Icon_Adapter
import kotlinx.android.synthetic.main.activity_main.*
import android.util.DisplayMetrics
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var lm= LinearLayoutManager(this)
        lm.orientation=LinearLayoutManager.HORIZONTAL
        RecycleView_Icons.layoutManager= lm
        var adapter = RecycleView_Icon_Adapter(this,IconData.defaultList)
        RecycleView_Icons.adapter = adapter
        var mDivider = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        RecycleView_Icons.addItemDecoration(mDivider)
        bottomNavigationView.itemIconTintList=null
        bottomNavigationView.labelVisibilityMode= LabelVisibilityMode.LABEL_VISIBILITY_LABELED
        bottomNavigationView.itemIconSize=90
//        var toolbar =  findViewById(R.id.toolbar_this) as Toolbar
//        setSupportActionBar(toolbar)
//        this.getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
//        this.getSupportActionBar()?.setDisplayShowHomeEnabled(true)
        //toolbar_this.changeToolbarFont()
    }
//    fun Toolbar.changeToolbarFont(){
//        for (i in 0 until childCount) {
//            val view = getChildAt(i)
//            if (view is TextView && view.text == title) {
//                view.typeface = Typeface.createFromAsset(view.context.assets, "billabong.ttf")
//                break
//            }
//        }
//    }
}
