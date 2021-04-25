package com.whitehouse.frengkyabs.depokresto;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.media.audiofx.BassBoost;
import android.provider.Settings;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Home extends AppCompatActivity implements View.OnClickListener{
    ImageButton res1;
    ImageButton info;
    ImageButton ext;
    ViewFlipper viewFlipper;
    MediaPlayer sound;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("I WANT EAT");


        viewFlipper = (ViewFlipper) this.findViewById(R.id.vf);
        ImageButton res1 = (ImageButton)findViewById(R.id.res1);
        ImageButton info = (ImageButton) findViewById(R.id.info);
        ImageButton ext = (ImageButton)findViewById(R.id.ext);

        viewFlipper.startFlipping();
        res1.setOnClickListener(this);
        info.setOnClickListener(this);
        ext.setOnClickListener(this);

        sound = MediaPlayer.create(this, R.raw.b);
        sound.setLooping(true);
        sound.setVolume(1,1);
        sound.start();
    }

    private void setContentView(int activity_home) {
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.res1:
                Intent move = new Intent(this, Restaurant.class);
                startActivity(move);
                break;
            case R.id.info:
                Intent pindah = new Intent(this, info.class);
                startActivity(pindah);
                break;
            case R.id.ext:
                AlertDialog.Builder keluar = new AlertDialog.Builder(Home.this);
                keluar.setMessage("Anda yakin ingin keluar ?").setCancelable(false).setPositiveButton("YA", new AlertDialog.OnClickListener(){
                    public void onClick(DialogInterface dialog, int arg1){
                        Home.this.finish();
                        System.exit(0);
                    }
                }).setNegativeButton("Tidak", new AlertDialog.OnClickListener(){
                    public void onClick(DialogInterface arg, int arg1){
                        arg.cancel();
                    }
                });
                AlertDialog arg1 = keluar.create();
                arg1.setTitle("KELUAR");
                arg1.show();
                break;

        }

    }
}
