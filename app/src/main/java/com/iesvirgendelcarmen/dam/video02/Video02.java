package com.iesvirgendelcarmen.dam.video02;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video02 extends AppCompatActivity {
    VideoView reproductor;
    private MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video02);

        reproductor=(VideoView)findViewById(R.id.video);

        //video.setVideoPath("/mnt/sdcard/VIDEO.mp4");
        //reproductor.setVideoURI(Uri.parse(""));
        //mediaController.setAnchorView(reproductor);
        reproductor.setMediaController(mediaController);

        reproductor.start();
        reproductor.requestFocus();


    }
}
