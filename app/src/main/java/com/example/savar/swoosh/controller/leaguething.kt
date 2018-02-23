package com.example.savar.swoosh.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.savar.swoosh.R
import com.example.savar.swoosh.model.player
import com.example.savar.swoosh.utilities.Player


import kotlinx.android.synthetic.main.activity_leaguething.*

class leaguething : AppCompatActivity() {

    var play = player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(Player,play)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaguething)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null)
            play=savedInstanceState.getParcelable(Player)
    }

    fun next(view: View){
        if(play.league!="")
        {
            val nxt = Intent(this, skillactivity::class.java)
            nxt.putExtra(Player,play)
            startActivity(nxt)

        }
        else
            Toast.makeText(this,"Please select an activity",Toast.LENGTH_LONG).show()
    }

    fun menclick(view: View){
        womenb.isChecked = false
        coedb.isChecked = false
        play.league= "Mens"
        //Toast.makeText(this,choice, Toast.LENGTH_LONG).show()
    }

    fun woclick(view: View){
        manb.isChecked = false
        coedb.isChecked = false
        play.league= "Womens"
        //Toast.makeText(this,choice, Toast.LENGTH_LONG).show()
    }

    fun coclick(view: View){
        manb.isChecked=false
        womenb.isChecked= false
        play.league= "co-ed"
    }
}
