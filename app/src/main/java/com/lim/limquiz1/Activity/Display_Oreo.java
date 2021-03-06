package com.lim.limquiz1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lim.limquiz1.R;

public class Display_Oreo extends AppCompatActivity {

    ImageView logo;
    TextView codeName, version, api, releaseDate;
    String[] Codename, Version, API, ReleaseDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__oreo);

        Codename = getResources().getStringArray(R.array.AndroidVersions);
        API = getResources().getStringArray(R.array.API);
        Version = getResources().getStringArray(R.array.VersionNumber);
        ReleaseDate = getResources().getStringArray(R.array.ReleaseDate);

        logo = (ImageView) findViewById(R.id.logo);
        logo.setImageResource(R.drawable.oreo);

        codeName = (TextView) findViewById(R.id.codename);
        codeName.setText("\nCodename: " + Codename[2]);

        api = (TextView) findViewById(R.id.api);
        api.setText("\nVersion: " + Version[2]);

        version = (TextView) findViewById(R.id.version);
        version.setText("\nAPI: " + API[2]);

        releaseDate = (TextView) findViewById(R.id.releaseDate);
        releaseDate.setText("\nRelease Date: " + ReleaseDate[2]);
    }

    public void Donut(View view){
        Intent intent = new Intent(this, Display_Donut.class);
        startActivity(intent);
        finish();
    }

    public void Froyo(View view){
        Intent intent = new Intent(this, Display_Froyo.class);
        startActivity(intent);
        finish();
    }

    public void Home(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
