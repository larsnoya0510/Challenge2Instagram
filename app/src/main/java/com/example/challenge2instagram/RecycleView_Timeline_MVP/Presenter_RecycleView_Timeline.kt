package com.example.challenge2instagram.RecycleView_Timeline_MVP

import com.example.challenge2instagram.Data.GetUserInfoData
import com.example.challenge2instagram.Data.Userinfo

class Presenter_RecycleView_Timeline(mView : InterFace_View_RecycyleView_TimeLine) :
    InterFace_Presenter_RecycleViewTimelime {
    var thisView=mView
    lateinit var mUserinfo:Userinfo
    var mDataGetter = GetUserInfoData()
    override fun requestUserinfo() {
        mUserinfo=mDataGetter.getUserinfoFromModel()
        thisView.getUserinfoFromPresenter(mUserinfo)
    }






}