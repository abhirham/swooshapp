package com.example.savar.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.savar.swoosh.R
import com.example.savar.swoosh.model.player
import com.example.savar.swoosh.utilities.Player
import kotlinx.android.synthetic.main.activity_skillactivity.*

class skillactivity : baseactivity() {
    lateinit var player: player

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(Player,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skillactivity)
        player = intent.getParcelableExtra(Player)
        finish.setOnClickListener {
            if(player.skill!=""){
                val i = Intent(this, finalactivity::class.java)

                i.putExtra(Player, player)
                startActivity(i)
            }else
                Toast.makeText(this,"Please select your skill level",Toast.LENGTH_LONG).show()

        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null)
            player = savedInstanceState.getParcelable(Player)
    }


    fun beginner(view: View){
        balletbtn.isChecked = false
        player.skill="beginner"
            }

    fun baller(view: View){
        beginnerbtn.isChecked = false
        player.skill="baller"
    }
}
