package com.example.infoosrs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GEActivity extends AppCompatActivity {
    TextView test2;
    TextView mostTraded2;
    TextView mostValText;

    public GEActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_e);
        test2  = findViewById(R.id.featuredItem);
        mostTraded2 = findViewById(R.id.mostTraded);
        mostValText = findViewById(R.id.mostVal);
        Button testButton = (Button) findViewById(R.id.testBut);

        testButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new grand().execute();           }
        }));
    }


    public class grand extends AsyncTask<Void, Void, Void> {
        String test;
        String temp;
        String temp2;
        String mostVal;
        String featuredItem;
        String mostTraded;
        Elements cls;
        Elements clsTraded;
        Elements clsVal;
        Elements h2;


        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Document doc = Jsoup.connect("https://secure.runescape.com/m=itemdb_oldschool/#_ga=2.211699477.1068161644.1620400678-1836917125.1617162344").get();
                Document doc2 = Jsoup.connect("https://secure.runescape.com/m=itemdb_oldschool/top100?list=0").get();
                Document doc3 = Jsoup.connect("https://secure.runescape.com/m=itemdb_oldschool/top100?list=1").get();
                test = doc.text();

                cls = doc.getElementsByClass("basic item member");
                clsTraded = doc2.getElementsByClass("table-item-link");
                clsVal = doc3.getElementsByClass("table-item-link");
                //clsTraded.first();

                h2 = cls.tagName("span");
                temp = h2.text();
                mostTraded = clsTraded.first().text();
                mostVal = clsVal.first().text();
                featuredItem = temp.substring(13);


            }catch(Exception e){e.printStackTrace();}
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            test2.setText("This Weeks Featured Item: " + featuredItem);
            mostTraded2.setText("This Weeks Most Traded Item: " + mostTraded);
            mostValText.setText("This Weeks Most Valuable Traded Item: " + mostVal);

        }
    }
}


