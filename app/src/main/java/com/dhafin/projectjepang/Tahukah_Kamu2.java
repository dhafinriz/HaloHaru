package com.dhafin.projectjepang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by IGANOV on 1/18/2018.
 */

public class Tahukah_Kamu2 extends AppCompatActivity implements View.OnClickListener{


    TextView isi,judul;
    ImageView gambar, kiri,kanan;
    int cek=0;

    protected void setQuestion(){
        switch(cek)
        {
            case 0 :
                judul.setText(R.string.judul1);
                gambar.setImageResource(R.drawable.harut1);
                isi.setText(R.string.tahukahkamu2);
                break;
            case 1 :
                judul.setText(R.string.judul2);
                gambar.setImageResource(R.drawable.harut2);
                isi.setText(R.string.tahukahkamu3);
                break;
            case 2 :
                judul.setText(R.string.judul3);
                gambar.setImageResource(R.drawable.harut3);
                isi.setText(R.string.tahukahkamu4);
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
        setContentView(R.layout.tahukahkamu2);


        judul = (TextView)findViewById(R.id.judul);
        isi = (TextView)findViewById(R.id.isi);
        gambar = (ImageView)findViewById(R.id.gambarharu);

        kiri = (ImageView) findViewById(R.id.kiri);
        kanan = (ImageView) findViewById(R.id.kanan);
        setQuestion();

        kiri.setOnClickListener(this);
        kanan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.kiri :
                cek--;
                if(cek<0)
                {
                    cek=0;
                }
                else{
                    setQuestion();
                }

                break;
            case R.id.kanan:
                cek++;
                if(cek>2)
                {
                    cek=2;
                }
                else{
                    setQuestion();
                }
                break;

            default:break;
        }
    }
}
