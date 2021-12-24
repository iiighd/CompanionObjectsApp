package com.example.compapp

import android.content.Context
import android.view.View
import android.widget.Toast

class DayNightGround (private val context: Context) {

    companion object {
        const val dayBackground = R.drawable.day
        const val nightBackground = R.drawable.night
    }

    fun set(layout: View, dayNight: String) {
        when (dayNight){
            "day" -> {
                layout.setBackgroundResource(dayBackground)
            }
            "night" -> {
                layout.setBackgroundResource(nightBackground)
            }
            else -> {
                Toast.makeText(context, "Please enter either day or night", Toast.LENGTH_SHORT).show()
            }
        }
    }

}