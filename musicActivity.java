package com.example.infoosrs;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class musicActivity extends AppCompatActivity {

    MediaPlayer song;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        song = MediaPlayer.create(
                this, R.raw.mdance);
        song.start();

        TextView songChoice = findViewById(R.id.nowPlaying);
        songChoice.setText("Now Playing: Miracle Dance (OSRS SOUNDTRACK)");




    }

    public void playSong(View view) {
        song.start();
    }

    public void pauseSong(View view) {
        song.pause();
    }

    public void stopSong(View view) {
        song.stop();
    }

    public void playMiracleDance(View view) {
        if(song.isPlaying()) {
            song.stop();
        }
        song = MediaPlayer.create(
                this, R.raw.mdance);
        song.start();

        TextView songChoice = findViewById(R.id.nowPlaying);
        songChoice.setText("Now Playing: Miracle Dance (OSRS SOUNDTRACK)");
    }

    public void playYesteryear(View view) {
        if(song.isPlaying()) {
            song.stop();
        }
        song = MediaPlayer.create(
                this, R.raw.yesteryear);
        song.start();

        TextView songChoice = findViewById(R.id.nowPlaying);
        songChoice.setText("Now Playing: Yesteryear (OSRS SOUNDTRACK)");
    }

    public void playShine(View view) {
        if(song.isPlaying()) {
            song.stop();
        }
        song = MediaPlayer.create(
                this, R.raw.shine);
        song.start();

        TextView songChoice = findViewById(R.id.nowPlaying);
        songChoice.setText("Now Playing: Shine (OSRS SOUNDTRACK)");
    }

    public void playWaterfall(View view) {
        if(song.isPlaying()) {
            song.stop();
        }
        song = MediaPlayer.create(
                this, R.raw.waterfall);
        song.start();

        TextView songChoice = findViewById(R.id.nowPlaying);
        songChoice.setText("Now Playing: Waterfall (OSRS SOUNDTRACK)");
    }
}