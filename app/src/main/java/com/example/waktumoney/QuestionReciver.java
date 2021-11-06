package com.example.waktumoney;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class QuestionReciver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        String state = intent.getExtras().getString("extra");
        int a  = intent.getIntExtra("Ring",0);


        Intent serviceIntent = new Intent(context, QuestionAskingService.class);

serviceIntent.putExtra("extra",state);
serviceIntent.putExtra("ring",a);
        context.startService(serviceIntent);
    }
}
