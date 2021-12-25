package com.example.compapp

import android.content.Context
import android.view.View
import android.widget.Toast

class DayNightGround (private val context: Context) {

    companion object {
        //city
        const val riyadhDBackground = R.drawable.day
        const val meccahDBackground = R.drawable.mday
        const val khobarDBackground = R.drawable.kday
        const val riyadhNBackground = R.drawable.night
        const val meccahNBackground = R.drawable.mnight
        const val khobarNBackground = R.drawable.knight

//        const val dayBackground = R.drawable.day
//        const val nightBackground = R.drawable.night
    }

    fun set(layout: View, dayNight: String , city : String ) {
        when (city){
            "riyadh" -> {
                when (dayNight){
                    "day" -> {
                        layout.setBackgroundResource(riyadhDBackground)
                    }
                    "night" -> {
                        layout.setBackgroundResource(riyadhNBackground)
                    }
                    else -> {
                        Toast.makeText(context, "Please enter either day or night", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            "meccah" -> {
                when (dayNight){
                    "day" -> {
                        layout.setBackgroundResource(meccahDBackground)
                    }
                    "night" -> {
                        layout.setBackgroundResource(meccahNBackground)
                    }
                    else -> {
                        Toast.makeText(context, "Please enter either day or night", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            "khobar" -> {
                when (dayNight){
                    "day" -> {
                        layout.setBackgroundResource(khobarDBackground)
                    }
                    "night" -> {
                        layout.setBackgroundResource(khobarNBackground)
                    }
                    else -> {
                        Toast.makeText(context, "Please enter either day or night", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            else -> {
                Toast.makeText(context, "Please full up the Text area !", Toast.LENGTH_SHORT).show()
            }
        }
        //
//        when (dayNight){
//            "day" -> {
//                layout.setBackgroundResource(dayBackground)
//            }
//            "night" -> {
//                layout.setBackgroundResource(nightBackground)
//            }
//            else -> {
//                Toast.makeText(context, "Please enter either day or night", Toast.LENGTH_SHORT).show()
//            }
//        }
    }

}