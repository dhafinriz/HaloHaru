package com.dhafin.projectjepang;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by IGANOV on 1/16/2018.
 */

public class skor extends AppCompatActivity {

    TextView nilai;
    int res,total;
    MediaPlayer player2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.skor);

        Bundle extras = getIntent().getExtras();
        if(extras==null)
        {
            return;
        }
        res = extras.getInt("nilai");
        player2 = MediaPlayer.create(skor.this, R.raw.menang);
        player2.setLooping(false); // Set looping
        player2.start();
        total = (res*10)/7;
        nilai = (TextView)findViewById(R.id.nilai);
        nilai.setText(String.valueOf(total));
    }
}
