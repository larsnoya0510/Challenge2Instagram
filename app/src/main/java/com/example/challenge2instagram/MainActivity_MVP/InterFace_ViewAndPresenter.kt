package com.example.challenge2instagram.MainActivity_MVP

import com.example.challenge2instagram.Data.IconData
import com.example.challenge2instagram.Data.TimeLineData

interface InterFace_ViewAndPresenter {
    fun getIconDataFromPresenter(returnIconData:MutableList<IconData>)
    fun getTimeLineDataFromPresenter(returnTimeLineData:MutableList<TimeLineData>)
}