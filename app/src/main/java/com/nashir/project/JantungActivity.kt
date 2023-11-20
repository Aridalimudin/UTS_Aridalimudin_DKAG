package com.nashir.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.VideoView

class JantungActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jantung)

        val back: ImageButton = findViewById(R.id.back5)
        back.setOnClickListener(this)

        val VideoSeranganJantung: VideoView = findViewById(R.id.video_serangan_jantung)
        VideoSeranganJantung.setVideoPath("android.resource://" + packageName + "/" + R.raw.jantung)
        VideoSeranganJantung.start()

        val mediaController = MediaController(this)
        mediaController.setAnchorView(VideoSeranganJantung)
        VideoSeranganJantung.setMediaController(mediaController)


    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.back5 -> {
                val backintent = Intent(this@JantungActivity, NonEmergencyActivity::class.java)
                startActivity(backintent)
            }
        }
    }
}