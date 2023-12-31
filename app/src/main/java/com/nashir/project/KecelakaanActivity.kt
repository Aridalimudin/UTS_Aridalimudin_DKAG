package com.nashir.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.VideoView

class KecelakaanActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kecelakaan)

        val back: ImageButton = findViewById(R.id.back4)
        back.setOnClickListener(this)

        val VideoKecelakaan: VideoView = findViewById(R.id.video_kecelakaan)
        VideoKecelakaan.setVideoPath("android.resource://" + packageName + "/" + R.raw.kecelakaan)
        VideoKecelakaan.start()

        val mediaController = MediaController(this)
        mediaController.setAnchorView(VideoKecelakaan)
        VideoKecelakaan.setMediaController(mediaController)


    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.back4 -> {
                val backintent = Intent(this@KecelakaanActivity, NonEmergencyActivity::class.java)
                startActivity(backintent)
            }
        }
    }
}