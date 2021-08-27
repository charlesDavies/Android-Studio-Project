package com.example.infoosrs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SkillCalcActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_calc);

    }

    public void launchWCCalcActivity(View view) {
        Intent intent = new Intent(this, WoodCuttingCalc.class);
        startActivity(intent);
    }

    public void launchFMCalcActivity(View view) {
        Intent intent = new Intent(this, FiremakingCalc.class);
        startActivity(intent);
    }

    public void launchMiningCalcActivity(View view) {
        Intent intent = new Intent(this, MiningCalc.class);
        startActivity(intent);
    }

    public void launchPrayerCalcActivity(View view) {
        Intent intent = new Intent(this, PrayerCalc.class);
        startActivity(intent);
    }

    public void launchCookingCalcActivity(View view) {
        Intent intent = new Intent(this, CookingCalc.class);
        startActivity(intent);
    }
}