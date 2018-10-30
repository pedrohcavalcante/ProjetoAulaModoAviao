package com.example.androidbti.projetoaulamodoaviao;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    GolLinhasAereas golLinhasAereas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        golLinhasAereas = new GolLinhasAereas();

        IntentFilter latam = new IntentFilter();
        latam.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(golLinhasAereas, latam);

    }

    @Override
    protected void onDestroy() {
        if(golLinhasAereas != null){
            unregisterReceiver(golLinhasAereas);
        }
        super.onDestroy();
    }
}
