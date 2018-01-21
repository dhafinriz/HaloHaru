package com.dhafin.projectjepang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.ontbee.legacyforks.cn.pedant.SweetAlert.SweetAlertDialog;

public class kkettemp extends AppCompatActivity implements View.OnClickListener{

    TextView isi,judul;
    ImageView gambar, kiri,kanan;
    int cek=0;
    protected void setQuestion(){
        switch(cek)
        {
            case 0 :
                isi.setText(R.string.kketem1);
                break;
            case 1 :
                isi.setText(R.string.kketem2);
                break;
            case 2 :
                isi.setText(R.string.kketem3);
                break;
            case 3 :
                isi.setText(R.string.kketem4);
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
        setContentView(R.layout.activity_kkettemp);
        isi = (TextView)findViewById(R.id.isi5);

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
                if(cek>3)
                {
                    cek=3;
                }
                else{
                    setQuestion();
                }
                break;

            default:break;
        }
    }

    @Override
    public void onBackPressed() {
        new SweetAlertDialog(this,SweetAlertDialog.NORMAL_TYPE)
                .setTitleText("YEAAAYY")
        .setContentText("PENJELASAN MENGENAI POLA KALIMAT\nSUDAH SELESAI. WAKARIMASHITAKA?\n")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        finish();
                    }
                })
                .show();

}
}

