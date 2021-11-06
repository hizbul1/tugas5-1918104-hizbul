package com.example.waktumoney;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AlaramOffActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alaram_off);
        Button button = findViewById(R.id.offalaram);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(RingtonePlayingService.mMediaPlayer == null)) {
                    RingtonePlayingService.mMediaPlayer.stop();
                    RingtonePlayingService.mMediaPlayer.reset();
                    Toast.makeText(getApplicationContext(), "Ring Off", Toast.LENGTH_SHORT).show();

                    finish();

                }
            }
        });
    }
}