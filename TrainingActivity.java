package com.example.infoosrs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class TrainingActivity extends AppCompatActivity {

    //private EditText mWebsiteEditText;
    private EditText mLocationEditText;
    private EditText mShareTextEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        //mWebsiteEditText = findViewById(R.id.website_edittext);
        //mLocationEditText = findViewById(R.id.location_edittext);
        //mShareTextEditText = findViewById(R.id.share_edittext);
    }

    public void openFishing(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Pay-to-play_Fishing_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openHunter(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Hunter_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openAgility(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Agility_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openRunecrafting(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Pay-to-play_Runecraft_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openSlayer(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Slayer_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openFarming(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Farming_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openMagic(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Pay-to-play_Magic_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openFletching(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Fletching_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openWoodCutting(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Pay-to-play_Woodcutting_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openPrayer(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Pay-to-play_Prayer_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openCrafting(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Pay-to-play_Crafting_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openRange(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Pay-to-play_Ranged_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openMelee(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Pay-to-play_melee_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openFM(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Pay-to-play_Firemaking_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openThieving(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Thieving_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openCooking(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Pay-to-play_Cooking_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openHerblore(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Herblore_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openSmithing(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Pay-to-play_Smithing_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }

    public void openMining(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Pay-to-play_Mining_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }



    public void openConstruction(View view) {
        //String url = mWebsiteEditText.getText().toString();
        String url = "https://oldschool.runescape.wiki/w/Construction_training";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't Handle This!");
        }
    }
}