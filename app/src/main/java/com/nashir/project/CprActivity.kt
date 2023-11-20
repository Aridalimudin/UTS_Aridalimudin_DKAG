package com.nashir.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.VideoView

class CprActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cpr)

        val back: ImageButton = findViewById(R.id.back3)
        back.setOnClickListener(this)

        val VideoCpr: VideoView = findViewById(R.id.video_cpr)
        VideoCpr.setVideoPath("android.resource://" + packageName + "/" + R.raw.cpr)
        VideoCpr.start()

        val mediaController = MediaController(this)
        mediaController.setAnchorView(VideoCpr)
        VideoCpr.setMediaController(mediaController)
    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.back3 -> {
                val backintent = Intent(this@CprActivity, NonEmergencyActivity::class.java)
                startActivity(backintent)
            }
        }
    }
}