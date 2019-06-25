package com.example.challenge2instagram.MainActivity_MVP

import com.example.challenge2instagram.Data.IconData
import com.example.challenge2instagram.Data.TimeLineData
import com.example.challenge2instagram.Data.Userinfo

interface InterFace_ModelAndPresenter {
    fun getIconDataFromModel() : MutableList<IconData>
    fun getTimeLineDataFromModel() : MutableList<TimeLineData>
}