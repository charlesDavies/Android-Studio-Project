package com.example.infoosrs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }




    public void launchTrainingActivity(View view) {
        Intent intent = new Intent(this, TrainingActivity.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button Clicked!");
    }

    public void launchMoneyMakingActivity(View view) {
        String url = "https://oldschool.runescape.wiki/w/Money_making_guide";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void launchGEActivity(View view) {
        String url = "https://secure.runescape.com/m=itemdb_oldschool/";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void launchSkillCalcActivity(View view) {
        Intent intent = new Intent(this, SkillCalcActivity.class);
        startActivity(intent);
    }

    public void launchCBLevelActivity(View view) {
        Intent intent = new Intent(this, CombatLevelCalc.class);
        startActivity(intent);
    }

    public void launchMusicActivity(View view) {
        Intent intent = new Intent(this, musicActivity.class);
        startActivity(intent);
    }

    public void launchGEParseActivity(View view) {
        Intent intent = new Intent(this, GEActivity.class);
        startActivity(intent);
    }
}