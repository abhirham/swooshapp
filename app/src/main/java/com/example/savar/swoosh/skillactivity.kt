package com.example.savar.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class skillactivity : baseactivity() {
    var choice = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skillactivity)
        choice = intent.getStringExtra(selected)
        Toast.makeText(this,choice,Toast.LENGTH_LONG).show()
    }
}
