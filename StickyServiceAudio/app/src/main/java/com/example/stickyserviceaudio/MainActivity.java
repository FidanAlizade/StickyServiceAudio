package com.example.stickyserviceaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

public class MainActivity extends AppCompatActivity {
 MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void play(View view){
        Intent intent = new Intent(getApplicationContext(),StickyService.class);
        startService(intent);
//BU SADECE UYGULAMADAN TEMIZ CIXILANA QEDER CALISIR, AMA SERVICE SINIFI UYGULAMADAN TEMIZ CIXILDIQDA BELE STOPA BASMAYANA QEDER CALISIR
      /*
        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI);
        mediaPlayer.setLooping(true);//onu loopda caldirircak
        mediaPlayer.start();
       */
    }
    public void stop(View view){
       // mediaPlayer.stop();
        Intent intent = new Intent(getApplicationContext(),StickyService.class);
        stopService(intent);
    }
}