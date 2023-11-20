package com.nashir.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton


class MenuActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnnonemergency : ImageButton = findViewById(R.id.btnnonemergency)
        btnnonemergency.setOnClickListener(this)

        val btnemergency : ImageButton = findViewById(R.id.btnemergency)
        btnemergency.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btnnonemergency -> {
                    val intent = Intent(this@MenuActivity, NonEmergencyActivity::class.java)
                    startActivity(intent)
                }

                R.id.btnemergency -> {
                    val intent = Intent(this@MenuActivity, Emergency::class.java)
                    startActivity(intent)
                }
            }
        }

    }
}