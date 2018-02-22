package com.example.savar.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.savar.swoosh.R

open class baseactivity : AppCompatActivity() {

    val tag= "Lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tag,"${javaClass.simpleName} OnCreate" )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baseactivity)

    }

    override fun onStart() {
        Log.d(tag,"${javaClass.simpleName} OnStart" )
        super.onStart()
    }

    override fun onResume() {
        Log.d(tag,"${javaClass.simpleName} OnResume" )
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag,"${javaClass.simpleName} OnPause" )
        super.onPause()
    }

    override fun onStop() {
        Log.d(tag,"${javaClass.simpleName} OnStop" )
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tag,"${javaClass.simpleName} OnDestroy" )
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d(tag,"${javaClass.simpleName} OnRestart" )
        super.onRestart()
    }
}
