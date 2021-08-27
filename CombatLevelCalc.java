package com.example.infoosrs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CombatLevelCalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combat_level_calc);


    }

    public void calculateCombatLevel(View view) {

        TextView attackLevel = findViewById(R.id.attackNumber);
        TextView hpLevel = findViewById(R.id.hpNumber);
        TextView strengthLevel = findViewById(R.id.strengthNumber);
        TextView defenceLevel = findViewById(R.id.defenceNumber);
        TextView magicLevel = findViewById(R.id.magicNumber);
        TextView rangedLevel = findViewById(R.id.rangeNumber);
        TextView prayerLevel = findViewById(R.id.prayerNumber);
        TextView result = findViewById(R.id.result);

        String obtainedAttackLevel = attackLevel.getText().toString();
        String tempStringPrayer = prayerLevel.getText().toString();
        String tempStringHP = hpLevel.getText().toString();
        String tempStringDefence = defenceLevel.getText().toString();
        String tempStringStrength = strengthLevel.getText().toString();
        String tempStringMagic = magicLevel.getText().toString();
        String tempStringRange = rangedLevel.getText().toString();


        int tempPrayer = Integer.parseInt(tempStringPrayer);
        int tempAttack = Integer.parseInt(obtainedAttackLevel);
        int tempHP = Integer.parseInt(tempStringHP);
        int tempDefence = Integer.parseInt(tempStringDefence);
        int tempStr = Integer.parseInt(tempStringStrength);
        int tempMagic = Integer.parseInt(tempStringMagic);
        int tempRange = Integer.parseInt(tempStringRange);
        int dividedPrayer = tempPrayer / 2;

        int step2 = (dividedPrayer + tempHP + tempDefence) / 4;
        double step3 = ((tempStr + tempAttack) * 0.325) + step2;

        int strAttackTotal = tempAttack + tempStr;
        int magicRangeTotal = tempMagic + tempRange;

        if (magicRangeTotal > strAttackTotal)
        {
            if (tempRange > tempMagic) {
                int step4RANGE = tempRange / 2 + tempRange;
                double step5RANGE = step4RANGE * 0.325 + step2;
                result.setText("Your Combat Level would be " + String.valueOf(step5RANGE));
            }
            else if (tempMagic > tempRange) {
                int step4MAGIC = tempMagic / 2 + tempMagic;
                double step5MAGIC = step4MAGIC * 0.325 + step2;
                result.setText("Your Combat Level would be " + String.valueOf(step5MAGIC));
            }
            else if (tempMagic == tempRange) {
                int step4MAGIC = tempMagic / 2 + tempMagic;
                double step5MAGIC = step4MAGIC * 0.325 + step2;
                result.setText("Your Combat Level would be " + String.valueOf(step5MAGIC));
            }
        }
        else {
            result.setText("Your Combat Level would be " + String.valueOf(step3));
        }

    }
}