package com.example.compapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var constraintLayout: ConstraintLayout
    lateinit var labelTextView: TextView
    lateinit var dayNightEditText: EditText
    lateinit var changerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        constraintLayout = findViewById(R.id.cL)
        labelTextView = findViewById(R.id.labeltv)
        dayNightEditText = findViewById(R.id.daynightET)
        changerButton = findViewById(R.id.changerBTN)
        changerButton.setOnClickListener {
            val background = DayNightGround(this)
            background.set(constraintLayout, dayNightEditText.text.toString())
        }
    }
}