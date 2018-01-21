package com.dhafin.projectjepang;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.wajahatkarim3.easyflipview.EasyFlipView;

/**
 * Created by Rifka on 20/01/2018.
 */

public class KosakataTingkatKelas extends AppCompatActivity  {

    MediaPlayer sound;
    int idx = 0;

    EasyFlipView satu,dua,tiga,empat,lima,enam,tujuh,delapan,sembilan,sepuluh,sebelas,duabelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //layar fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_kosakata_tingkat_kelas);
        final EasyFlipView satu = (EasyFlipView) findViewById(R.id.satu);
        final EasyFlipView dua = (EasyFlipView) findViewById(R.id.dua);
        final EasyFlipView tiga = (EasyFlipView) findViewById(R.id.tiga);
        final EasyFlipView empat = (EasyFlipView) findViewById(R.id.empat);
        final EasyFlipView lima = (EasyFlipView) findViewById(R.id.lima);
        final EasyFlipView enam = (EasyFlipView) findViewById(R.id.enam);
        final EasyFlipView tujuh = (EasyFlipView) findViewById(R.id.tujuh);
        final EasyFlipView delapan = (EasyFlipView) findViewById(R.id.delapan);
        final EasyFlipView sembilan = (EasyFlipView) findViewById(R.id.sembilan);
        final EasyFlipView sepuluh = (EasyFlipView) findViewById(R.id.sepuluh);
        final EasyFlipView sebelas = (EasyFlipView) findViewById(R.id.sebelas);
        final EasyFlipView duabelas = (EasyFlipView) findViewById(R.id.duabelas);

