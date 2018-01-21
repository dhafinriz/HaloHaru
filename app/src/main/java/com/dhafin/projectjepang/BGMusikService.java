package com.dhafin.projectjepang;

import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.v7.app.AlertDialog;

public class BGMusikService extends Service {
    int maxVolume = 7;
    private static MediaPlayer mp;
    @Override
    public IBinder onBind(Intent i) {
        return null;
    }
    @Override
    public void onCreate() {
        super.onCreate();

        setMp(MediaPlayer.create(this, R.raw.bgmusik));
        getMp().setLooping(true);
        float log1=(float)(Math.log(maxVolume-1)/Math.log(maxVolume));
        getMp().setVolume(1-log1,1-log1);
    }
    public int onStartCommand(Intent i, int flag, int startId) {
        getMp().start();
        return 1;
    }
    public IBinder onUnBind(Intent i) {
        return null;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        getMp().stop();
        getMp().release();
    }


    public static MediaPlayer getMp() {
        return mp;
    }
    public static void setMp(MediaPlayer mp) {
        BGMusikService.mp = mp;
    }


}