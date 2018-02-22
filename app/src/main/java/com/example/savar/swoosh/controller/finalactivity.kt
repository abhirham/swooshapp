package com.example.savar.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.savar.swoosh.R
import com.example.savar.swoosh.utilities.selected
import com.example.savar.swoosh.utilities.skills
import kotlinx.android.synthetic.main.activity_finalactivity.*

class finalactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalactivity)
        val league= intent.getStringExtra(selected)
        val skill = intent.getStringExtra(skills)
        searchleague.text = "Looking for $league $skill league near yous."
    }
}
