package com.dhafin.projectjepang;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ontbee.legacyforks.cn.pedant.SweetAlert.SweetAlertDialog;

import java.util.ArrayList;
import java.util.Locale;


/**
 * Created by IGANOV on 1/18/2018.
 */

public class gameaudio extends Activity implements View.OnClickListener{

    String[] answerArray = {
            "こんばんは","ドイツ","こんにちは", "ジャカルタ","はじめまして"
    };
    int[] audio = {
            R.raw.konbanwa,R.raw.doitsu,R.raw.konnichiwa,R.raw.jakaruta,R.raw.hajimemashite
    };
    String temp;
    TextView answer;
    ImageView play,record,how,circle1,circle2,circle3,circle4,circle5,circle6,gambar;
    int cek=0,bener=0,suara;
    private MediaPlayer player2,player;
    private final int REQ_CODE_SPEECH_INPUT = 100;

    protected void setQuestion(){
        switch(cek)
        {
            case 0 :
                suara = audio[cek];
                gambar.setImageResource(R.drawable.konbanwa);
                circle1.setImageResource(R.drawable.circle_pink);
                break;
            case 1 :
                suara = audio[cek];
                gambar.setImageResource(R.drawable.doitsu);
                circle1.setImageResource(R.drawable.circle_pink);
                circle2.setImageResource(R.drawable.circle_pink);
                circle3.setImageResource(R.drawable.circle_pink);
                break;
            case 2 :
                suara = audio[cek];
                gambar.setImageResource(R.drawable.konnichiwa);
                circle1.setImageResource(R.drawable.circle_pink);
                circle2.setImageResource(R.drawable.circle_pink);
                circle3.setImageResource(R.drawable.circle_pink);
                circle4.setImageResource(R.drawable.circle_pink);
                break;
            case 3 :
                suara = audio[cek];
                gambar.setImageResource(R.drawable.jakaruta);
                circle1.setImageResource(R.drawable.circle_pink);
                circle2.setImageResource(R.drawable.circle_pink);
                circle3.setImageResource(R.drawable.circle_pink);
                circle4.setImageResource(R.drawable.circle_pink);
                circle5.setImageResource(R.drawable.circle_pink);
                break;
            case 4 :
                suara = audio[cek];
                gambar.setImageResource(R.drawable.hajimimashite2);
                circle1.setImageResource(R.drawable.circle_pink);
                circle2.setImageResource(R.drawable.circle_pink);
                circle3.setImageResource(R.drawable.circle_pink);
                circle4.setImageResource(R.drawable.circle_pink);
                circle5.setImageResource(R.drawable.circle_pink);
                circle6.setImageResource(R.drawable.circle_pink);
                break;
            default:
                break;
        }
    }

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.gameaudio);

        new SweetAlertDialog(this)
                .setTitleText("Dengarkan audio , lalu rekam!")
                .show();

        record = (ImageView)findViewById(R.id.record);
        play = (ImageView)findViewById(R.id.play);
        how = (ImageView)findViewById(R.id.howto);
        gambar = (ImageView)findViewById(R.id.gambar);

        circle1 = (ImageView)findViewById(R.id.circle1);
        circle2 = (ImageView)findViewById(R.id.circle2);
        circle3 = (ImageView)findViewById(R.id.circle3);
        circle4 = (ImageView)findViewById(R.id.circle4);
        circle5 = (ImageView)findViewById(R.id.circle5);
        circle6 = (ImageView)findViewById(R.id.circle6);

        setQuestion();

        record.setOnClickListener(this);
        play.setOnClickListener(this);
        how.setOnClickListener(this);
    }

    protected void trueAnswer()
    {
        new SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("benar!")
                .setContentText("Kalimat yang Anda katakan : " +temp)
                .show();

        player2 = MediaPlayer.create(gameaudio.this, R.raw.soundcorrect);
        player2.setLooping(false); // Set looping
        player2.start();
        cek++;
        if(cek>4){
            cek=0;
            Intent i = new Intent(gameaudio.this,skor.class);
            i.putExtra("nilai",bener);
            startActivity(i);
            finish();
        }else
        {
            setQuestion();
        }

    }
    protected void falseAnswer(){
        new SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Salah")
                .setContentText("Kalimat yang Anda katakan : " +temp+"\nSilahkan ulangi kembali!")
                .show();

        player2 = MediaPlayer.create(gameaudio.this, R.raw.soundincorrect);
        player2.setLooping(false); // Set looping
        player2.start();

    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.howto :
                new SweetAlertDialog(this)
                        .setContentText("Dengarkan audio , lalu rekam!")
                        .show();
            case R.id.record : inputSpeechDialog();
                break;
            case R.id.play :
                record.setEnabled(false);
                player = MediaPlayer.create(gameaudio.this, suara);
                player.setLooping(false); // Set looping
                player.start();
                record.setEnabled(true);
                play.setImageResource(R.drawable.btn_pause_red);
                play.setEnabled(false);
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        play.setImageResource(R.drawable.btn_speaker_red);
                        play.setEnabled(true);
                    }
                });
                break;
            default:break;
        }
    }



    private void inputSpeechDialog(){
        Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, Locale.JAPANESE);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.JAPANESE);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ja-JP");
        i.putExtra(RecognizerIntent.EXTRA_PROMPT,"Katakan seperti yang Haru katakan!");
        try{
            startActivityForResult(i,REQ_CODE_SPEECH_INPUT);
        }catch(ActivityNotFoundException a)
        {
            Toast.makeText(getApplicationContext(),"Device Anda tidak mendukung fitur ini",Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);

        switch (requestCode)
        {
            case REQ_CODE_SPEECH_INPUT : {
                if(resultCode == RESULT_OK && null != data){
                    ArrayList<String> hasil2=data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    temp = hasil2.get(0);
                    record.setEnabled(false);
                    if(temp.equals(answerArray[cek])){
                        trueAnswer();
                    }
                    else
                    {
                        falseAnswer();
                    }
                }
            }
            break;
        }
    }

    public void onBackPressed() {
        Context c= this;
        AlertDialog.Builder alert = new AlertDialog.Builder(c);
        alert.setMessage("Apakah Anda yakin untuk meninggalkan Quiz?");
        alert.setCancelable(false);
        alert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        });

        alert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        alert.show();
    }
}

