package com.dhafin.projectjepang;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ontbee.legacyforks.cn.pedant.SweetAlert.SweetAlertDialog;


/**
 * Created by IGANOV on 1/14/2018.
 */

public class gamepg extends AppCompatActivity implements View.OnClickListener {
        String[] niceArray = {
                "A","B","A","B","B","A","A"
        };

        TextView question,noQuiz;
        ImageView gambar;
        int cek=0,bener=0;
        String temp;
        Button btnA,btnB;
        MediaPlayer player2;


        protected void setQuestion(){
            switch(cek)
            {
                case 0 :
                    noQuiz.setText("Quiz 1");
                    question.setVisibility(View.INVISIBLE);
                    gambar.setImageResource(R.drawable.ohayou);
                    btnA.setText(R.string.satua);
                    btnB.setText(R.string.satub);
                    break;
                case 1 :
                    noQuiz.setText("Quiz 2");
                    question.setVisibility(View.INVISIBLE);
                    gambar.setImageResource(R.drawable.hajimimashite);
                    btnA.setText(R.string.duaa);
                    btnB.setText(R.string.duab);
                    break;
                case 2 :
                    noQuiz.setText("Quiz 3");
                    gambar.getLayoutParams().height=10;
                    gambar.getLayoutParams().width=10;
                    gambar.setVisibility(View.INVISIBLE);
                    question.setVisibility(View.VISIBLE);
                    question.setText(R.string.pertanyaan1);
                    btnA.setText(R.string.tigaa);
                    btnB.setText(R.string.tigab);
                    break;
                case 3 :
                    noQuiz.setText("Quiz 4");
                    question.setText(R.string.pertanyaan2);
                    gambar.setVisibility(View.INVISIBLE);
                    btnA.setText(R.string.empata);
                    btnB.setText(R.string.empatb);
                    break;
                case 4 :
                    noQuiz.setText("Quiz 5");
                    question.setText(R.string.pertanyaan3);
                    gambar.setVisibility(View.INVISIBLE);
                    btnA.setText(R.string.limaa);
                    btnB.setText(R.string.limab);
                    break;
                case 5 :
                    noQuiz.setText("Quiz 6");
                    question.setText(R.string.pertanyaan4);
                    gambar.setVisibility(View.INVISIBLE);
                    btnA.setText(R.string.enama);
                    btnB.setText(R.string.enamb);
                    break;
                case 6 :
                    noQuiz.setText("Quiz 7");
                    question.setText(R.string.pertanyaan5);
                    gambar.setVisibility(View.INVISIBLE);
                    btnA.setText(R.string.tujuha);
                    btnB.setText(R.string.tujuhb);
                    break;
                default:
                    break;
            }
        }


        protected void trueAnswer()
        {
            bener+=10;
            player2 = MediaPlayer.create(gamepg.this, R.raw.soundcorrect);
            player2.setLooping(false); // Set looping
            player2.start();
        }
        protected void falseAnswer()
        {
            bener+=0;
            player2 = MediaPlayer.create(gamepg.this, R.raw.soundincorrect);
            player2.setLooping(false); // Set looping
            player2.start();
        }
        protected void checkAnswer(){
            if(temp.equals(niceArray[cek]))
            {
                trueAnswer();
            }else{
                temp="";
                falseAnswer();
            }
        }
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.gamepg);

            new SweetAlertDialog(this)
                    .setTitleText("Pilihlah jawaban yang benar!")
                    .show();
            noQuiz = (TextView)findViewById(R.id.noQuiz);
            question = (TextView)findViewById(R.id.question);
            gambar = (ImageView)findViewById(R.id.gambar);

            btnA = (Button)findViewById(R.id.btnA);
            btnB = (Button)findViewById(R.id.btnB);
            setQuestion();

            btnA.setOnClickListener(this);
            btnB.setOnClickListener(this);
        }

        @Override
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnA :
                    temp ="A";
                    checkAnswer();

                    cek++;

                    if(cek>6){
                        cek=0;
                        Intent intent = new Intent(this,skor.class);
                        intent.putExtra("nilai",bener);
                        startActivity(intent);
                        finish();
                    }else
                    {
                        setQuestion();
                    }
                    break;
                case R.id.btnB:
                    temp = "B";
                    checkAnswer();
                    cek++;

                    if(cek>6){
                        cek=0;
                        Intent intent = new Intent(this,skor.class);
                        intent.putExtra("nilai",bener);
                        startActivity(intent);
                        finish();
                    }else
                    {
                        setQuestion();
                    }
                    break;

                default:break;
            }
        }

        public void onBackPressed() {
            super.onBackPressed();
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
