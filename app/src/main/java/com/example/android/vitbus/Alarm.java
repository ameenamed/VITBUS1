package com.example.android.vitbus;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Vibrator;
import android.widget.Toast;

public class Alarm extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Alarm",Toast.LENGTH_LONG).show();
        Vibrator v=(Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);
        v.vibrate(5000);
        Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);
        Ringtone r = RingtoneManager.getRingtone(context, notification);
        r.play();

    }
}
