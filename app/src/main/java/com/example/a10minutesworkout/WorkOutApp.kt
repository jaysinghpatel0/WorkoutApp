package com.example.a10minutesworkout

import android.app.Application

class WorkOutApp: Application() {

    val db by lazy{
        HistoryDatabase.getInstance(this)
    }

}