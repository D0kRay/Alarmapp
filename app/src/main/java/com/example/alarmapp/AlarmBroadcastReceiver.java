package com.example.alarmapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.widget.Toast;

public class AlarmBroadcastReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Die Zeit ist abgelaufen!", Toast.LENGTH_LONG).show();
        //Vibration
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        VibrationEffect vibe;
        vibe = VibrationEffect.createOneShot(1000, VibrationEffect.DEFAULT_AMPLITUDE);
        vibrator.vibrate(vibe);
    }
}
