package com.dhafin.projectjepang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Created by Rifka on 16/01/2018.
 */

public class MenuUtama_Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView bvideo, bkosakata, bpolakalimat, bgames, btahukah, babout;
    public Intent svc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //layar fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_menu_utama);
        svc = new Intent(MenuUtama_Activity.this,BGMusikService.class);


        bvideo = (ImageView)findViewById(R.id.btn_video);
        bkosakata = (ImageView)findViewById(R.id.btn_kosakata);
        bpolakalimat = (ImageView)findViewById(R.id.btn_polakalimat);
        bgames = (ImageView)findViewById(R.id.btn_games);
        btahukah = (ImageView)findViewById(R.id.btn_tahukah);
        babout = (ImageView)findViewById(R.id.btn_about);

        bvideo.setOnClickListener(this);
        bkosakata.setOnClickListener(this);
        bpolakalimat.setOnClickListener(this);
        bgames.setOnClickListener(this);
        btahukah.setOnClickListener(this);
        babout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_video:
                i = new Intent(MenuUtama_Activity.this, opvid.class);
                startActivity(i);
                break;
            case R.id.btn_kosakata:
                i = new Intent(MenuUtama_Activity.this, MenuKosakata.class);
                startActivity(i);
                break;
            case R.id.btn_polakalimat:
                i = new Intent(MenuUtama_Activity.this, pola.class);
                startActivity(i);
                break;
            case R.id.btn_games:
                i = new Intent(MenuUtama_Activity.this, pembukaanGame.class);
                startActivity(i);
                break;
            case R.id.btn_tahukah:
                i = new Intent(MenuUtama_Activity.this, Tahukah_Kamu1.class);
                startActivity(i);
                break;
            case R.id.btn_about:
                i = new Intent(MenuUtama_Activity.this, aboutUs.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        stopService(svc);
    }
}