package com.nashir.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class Emergency : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency)

        val back: ImageButton = findViewById(R.id.back)
        back.setOnClickListener(this)
        val ambulance: ImageView = findViewById(R.id.ambulance)
        ambulance.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.back -> {
                    val backtoPrev = finish()
                    backtoPrev
                }

                R.id.ambulance -> {
                    val intent = Intent(this@Emergency, ListAmbulance::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}