package com.example.fragmentexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LaunchingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launching)


        // Get views reference
        val fragDemoBtn = findViewById<Button>(R.id.fragmentDemoBtn)
        val dialogFragmentBtn = findViewById<Button>(R.id.dFragmentDemoBtn)
        val preferenceFragmentBtn = findViewById<Button>(R.id.pFragmentDemobtn)

        // attach on click listeners
        fragDemoBtn.setOnClickListener {
            // send user to next activity
            startActivity(Intent(this, MainActivity::class.java))
        }

        // attach on click listeners
        dialogFragmentBtn.setOnClickListener {
            // Get fragment manager support
            val fragmentManager = supportFragmentManager
            // create object of class
            val dialogFragmentDemoObj = DialogFragmentDemo()
            // show dialog fragment
            dialogFragmentDemoObj.show(fragmentManager, "Dialog Fragment")
        }

        // attach on click listeners
        preferenceFragmentBtn.setOnClickListener {
            startActivity(Intent(this, Preference::class.java))
        }
    }
}