package com.example.roombymyself

import android.app.Application
import com.example.roombymyself.data.MainDB

class App:Application() {
    val database by lazy{ MainDB.createDatabase(this)}
}