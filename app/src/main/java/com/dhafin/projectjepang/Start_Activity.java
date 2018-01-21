package com.dhafin.projectjepang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class Start_Activity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout start;
    public Intent svc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //layar fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_start);
        svc = new Intent(Start_Activity.this,BGMusikService.class);
        startService(svc);

        start = (LinearLayout)findViewById(R.id.LinearLayout1);
        start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.LinearLayout1:
                i = new Intent(Start_Activity.this, Pembukaan_Activity.class);
                startActivity(i);
                finish();
                break;
            default:
                break;
        }
    }
}
