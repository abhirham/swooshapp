package com.example.savar.swoosh.controller

import android.content.Intent
import android.os.Bundle
import com.example.savar.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class welcomeActivity : baseactivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        get_startedbtn.setOnClickListener {
            val leagueintent= Intent(this, leaguething::class.java)
            startActivity(leagueintent)
        }
    }
}
