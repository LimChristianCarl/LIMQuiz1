package com.lim.limquiz1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lim.limquiz1.R;

public class Display_Froyo extends AppCompatActivity {

    ImageView logo;
    TextView codeName, version, api, releaseDate;
    String[] Codename, Version, API, ReleaseDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__froyo);

        Codename = getResources().getStringArray(R.array.AndroidVersions);
        API = getResources().getStringArray(R.array.API);
        Version = getResources().getStringArray(R.array.VersionNumber);
        ReleaseDate = getResources().getStringArray(R.array.ReleaseDate);

        logo = (ImageView) findViewById(R.id.logo);
        logo.setImageResource(R.drawable.froyo);

        codeName = (TextView) findViewById(R.id.codename);
        codeName.setText("\nCodename: " + Codename[1]);

        api = (TextView) findViewById(R.id.api);
        api.setText("\nVersion: " + Version[1]);

        version = (TextView) findViewById(R.id.version);
        version.setText("\nAPI: " + API[1]);

        releaseDate = (TextView) findViewById(R.id.releaseDate);
        releaseDate.setText("\nRelease Date: " + ReleaseDate[1]);
    }

    public void Donut(View view){
        Intent intent = new Intent(this, Display_Donut.class);
        startActivity(intent);
        finish();
    }

    public void Oreo(View view){
        Intent intent = new Intent(this, Display_Oreo.class);
        startActivity(intent);
        finish();
    }

    public void Home_Froyo(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
