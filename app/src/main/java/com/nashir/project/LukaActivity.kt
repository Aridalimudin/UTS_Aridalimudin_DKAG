package com.nashir.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.VideoView

class LukaActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luka)

        val back: ImageButton = findViewById(R.id.back9)
        back.setOnClickListener(this)

        val VideoLuka: VideoView = findViewById(R.id.video_luka_bakar)
        VideoLuka.setVideoPath("android.resource://" + packageName + "/" + R.raw.luka_bakar)
        VideoLuka.start()

        val mediaController = MediaController(this)
        mediaController.setAnchorView(VideoLuka)
        VideoLuka.setMediaController(mediaController)
    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.back9 -> {
                val backintent = Intent(this@LukaActivity, NonEmergencyActivity::class.java)
                startActivity(backintent)
            }
        }
    }
}