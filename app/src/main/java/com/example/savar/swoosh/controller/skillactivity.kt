package com.example.savar.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.savar.swoosh.R
import com.example.savar.swoosh.utilities.selected
import com.example.savar.swoosh.utilities.skills
import kotlinx.android.synthetic.main.activity_skillactivity.*

class skillactivity : baseactivity() {
    var choice = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skillactivity)
        choice = intent.getStringExtra(selected)
        finish.setOnClickListener {
            if(skill!=""){
                val i = Intent(this, finalactivity::class.java)

                i.putExtra(skills,skill)
                i.putExtra(selected,choice)
                startActivity(i)
            }else
                Toast.makeText(this,"Please select your skill level",Toast.LENGTH_LONG).show()

        }
    }

    fun beginner(view: View){
        balletbtn.isChecked = false
        skill="beginner"
            }

    fun baller(view: View){
        beginnerbtn.isChecked = false
        skill="baller"
    }
}
