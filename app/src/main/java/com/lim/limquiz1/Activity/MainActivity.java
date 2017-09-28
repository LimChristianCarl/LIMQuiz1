package com.lim.limquiz1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.lim.limquiz1.Adapter.CustomAdapter;
import com.lim.limquiz1.Model.AndroidVersion;
import com.lim.limquiz1.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int[] logos;
    String[] AndroidVersions, api, versionNumber, releaseDate;
    ListView listView_AndroidVersions;
    CustomAdapter adapter;
    ArrayList<AndroidVersion> listAndroidVersions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AndroidVersions = getResources().getStringArray(R.array.AndroidVersions);
        api = getResources().getStringArray(R.array.API);
        versionNumber = getResources().getStringArray(R.array.VersionNumber);
        releaseDate = getResources().getStringArray(R.array.ReleaseDate);

        listView_AndroidVersions = (ListView) findViewById(R.id.list_AndroidVersions);
        listAndroidVersions = new ArrayList<AndroidVersion>();

        logos = new int[]{R.drawable.donut, R.drawable.froyo, R.drawable.oreo};

        for(int i = 0; i < AndroidVersions.length; i++){
            listAndroidVersions.add(new AndroidVersion(logos[i], AndroidVersions[i]));
        }

        adapter = new CustomAdapter(MainActivity.this, listAndroidVersions);
        listView_AndroidVersions.setAdapter(adapter);

        listView_AndroidVersions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(AndroidVersions[i].equalsIgnoreCase("Donut")) {
                    Intent intent = new Intent(listView_AndroidVersions.getContext(), Display_Donut.class);
                    listView_AndroidVersions.getContext().startActivity(intent);
                }
                if(AndroidVersions[i].equalsIgnoreCase("Froyo")) {
                    Intent intent = new Intent(listView_AndroidVersions.getContext(), Display_Froyo.class);
                    listView_AndroidVersions.getContext().startActivity(intent);
                }
                if(AndroidVersions[i].equalsIgnoreCase("Oreo")) {
                    Intent intent = new Intent(listView_AndroidVersions.getContext(), Display_Oreo.class);
                    listView_AndroidVersions.getContext().startActivity(intent);
                }
            }
        });
    }
    public void Donut(View view){
        Intent intent = new Intent(this, Display_Donut.class);
        startActivity(intent);
    }

    public void Froyo(View view){
        Intent intent = new Intent(this, Display_Froyo.class);
        startActivity(intent);
    }

    public void Oreo(View view){
        Intent intent = new Intent(this, Display_Oreo.class);
        startActivity(intent);
    }

    public void Home(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
