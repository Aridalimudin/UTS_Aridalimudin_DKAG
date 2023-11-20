package com.nashir.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.ButtonBarLayout

class NonEmergencyActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast", "MissingInflatedId")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_non_emergency)

        val exit : ImageView = findViewById(R.id.back)
        exit.setOnClickListener(this)

        val gird : ImageView = findViewById(R.id.grid)
        gird.setOnClickListener(this)

        val cpr : ImageView = findViewById(R.id.cpr)
        cpr.setOnClickListener(this)

        val asma: ImageView = findViewById(R.id.asma)
        asma.setOnClickListener(this)

        val kecelakaan : ImageView = findViewById(R.id.kecelakaan)
        kecelakaan.setOnClickListener(this)

        val jantung : ImageView = findViewById(R.id.jantung)
        jantung.setOnClickListener(this)

        val tenggelam : ImageView = findViewById(R.id.tenggelam)
        tenggelam.setOnClickListener(this)

        val kepala : ImageView = findViewById(R.id.kepala)
        kepala.setOnClickListener(this)

        val pendarahan : ImageView = findViewById(R.id.pendarahan)
        pendarahan.setOnClickListener(this)

        val luka : ImageView = findViewById(R.id.luka)
        luka.setOnClickListener(this)



    }

    private fun setSupportActionBar(toolbar: Toolbar) {
        val toolbar : Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }


    override fun onClick(v: View?) {
            when (v?.id) {

                R.id.back -> {
                    val backintent = Intent(this@NonEmergencyActivity, MenuActivity::class.java)
                    startActivity(backintent)
                }

                R.id.grid-> {
                    val girdintent = Intent(this@NonEmergencyActivity, CardActivity::class.java)
                    startActivity(girdintent)
                }

                R.id.cpr-> {
                    val cprintent = Intent(this@NonEmergencyActivity, CprActivity::class.java)
                    startActivity(cprintent)
                }

                R.id.asma-> {
                    val asmaintent = Intent(this@NonEmergencyActivity, DeskripsiActivity::class.java)
                    startActivity(asmaintent)
                }

                R.id.kecelakaan-> {
                    val kecelakaanintent = Intent(this@NonEmergencyActivity, KecelakaanActivity::class.java)
                    startActivity(kecelakaanintent)
                }

                R.id.jantung-> {
                    val jantungintent = Intent(this@NonEmergencyActivity, JantungActivity::class.java)
                    startActivity(jantungintent)
                }

                R.id.tenggelam-> {
                    val tenggelamintent = Intent(this@NonEmergencyActivity, TenggelamActivity::class.java)
                    startActivity(tenggelamintent)
                }

                R.id.kepala-> {
                    val kepalaintent = Intent(this@NonEmergencyActivity, SakitKepalaActivity::class.java)
                    startActivity(kepalaintent)
                }

                R.id.pendarahan-> {
                    val pendarahanintent = Intent(this@NonEmergencyActivity, PendarahanActivity::class.java)
                    startActivity(pendarahanintent)
                }

                R.id.luka-> {
                    val lukaintent = Intent(this@NonEmergencyActivity, LukaActivity::class.java)
                    startActivity(lukaintent)
                }

            }


    }
}


