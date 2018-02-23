package com.example.savar.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.savar.swoosh.R
import com.example.savar.swoosh.model.player
import com.example.savar.swoosh.utilities.Player
import kotlinx.android.synthetic.main.activity_finalactivity.*

class finalactivity : AppCompatActivity() {
    lateinit var player: player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalactivity)
        player = intent.getParcelableExtra(Player)
        searchleague.text = "Looking for ${player.league} ${player.skill} league near yous."
    }
}
