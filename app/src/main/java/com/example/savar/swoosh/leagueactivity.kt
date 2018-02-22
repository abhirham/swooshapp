package com.example.savar.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_leagueactivity.*

class leagueactivity : baseactivity() {

    var choice = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leagueactivity)

        coedb.setOnClickListener {
            Toast.makeText(this,"looollll",Toast.LENGTH_LONG).show()
        }
    }

    fun next(view: View){
        val i = Intent(this, skillactivity::class.java)
        startActivity(i)
    }

    fun menclick(view: View){
        womenb.isChecked = false
        coedb.isChecked = false
        choice= "Mens"
        Toast.makeText(this,choice,Toast.LENGTH_LONG).show()
    }

    fun woclick(view: View){
        manb.isChecked = false
        coedb
        choice= "Womens"
        Toast.makeText(this,choice,Toast.LENGTH_LONG).show()
    }

    fun coclick(view: View){
        womenb.isChecked = false
        manb.isChecked = false
        choice= "Coed"
        Toast.makeText(this,choice,Toast.LENGTH_LONG).show()
    }
}
