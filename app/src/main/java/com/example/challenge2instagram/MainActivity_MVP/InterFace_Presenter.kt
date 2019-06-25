package com.example.challenge2instagram.MainActivity_MVP

import com.example.challenge2instagram.Data.IconData
import com.example.challenge2instagram.Data.TimeLineData

interface InterFace_Presenter {
//    fun returnIconData(): MutableList<IconData>
//    fun returnTimeLineData(): MutableList<TimeLineData>

    fun requestIconData()
    fun requestTimeLineData()
}