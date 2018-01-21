package com.dhafin.projectjepang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class penjvid extends AppCompatActivity implements View.OnClickListener{
    TextView isi,judul;
    ImageView gambar, kiri,kanan;
    int cek=0;

    protected void setQuestion(){
        switch(cek)
        {
            case 0 :
                isi.setText(R.string.pen1);
                break;
            case 1 :
                isi.setText(R.string.pen2);
                break;
            case 2 :
                isi.setText(R.string.pen3);
                break;
            case 3 :
                isi.setText(R.string.pen4);
                break;
            case 4 :
                isi.setText(R.string.pen5);
                break;
            case 5 :
                isi.setText(R.string.pen6);
                break;
            case 6 :
                isi.setText(R.string.pen7);
                break;
            default:
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_penjvid);
        isi = (TextView)findViewById(R.id.isi1);

        kiri = (ImageView) findViewById(R.id.kiri);
        kanan = (ImageView) findViewById(R.id.kanan);
        setQuestion();

        kiri.setOnClickListener(this);
        kanan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
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
                if(cek>6)
                {
                    cek=6;
                }
                else{
                    setQuestion();
                }
                break;

            default:break;
        }
    }
}
