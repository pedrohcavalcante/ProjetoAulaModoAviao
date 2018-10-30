package com.example.androidbti.projetoaulamodoaviao;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class GolLinhasAereas extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getBooleanExtra("state", false)){
            Toast.makeText(context, "MODO AVIAO LIGADO", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "MODO AVIAO DESLIGADO", Toast.LENGTH_SHORT).show();
        }
    }
}
