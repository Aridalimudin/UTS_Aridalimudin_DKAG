package com.nashir.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.VideoView

class PendarahanActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pendarahan)

        val back: ImageButton = findViewById(R.id.back8)
        back.setOnClickListener(this)

        val VideoPendarahan: VideoView = findViewById(R.id.video_pedarahan)
        VideoPendarahan.setVideoPath("android.resource://" + packageName + "/" + R.raw.pendarahan)
        VideoPendarahan.start()

        val mediaController = MediaController(this)
        mediaController.setAnchorView(VideoPendarahan)
        VideoPendarahan.setMediaController(mediaController)
    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.back8 -> {
                val backintent = Intent(this@PendarahanActivity, NonEmergencyActivity::class.java)
                startActivity(backintent)
            }
        }
    }
}