package com.example.infoosrs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class WoodCuttingCalc extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public int normalLog = 25;
    public int oakLog = 38;
    public int willowLog = 68;
    public int teakLog = 85;
    public int mapleLog = 100;
    public int mahoganyLog = 125;
    public int yewLog = 175;
    public int blisterwoodLog = 76;
    public int sulliuscepLog = 127;
    public int magicLog = 250;
    public int redwoodLog = 380;


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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wood_cutting_calc);

        Spinner spinner = findViewById(R.id.spinner_logs);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Logs, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        //Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
        TextView textView = findViewById(R.id.textView4);
        TextView textView2 = findViewById(R.id.textView3);
        TextView levelStart1 = findViewById(R.id.startLevel);
        TextView levelEnd1 = findViewById(R.id.desiredLevel);
        String levelStart2 = levelStart1.getText().toString();
        String levelEnd2 = levelEnd1.getText().toString();
        // ------ TESTING ----- ///
        //int testingNum = Integer.parseInt(levelEnd2);

        String textLog = text + " logs to reach your desired level";
        textView.setText(textLog);
        textView2.setText(levelStart2 + " " + levelEnd2);
        // NEED TO MAKE SURE THE USER CANNOT ENTER A NUMBER BELOW 1 OR ABOVE 99
        // MAYBE USE A TOAST TO TELL THE USER THEY NEED A DIFFERENT NUMBER
        // USE AN IF STATEMENT TO CHECK IF NUMBER IS IN RANGE BEFORE CODE STARTS
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

                    int tempXP = xp[tempEnd - 1] - xp[tempStart - 1];
                    int temptemp = xp[tempStart - 1];
                    int tempAgain = xp[tempEnd - 1];
                    int tempTotal = tempAgain - temptemp;
                    String tempXP2 = String.valueOf(tempXP);
                    String temptemp2 = String.valueOf(tempTotal);
                    // TURN TO STRING DUMBASS
                    //textView2.setText(temptemp2);

                    if (parent.getItemAtPosition(position).toString().equals("Normal")) {
                        int logAmount = tempTotal / normalLog;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Oak")) {
                        int logAmount = tempTotal / oakLog;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Willow")) {
                        int logAmount = tempTotal / willowLog;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Teak")) {
                        int logAmount = tempTotal / teakLog;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Maple")) {
                        int logAmount = tempTotal / mapleLog;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Mahogany")) {
                        int logAmount = tempTotal / mahoganyLog;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Yew")) {
                        int logAmount = tempTotal / yewLog;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }
                    if (parent.getItemAtPosition(position).toString().equals("Blisterwood")) {
                        int logAmount = tempTotal / blisterwoodLog;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Sulliuscep")) {
                        int logAmount = tempTotal / sulliuscepLog;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Magic")) {
                        int logAmount = tempTotal / magicLog;
                        String logAmount2 = String.valueOf(logAmount);
                        textView2.setText(logAmount2);
                    }

                    if (parent.getItemAtPosition(position).toString().equals("Redwood")) {
                        int logAmount = tempTotal / redwoodLog;
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