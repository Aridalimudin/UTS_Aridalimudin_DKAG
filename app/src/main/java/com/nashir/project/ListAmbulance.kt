package com.nashir.project

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class ListAmbulance : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_ambulance)

        val Rs1 = findViewById<RelativeLayout>(R.id.Rs1)
        val Rs2 = findViewById<RelativeLayout>(R.id.Rs2)
        val Rs3 = findViewById<RelativeLayout>(R.id.Rs3)
        val backButton = findViewById<ImageButton>(R.id.back)

        Rs1.setOnClickListener(this)
        Rs2.setOnClickListener(this)
        Rs3.setOnClickListener(this)
        backButton.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v?.id){
            R.id.back -> {
                val backtoPrev = finish()
                backtoPrev
            }
            R.id.Rs1, R.id.Rs2, R.id.Rs3 -> {
                val intent = Intent(this, CallAmbulance::class.java)
                startActivity(intent)
            }
        }
    }
}
