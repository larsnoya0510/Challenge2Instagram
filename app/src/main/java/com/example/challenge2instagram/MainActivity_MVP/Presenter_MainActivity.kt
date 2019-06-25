package com.example.challenge2instagram.MainActivity_MVP

import com.example.challenge2instagram.Data.GetIconAndTimelineData
import com.example.challenge2instagram.Data.IconData
import com.example.challenge2instagram.Data.TimeLineData
import com.example.challenge2instagram.MainActivity_MVP.InterFace_Presenter
import com.example.challenge2instagram.MainActivity_MVP.InterFace_ViewAndPresenter

class Presenter_MainActivity(mView : InterFace_ViewAndPresenter) :
    InterFace_Presenter {
    var mDataGetter = GetIconAndTimelineData()
    var thisView=mView
    lateinit var mIconData:MutableList<IconData>
    lateinit var mTimeLineData:MutableList<TimeLineData>
    override fun requestIconData() {
        mIconData=mDataGetter.getIconDataFromModel()
        thisView.getIconDataFromPresenter(mIconData)
    }

    override fun requestTimeLineData() {
        mTimeLineData=mDataGetter.getTimeLineDataFromModel()
        thisView.getTimeLineDataFromPresenter(mTimeLineData)
    }


//    override fun returnTimeLineData(): MutableList<TimeLineData> {
//       return mDataGetter.getTimeLineDataFromModel()
//    }
//
//
//    override fun returnIconData(): MutableList<IconData> {
//        return mDataGetter.getIconDataFromModel()
//    }



}