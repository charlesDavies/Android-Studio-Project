package com.example.infoosrs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CookingCalc extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    public static int[] xp = {0, 83, 174, 276, 388, 512, 650, 801, 969, 1154, 1358, 1584, 1833, 2107,
            2411, 2764, 3115, 3523, 3973, 4470, 5018, 5624, 6291, 7028, 7842,
            8740, 9730, 10824, 12031, 13363, 14833, 16456, 18247, 20224, 22406,
            24815, 27473, 30408, 33648, 37224, 41171, 45529, 50339, 55649,
            61512, 67983, 75127, 83014, 91721, 101333, 111945, 123660, 136594,
            150872, 166636, 184040, 203254, 224466, 247886, 273742, 302288,
            333804, 368599, 407015, 449428, 496254, 547953, 605032, 668051,
            737627, 814445, 899257, 992895, 1096278, 1210421, 1336443, 1475581,
            1629200, 1798808, 1986068, 2192818, 2421087, 2673114, 2951373, 3258594,
            3597792, 3972294, 4385776, 4842295, 5346332, 5902831, 6517253, 7195629,
            7944614, 8771558, 9684557, 10629629, 11805606, 13034431};

    public int shrimps = 30;
    public int anchovies = 30;
    public int sardine = 40;
    public int herring = 50;
    public int mackerel = 60;
    public int trout = 70;
    public int cod = 75;
    public int pike = 80;
    public int salmon = 90;
    public int tuna = 100;
    public int karambwan = 190;
    public int rainbowFish = 110;
    public int caveEel = 115;
    public int lobster = 120;
    public int bass = 130;
    public int swordfish = 140;
    public int lavaEel = 30;
    public int monkfish = 150;
    public int shark = 210;
    public int seaTurtle = 211;
    public int anglerfish = 230;
    public int darkCrab = 215;
    public int mantaRay = 216;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking_calc);

        Spinner spinner = findViewById(R.id.spinner_food);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.food, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String text = parent.getItemAtPosition(position).toString();

        TextView textView = findViewById(R.id.textView44);
        TextView textView2 = findViewById(R.id.textView34);
        TextView levelStart1 = findViewById(R.id.startLevel4);
        TextView levelEnd1 = findViewById(R.id.desiredLevel4);
        String levelStart2 = levelStart1.getText().toString();
        String levelEnd2 = levelEnd1.getText().toString();


        String textLog = text + " to reach your desired level";
        textView.setText(textLog);
        textView2.setText(levelStart2 + " " + levelEnd2);

        if(!levelStart1.getText().toString().equals(""))
        {
            int tempStart = Integer.parseInt(levelStart2);
            if (tempStart < 1 || tempStart > 99)
            {
                Context context = getApplicationContext();
                CharSequence output = "Please only enter numbers between 1 - 99";
                int duration = Toast.LENGTH_SHORT;
                Toast toast2 = Toast.makeText(context, output, duration);
                toast2.show();

            }
            else if(!levelEnd1.getText().toString().equals(""))
            {
                int tempEnd = Integer.parseInt(levelEnd2);
                if (tempEnd < 1 || tempEnd > 99) {
                    Context context = getApplicationContext();
                    CharSequence output = "Please only enter numbers between 1 - 99";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast2 = Toast.makeText(context, output, duration);
                    toast2.show();

                } else {

                    int temptemp = xp[tempStart - 1];
                    int tempAgain = xp[tempEnd - 1];
                    int tempTotal = tempAgain - temptemp;

                    if (parent.getItemAtPosition(position).toString().equals("Shrimps")) {
                        int logAmount = tempTotal / shrimps;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Anchovies")) {
                        int logAmount = tempTotal / anchovies;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Sardine")) {
                        int logAmount = tempTotal / sardine;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Herring")) {
                        int logAmount = tempTotal / herring;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Mackerel")) {
                        int logAmount = tempTotal / mackerel;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Trout")) {
                        int logAmount = tempTotal / trout;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Cod")) {
                        int logAmount = tempTotal / cod;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }
                    if (parent.getItemAtPosition(position).toString().equals("Pike")) {
                        int logAmount = tempTotal / pike;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Salmon")) {
                        int logAmount = tempTotal / salmon;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Tuna")) {
                        int logAmount = tempTotal / tuna;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }
                    if (parent.getItemAtPosition(position).toString().equals("Karambwan")) {
                        int logAmount = tempTotal / karambwan;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Rainbow Fish")) {
                        int logAmount = tempTotal / rainbowFish;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Cave Eel")) {
                        int logAmount = tempTotal / caveEel;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Lobster")) {
                        int logAmount = tempTotal / lobster;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Bass")) {
                        int logAmount = tempTotal / bass;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }
                    if (parent.getItemAtPosition(position).toString().equals("Swordfish")) {
                        int logAmount = tempTotal / swordfish;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Lava Eel")) {
                        int logAmount = tempTotal / lavaEel;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Monkfish")) {
                        int logAmount = tempTotal / monkfish;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Shark")) {
                        int logAmount = tempTotal / shark;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Sea Turtle")) {
                        int logAmount = tempTotal / seaTurtle;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }
                    if (parent.getItemAtPosition(position).toString().equals("Anglerfish")) {
                        int logAmount = tempTotal / anglerfish;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Dark Crab")) {
                        int logAmount = tempTotal / darkCrab;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Manta Ray")) {
                        int logAmount = tempTotal / mantaRay;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                }

            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}