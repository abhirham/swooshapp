package com.example.savar.swoosh.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.savar.swoosh.R
import com.example.savar.swoosh.utilities.selected

import kotlinx.android.synthetic.main.activity_leaguething.*

class leaguething : AppCompatActivity() {
    var choice=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaguething)

    }
    fun next(view: View){
        if(choice!="")
        {
            val nxt = Intent(this, skillactivity::class.java)
            nxt.putExtra(selected,choice)
            startActivity(nxt)

        }
        else
            Toast.makeText(this,"Please select an activity",Toast.LENGTH_LONG).show()
    }

    fun menclick(view: View){
        womenb.isChecked = false
        coedb.isChecked = false
        choice= "Mens"
        //Toast.makeText(this,choice, Toast.LENGTH_LONG).show()
    }

    fun woclick(view: View){
        manb.isChecked = false
        coedb.isChecked = false
        choice= "Womens"
        //Toast.makeText(this,choice, Toast.LENGTH_LONG).show()
    }

    fun coclick(view: View){
        manb.isChecked=false
        womenb.isChecked= false
        choice= "co-ed"
    }
}
