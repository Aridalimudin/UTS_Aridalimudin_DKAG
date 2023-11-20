package com.nashir.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class CardActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        val exit : ImageButton = findViewById(R.id.back1)
        exit.setOnClickListener(this)

        val urutan : ImageButton = findViewById(R.id.list)
        urutan.setOnClickListener(this)

        val cpr : CardView = findViewById(R.id.cardView2)
        cpr.setOnClickListener(this)

        val asma : CardView = findViewById(R.id.cardView)
        asma.setOnClickListener(this)

        val kecelakaan : CardView = findViewById(R.id.cardView3)
        kecelakaan.setOnClickListener(this)

        val jantung : CardView = findViewById(R.id.cardView4)
        jantung.setOnClickListener(this)

        val tenggelam : CardView = findViewById(R.id.cardView5)
        tenggelam.setOnClickListener(this)

        val sakit_kepala: CardView = findViewById(R.id.cardView6)
        sakit_kepala.setOnClickListener(this)

        val pendarahan: CardView = findViewById(R.id.cardView7)
        pendarahan.setOnClickListener(this)

        val luka_bakar: CardView = findViewById(R.id.cardView8)
        luka_bakar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.back1 -> {
                val backintent = Intent(this@CardActivity, NonEmergencyActivity::class.java)
                startActivity(backintent)
            }

            R.id.list -> {
                val listintent = Intent(this@CardActivity, NonEmergencyActivity::class.java)
                startActivity(listintent)
            }

            R.id.cardView -> {
                val asmaintent = Intent(this@CardActivity, CprActivity::class.java)
                startActivity(asmaintent)
            }

            R.id.cardView2 -> {
                val cprintent = Intent(this@CardActivity, DeskripsiActivity::class.java)
                startActivity(cprintent)
            }

            R.id.cardView3 -> {
                val kecelakaanintent = Intent(this@CardActivity, KecelakaanActivity::class.java)
                startActivity(kecelakaanintent)
            }

            R.id.cardView4 -> {
                val jantungintent = Intent(this@CardActivity, JantungActivity::class.java)
                startActivity(jantungintent)
            }
//
            R.id.cardView5 -> {
                val tenggelamintent = Intent(this@CardActivity, TenggelamActivity::class.java)
                startActivity(tenggelamintent)
            }

            R.id.cardView6 -> {
                val kepalaintent = Intent(this@CardActivity, SakitKepalaActivity::class.java)
                startActivity(kepalaintent)
            }

            R.id.cardView7 -> {
                val pendarahanintent = Intent(this@CardActivity, PendarahanActivity::class.java)
                startActivity(pendarahanintent)
            }

            R.id.cardView8 -> {
                val lukaintent = Intent(this@CardActivity, LukaActivity::class.java)
                startActivity(lukaintent)
            }

        }

    }
}