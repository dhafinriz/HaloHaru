package com.dhafin.projectjepang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by Rifka on 20/01/2018.
 */

public class MenuKosakata extends AppCompatActivity implements View.OnClickListener {

    Button bsalam, btempat_tinggal, btingkat_kelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //layar fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_menu_kosakata);

        bsalam = (Button)findViewById(R.id.btn_salam);
        btempat_tinggal = (Button)findViewById(R.id.btn_tempat_tinggal);
        btingkat_kelas = (Button)findViewById(R.id.btn_tingkat_kelas);

        bsalam.setOnClickListener(this);
        btempat_tinggal.setOnClickListener(this);
        btingkat_kelas.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_salam:
                i = new Intent(MenuKosakata.this, KosakataSalam.class);
                startActivity(i);
                break;
            case R.id.btn_tempat_tinggal:
                i = new Intent(MenuKosakata.this, KosakataTempatTinggal.class);
                startActivity(i);
                break;
            case R.id.btn_tingkat_kelas:
                i = new Intent(MenuKosakata.this, KosakataTingkatKelas.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
