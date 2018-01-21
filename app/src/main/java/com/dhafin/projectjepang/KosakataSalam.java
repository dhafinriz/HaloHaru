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

public class KosakataSalam extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer sound;
    int idx = 0;

    TextView tHiragana, tJepang, tIndo;
    ImageView icon, next, prev, audio, menu;

    String[] textHiragana = {
            "おはようございます",
            "こんにちは",
            "こんばんは",
            "ありがとうございます",
            "どうぞよろしくおねがいします",
            "はじめまして"
    };

    String[] textJepang = {
            "(ohayou gozaimasu)",
            "(konnichiwa)",
            "(konbanwa)",
            "(arigatou gozaimasu)",
            "(Douzo yoroshiku onegaishimasu)",
            "(Hajimemashite)"
    };

    String[] textIndo = {
            "Selamat Pagi",
            "Selamat Siang",
            "Selamat Malam",
            "Terimakasih",
            "Senang Berkenalan Dengan Anda",
            "Perkenalkan"
    };

    protected void setWord(){
        tHiragana.setText(textHiragana[idx]);
        tJepang.setText(textJepang[idx]);
        tIndo.setText(textIndo[idx]);
    }

    protected void setImage() {
        switch (idx){
            case 0:
                icon.setImageResource(R.drawable.ohayou);
                break;
            case 1:
                icon.setImageResource(R.drawable.konnichiwa);
                break;
            case 2:
                icon.setImageResource(R.drawable.konbanwa);
                break;
            case 3:
                icon.setImageResource(R.drawable.haru_pembukaan2);
                break;
            case 4:
                icon.setImageResource(R.drawable.harut3);
                break;
            case 5:
                icon.setImageResource(R.drawable.hajimimashite);
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
                sound = MediaPlayer.create(KosakataSalam.this, R.raw.ohayou_gozaimasu);
                sound.start();
                break;
            case 1:
                sound = MediaPlayer.create(KosakataSalam.this, R.raw.konnichiwa);
                sound.start();
                break;
            case 2:
                sound = MediaPlayer.create(KosakataSalam.this, R.raw.konbanwa);
                sound.start();
                break;
            case 3:
                sound = MediaPlayer.create(KosakataSalam.this, R.raw.arigatou_gozaimasu);
                sound.start();
                break;
            case 4:
                sound = MediaPlayer.create(KosakataSalam.this, R.raw.douzo_yoroshiku);
                sound.start();
                break;
            case 5:
                sound = MediaPlayer.create(KosakataSalam.this, R.raw.hajimemashite);
                sound.start();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_kosakata_salam);

        tHiragana = (TextView)findViewById(R.id.tv_hiragana);
        tJepang = (TextView)findViewById(R.id.tv_jepang);
        tIndo = (TextView)findViewById(R.id.tv_indo);
        icon = (ImageView)findViewById(R.id.img_icon);
        menu = (ImageView)findViewById(R.id.nama_menu);

        menu.setImageResource(R.drawable.menu_salam);
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
                if(idx == 5){
                    idx = 0;
                }else{
                    idx++;
                }
                setWord();
                setImage();
                break;
            case R.id.btn_prev:
                if(idx == 0){
                    idx = 5;
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