        satu.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide) {
                if (satu.isBackSide() == true) {
                    sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.satu);
                    sound.start();
                    satu.setFlipEnabled(false);
                    dua.setFlipEnabled(false);
                    tiga.setFlipEnabled(false);
                    empat.setFlipEnabled(false);
                    lima.setFlipEnabled(false);
                    enam.setFlipEnabled(false);
                    tujuh.setFlipEnabled(false);
                    delapan.setFlipEnabled(false);
                    sembilan.setFlipEnabled(false);
                    sepuluh.setFlipEnabled(false);
                    sebelas.setFlipEnabled(false);
                    duabelas.setFlipEnabled(false);
                    sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            satu.setFlipEnabled(true);
                            dua.setFlipEnabled(true);
                            tiga.setFlipEnabled(true);
                            empat.setFlipEnabled(true);
                            lima.setFlipEnabled(true);
                            enam.setFlipEnabled(true);
                            tujuh.setFlipEnabled(true);
                            delapan.setFlipEnabled(true);
                            sembilan.setFlipEnabled(true);
                            sepuluh.setFlipEnabled(true);
                            sebelas.setFlipEnabled(true);
                            duabelas.setFlipEnabled(true);
                        }
                    });
                }

            }
        });
        dua.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide) {
                if (dua.isBackSide() == true) {
                    sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.dua);
                    sound.start();
                    satu.setFlipEnabled(false);
                    dua.setFlipEnabled(false);
                    tiga.setFlipEnabled(false);
                    empat.setFlipEnabled(false);
                    lima.setFlipEnabled(false);
                    enam.setFlipEnabled(false);
                    tujuh.setFlipEnabled(false);
                    delapan.setFlipEnabled(false);
                    sembilan.setFlipEnabled(false);
                    sepuluh.setFlipEnabled(false);
                    sebelas.setFlipEnabled(false);
                    duabelas.setFlipEnabled(false);
                    sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            satu.setFlipEnabled(true);
                            dua.setFlipEnabled(true);
                            tiga.setFlipEnabled(true);
                            empat.setFlipEnabled(true);
                            lima.setFlipEnabled(true);
                            enam.setFlipEnabled(true);
                            tujuh.setFlipEnabled(true);
                            delapan.setFlipEnabled(true);
                            sembilan.setFlipEnabled(true);
                            sepuluh.setFlipEnabled(true);
                            sebelas.setFlipEnabled(true);
                            duabelas.setFlipEnabled(true);
                        }
                    });
                }

            }
        });
        tiga.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide) {
                if (tiga.isBackSide() == true) {
                    sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.tiga);
                    sound.start();
                    satu.setFlipEnabled(false);
                    dua.setFlipEnabled(false);
                    tiga.setFlipEnabled(false);
                    empat.setFlipEnabled(false);
                    lima.setFlipEnabled(false);
                    enam.setFlipEnabled(false);
                    tujuh.setFlipEnabled(false);
                    delapan.setFlipEnabled(false);
                    sembilan.setFlipEnabled(false);
                    sepuluh.setFlipEnabled(false);
                    sebelas.setFlipEnabled(false);
                    duabelas.setFlipEnabled(false);
                    sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            satu.setFlipEnabled(true);
                            dua.setFlipEnabled(true);
                            tiga.setFlipEnabled(true);
                            empat.setFlipEnabled(true);
                            lima.setFlipEnabled(true);
                            enam.setFlipEnabled(true);
                            tujuh.setFlipEnabled(true);
                            delapan.setFlipEnabled(true);
                            sembilan.setFlipEnabled(true);
                            sepuluh.setFlipEnabled(true);
                            sebelas.setFlipEnabled(true);
                            duabelas.setFlipEnabled(true);
                        }
                    });
                }

            }
        });
        empat.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide) {
                if (empat.isBackSide() == true) {
                    sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.empat);
                    sound.start();
                    satu.setFlipEnabled(false);
                    dua.setFlipEnabled(false);
                    tiga.setFlipEnabled(false);
                    empat.setFlipEnabled(false);
                    lima.setFlipEnabled(false);
                    enam.setFlipEnabled(false);
                    tujuh.setFlipEnabled(false);
                    delapan.setFlipEnabled(false);
                    sembilan.setFlipEnabled(false);
                    sepuluh.setFlipEnabled(false);
                    sebelas.setFlipEnabled(false);
                    duabelas.setFlipEnabled(false);
                    sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            satu.setFlipEnabled(true);
                            dua.setFlipEnabled(true);
                            tiga.setFlipEnabled(true);
                            empat.setFlipEnabled(true);
                            lima.setFlipEnabled(true);
                            enam.setFlipEnabled(true);
                            tujuh.setFlipEnabled(true);
                            delapan.setFlipEnabled(true);
                            sembilan.setFlipEnabled(true);
                            sepuluh.setFlipEnabled(true);
                            sebelas.setFlipEnabled(true);
                            duabelas.setFlipEnabled(true);
                        }
                    });
                }

            }
        });
        lima.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide) {
                if (lima.isBackSide() == true) {
                    sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.lima);
                    sound.start();
                    satu.setFlipEnabled(false);
                    dua.setFlipEnabled(false);
                    tiga.setFlipEnabled(false);
                    empat.setFlipEnabled(false);
                    lima.setFlipEnabled(false);
                    enam.setFlipEnabled(false);
                    tujuh.setFlipEnabled(false);
                    delapan.setFlipEnabled(false);
                    sembilan.setFlipEnabled(false);
                    sepuluh.setFlipEnabled(false);
                    sebelas.setFlipEnabled(false);
                    duabelas.setFlipEnabled(false);
                    sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            satu.setFlipEnabled(true);
                            dua.setFlipEnabled(true);
                            tiga.setFlipEnabled(true);
                            empat.setFlipEnabled(true);
                            lima.setFlipEnabled(true);
                            enam.setFlipEnabled(true);
                            tujuh.setFlipEnabled(true);
                            delapan.setFlipEnabled(true);
                            sembilan.setFlipEnabled(true);
                            sepuluh.setFlipEnabled(true);
                            sebelas.setFlipEnabled(true);
                            duabelas.setFlipEnabled(true);
                        }
                    });
                }

            }
        });
        enam.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide) {
                if (enam.isBackSide() == true) {
                    sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.enam);
                    sound.start();
                    satu.setFlipEnabled(false);
                    dua.setFlipEnabled(false);
                    tiga.setFlipEnabled(false);
                    empat.setFlipEnabled(false);
                    lima.setFlipEnabled(false);
                    enam.setFlipEnabled(false);
                    tujuh.setFlipEnabled(false);
                    delapan.setFlipEnabled(false);
                    sembilan.setFlipEnabled(false);
                    sepuluh.setFlipEnabled(false);
                    sebelas.setFlipEnabled(false);
                    duabelas.setFlipEnabled(false);
                    sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            satu.setFlipEnabled(true);
                            dua.setFlipEnabled(true);
                            tiga.setFlipEnabled(true);
                            empat.setFlipEnabled(true);
                            lima.setFlipEnabled(true);
                            enam.setFlipEnabled(true);
                            tujuh.setFlipEnabled(true);
                            delapan.setFlipEnabled(true);
                            sembilan.setFlipEnabled(true);
                            sepuluh.setFlipEnabled(true);
                            sebelas.setFlipEnabled(true);
                            duabelas.setFlipEnabled(true);
                        }
                    });
                }

            }
        });
        tujuh.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide) {
                if (tujuh.isBackSide() == true) {
                    sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.tujuh);
                    sound.start();
                    satu.setFlipEnabled(false);
                    dua.setFlipEnabled(false);
                    tiga.setFlipEnabled(false);
                    empat.setFlipEnabled(false);
                    lima.setFlipEnabled(false);
                    enam.setFlipEnabled(false);
                    tujuh.setFlipEnabled(false);
                    delapan.setFlipEnabled(false);
                    sembilan.setFlipEnabled(false);
                    sepuluh.setFlipEnabled(false);
                    sebelas.setFlipEnabled(false);
                    duabelas.setFlipEnabled(false);
                    sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            satu.setFlipEnabled(true);
                            dua.setFlipEnabled(true);
                            tiga.setFlipEnabled(true);
                            empat.setFlipEnabled(true);
                            lima.setFlipEnabled(true);
                            enam.setFlipEnabled(true);
                            tujuh.setFlipEnabled(true);
                            delapan.setFlipEnabled(true);
                            sembilan.setFlipEnabled(true);
                            sepuluh.setFlipEnabled(true);
                            sebelas.setFlipEnabled(true);
                            duabelas.setFlipEnabled(true);
                        }
                    });
                }

            }
        });
       delapan.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide) {
                if (delapan.isBackSide() == true) {
                    sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.delapan);
                    sound.start();
                    satu.setFlipEnabled(false);
                    dua.setFlipEnabled(false);
                    tiga.setFlipEnabled(false);
                    empat.setFlipEnabled(false);
                    lima.setFlipEnabled(false);
                    enam.setFlipEnabled(false);
                    tujuh.setFlipEnabled(false);
                    delapan.setFlipEnabled(false);
                    sembilan.setFlipEnabled(false);
                    sepuluh.setFlipEnabled(false);
                    sebelas.setFlipEnabled(false);
                    duabelas.setFlipEnabled(false);
                    sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            satu.setFlipEnabled(true);
                            dua.setFlipEnabled(true);
                            tiga.setFlipEnabled(true);
                            empat.setFlipEnabled(true);
                            lima.setFlipEnabled(true);
                            enam.setFlipEnabled(true);
                            tujuh.setFlipEnabled(true);
                            delapan.setFlipEnabled(true);
                            sembilan.setFlipEnabled(true);
                            sepuluh.setFlipEnabled(true);
                            sebelas.setFlipEnabled(true);
                            duabelas.setFlipEnabled(true);
                        }
                    });
                }

            }
        });
        sembilan.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide) {
                if (sembilan.isBackSide() == true) {
                    sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.sembilan);
                    sound.start();
                    satu.setFlipEnabled(false);
                    dua.setFlipEnabled(false);
                    tiga.setFlipEnabled(false);
                    empat.setFlipEnabled(false);
                    lima.setFlipEnabled(false);
                    enam.setFlipEnabled(false);
                    tujuh.setFlipEnabled(false);
                    delapan.setFlipEnabled(false);
                    sembilan.setFlipEnabled(false);
                    sepuluh.setFlipEnabled(false);
                    sebelas.setFlipEnabled(false);
                    duabelas.setFlipEnabled(false);
                    sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            satu.setFlipEnabled(true);
                            dua.setFlipEnabled(true);
                            tiga.setFlipEnabled(true);
                            empat.setFlipEnabled(true);
                            lima.setFlipEnabled(true);
                            enam.setFlipEnabled(true);
                            tujuh.setFlipEnabled(true);
                            delapan.setFlipEnabled(true);
                            sembilan.setFlipEnabled(true);
                            sepuluh.setFlipEnabled(true);
                            sebelas.setFlipEnabled(true);
                            duabelas.setFlipEnabled(true);
                        }
                    });
                }

            }
        });
        sepuluh.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide) {
                if (sepuluh.isBackSide() == true) {
                    sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.sepuluh);
                    sound.start();
                    satu.setFlipEnabled(false);
                    dua.setFlipEnabled(false);
                    tiga.setFlipEnabled(false);
                    empat.setFlipEnabled(false);
                    lima.setFlipEnabled(false);
                    enam.setFlipEnabled(false);
                    tujuh.setFlipEnabled(false);
                    delapan.setFlipEnabled(false);
                    sembilan.setFlipEnabled(false);
                    sepuluh.setFlipEnabled(false);
                    sebelas.setFlipEnabled(false);
                    duabelas.setFlipEnabled(false);
                    sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            satu.setFlipEnabled(true);
                            dua.setFlipEnabled(true);
                            tiga.setFlipEnabled(true);
                            empat.setFlipEnabled(true);
                            lima.setFlipEnabled(true);
                            enam.setFlipEnabled(true);
                            tujuh.setFlipEnabled(true);
                            delapan.setFlipEnabled(true);
                            sembilan.setFlipEnabled(true);
                            sepuluh.setFlipEnabled(true);
                            sebelas.setFlipEnabled(true);
                            duabelas.setFlipEnabled(true);
                        }
                    });
                }

            }
        });
        sebelas.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide) {
                if (sebelas.isBackSide() == true) {
                    sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.sebelas);
                    sound.start();
                    satu.setFlipEnabled(false);
                    dua.setFlipEnabled(false);
                    tiga.setFlipEnabled(false);
                    empat.setFlipEnabled(false);
                    lima.setFlipEnabled(false);
                    enam.setFlipEnabled(false);
                    tujuh.setFlipEnabled(false);
                    delapan.setFlipEnabled(false);
                    sembilan.setFlipEnabled(false);
                    sepuluh.setFlipEnabled(false);
                    sebelas.setFlipEnabled(false);
                    duabelas.setFlipEnabled(false);
                    sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            satu.setFlipEnabled(true);
                            dua.setFlipEnabled(true);
                            tiga.setFlipEnabled(true);
                            empat.setFlipEnabled(true);
                            lima.setFlipEnabled(true);
                            enam.setFlipEnabled(true);
                            tujuh.setFlipEnabled(true);
                            delapan.setFlipEnabled(true);
                            sembilan.setFlipEnabled(true);
                            sepuluh.setFlipEnabled(true);
                            sebelas.setFlipEnabled(true);
                            duabelas.setFlipEnabled(true);
                        }
                    });
                }

            }
        });
        duabelas.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide) {
                if (duabelas.isBackSide() == true) {
                    sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.duabelas);
                    sound.start();
                    satu.setFlipEnabled(false);
                    dua.setFlipEnabled(false);
                    tiga.setFlipEnabled(false);
                    empat.setFlipEnabled(false);
                    lima.setFlipEnabled(false);
                    enam.setFlipEnabled(false);
                    tujuh.setFlipEnabled(false);
                    delapan.setFlipEnabled(false);
                    sembilan.setFlipEnabled(false);
                    sepuluh.setFlipEnabled(false);
                    sebelas.setFlipEnabled(false);
                    duabelas.setFlipEnabled(false);
                    sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            satu.setFlipEnabled(true);
                            dua.setFlipEnabled(true);
                            tiga.setFlipEnabled(true);
                            empat.setFlipEnabled(true);
                            lima.setFlipEnabled(true);
                            enam.setFlipEnabled(true);
                            tujuh.setFlipEnabled(true);
                            delapan.setFlipEnabled(true);
                            sembilan.setFlipEnabled(true);
                            sepuluh.setFlipEnabled(true);
                            sebelas.setFlipEnabled(true);
                            duabelas.setFlipEnabled(true);
                        }
                    });
                }

            }
        });

    }

    }