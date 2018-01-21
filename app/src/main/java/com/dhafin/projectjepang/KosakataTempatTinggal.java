package com.dhafin.projectjepang;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Rifka on 20/01/2018.
 */

public class KosakataTempatTinggal extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer sound;
    int idx = 0;

    TextView tHiragana, tJepang, tIndo;
    ImageView icon, next, prev, audio, menu;

    String[] textHiragana = {
            "ジャカルタ",
            "バンドン",
            "スラバヤ",
            "パダン",
            "ロンドン",
            "ニュヨック",
            "インドネシア",
            "ドイツ",
            "フランス",
            "イタリア"
    };

    String[] textJepang = {
            "(JAKARUTA)",
            "(BANDON)",
            "(SURABAYA)",
            "(PADANG)",
            "(RONDON)",
            "(NYUYOKKU)",
            "(INDONESHIA)",
            "(DOITSU)",
            "(FURANSU)",
            "(ITARIA)"
    };

    String[] textIndo = {
            "JAKARTA",
            "BANDUNG",
            "SURABAYA",
            "PADANG",
            "LONDON",
            "NEW YORK",
            "INDONESIA",
            "JERMAN",
            "PRANCIS",
            "ITALIA"
    };

    protected void setWord(){
        tHiragana.setText(textHiragana[idx]);
        tJepang.setText(textJepang[idx]);
        tIndo.setText(textIndo[idx]);
    }

    protected void setImage() {
        switch (idx){
            case 0:
                icon.setImageResource(R.drawable.jakarta);
                break;
            case 1:
                icon.setImageResource(R.drawable.bandon);
                break;
            case 2:
                icon.setImageResource(R.drawable.surabaya);
                break;
            case 3:
                icon.setImageResource(R.drawable.padang);
                break;
            case 4:
                icon.setImageResource(R.drawable.rondon);
                break;
            case 5:
                icon.setImageResource(R.drawable.new_york);
                break;
            case 6:
                icon.setImageResource(R.drawable.indo);
                break;
            case 7:
                icon.setImageResource(R.drawable.germany);
                break;
            case 8:
                icon.setImageResource(R.drawable.prancis);
                break;
            case 9:
                icon.setImageResource(R.drawable.italy);
                break;
            default:
                break;
        }
    }

    protected void playSound(){
        if(sound != null){
            sound.stop();
        }
        switch (idx){
            case 0:
                sound = MediaPlayer.create(KosakataTempatTinggal.this, R.raw.jakaruta);
                sound.start();
                break;
            case 1:
                sound = MediaPlayer.create(KosakataTempatTinggal.this, R.raw.bandon);
                sound.start();
                break;
            case 2:
                sound = MediaPlayer.create(KosakataTempatTinggal.this, R.raw.surabaya);
                sound.start();
                break;
            case 3:
                sound = MediaPlayer.create(KosakataTempatTinggal.this, R.raw.padang);
                sound.start();
                break;
            case 4:
                sound = MediaPlayer.create(KosakataTempatTinggal.this, R.raw.london);
                sound.start();
                break;
            case 5:
                sound = MediaPlayer.create(KosakataTempatTinggal.this, R.raw.new_york);
                sound.start();
                break;
            case 6:
                sound = MediaPlayer.create(KosakataTempatTinggal.this, R.raw.indonesia);
                sound.start();
                break;
            case 7:
                sound = MediaPlayer.create(KosakataTempatTinggal.this, R.raw.doitsu);
                sound.start();
                break;
            case 8:
                sound = MediaPlayer.create(KosakataTempatTinggal.this, R.raw.furansu);
                sound.start();
                break;
            case 9:
                sound = MediaPlayer.create(KosakataTempatTinggal.this, R.raw.itaria);
                sound.start();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //layar fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_kosakata_salam);

        tHiragana = (TextView)findViewById(R.id.tv_hiragana);
        tJepang = (TextView)findViewById(R.id.tv_jepang);
        tIndo = (TextView)findViewById(R.id.tv_indo);
        icon = (ImageView)findViewById(R.id.img_icon);
        menu = (ImageView)findViewById(R.id.nama_menu);

        menu.setImageResource(R.drawable.menu_tempat_tinggal);
        setWord();
        setImage();

        //button
        next = (ImageView)findViewById(R.id.btn_next);
        prev = (ImageView)findViewById(R.id.btn_prev);
        audio = (ImageView)findViewById(R.id.btn_audio);

        next.setOnClickListener(this);
        prev.setOnClickListener(this);
        audio.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_next:
                if(idx == 9){
                    idx = 0;
                }else{
                    idx++;
                }
                setWord();
                setImage();
                break;
            case R.id.btn_prev:
                if(idx == 0){
                    idx = 9;
                }else {
                    idx--;
                }
                setWord();
                setImage();
                break;
            case R.id.btn_audio:
                playSound();
                break;
            default:
                break;
        }
    }
}
