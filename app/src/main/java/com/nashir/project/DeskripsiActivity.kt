package com.nashir.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.VideoView

class DeskripsiActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi)

        val back: ImageButton = findViewById(R.id.back2)
        back.setOnClickListener(this)


        val VideoView: VideoView = findViewById(R.id.video_view)
        VideoView.setVideoPath("android.resource://" + packageName + "/" + R.raw.video)
        VideoView.start()

        val mediaController = MediaController(this)
        mediaController.setAnchorView(VideoView)
        VideoView.setMediaController(mediaController)


    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.back2 -> {
                val backintent = finish()
                backintent
            }
        }
    }
}