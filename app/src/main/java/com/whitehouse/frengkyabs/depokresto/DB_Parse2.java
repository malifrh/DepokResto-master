package com.whitehouse.frengkyabs.depokresto;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DB_Parse2 extends Activity {

    ImageView Im ,Imenu;
    TextView tv_nama, tv_bahan, tv_bahan2, tv_tlp, id;
    Button Btn2;
    //Gallery gallery;
    ImageSwitcher imageSwitcher;
    Integer[] imageIDs = new Integer[3];
    int msg_im, msg_menu;

    DB_Resto2 dbResto2;
    SQLiteDatabase sqLiteDatabase;
    Cursor cursor;
    List<Double> listLat = new ArrayList<>();
    List<Double> listLng = new ArrayList<>();

    double lat,lng;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto2);

        Intent iIdentifikasi = getIntent();
        msg_im = iIdentifikasi.getIntExtra("dataIM", 0);
        final String msg_nama = iIdentifikasi.getStringExtra("dataNama");
        String msg_location = iIdentifikasi.getStringExtra("dataLocation");
        String msg_open = iIdentifikasi.getStringExtra("dataOpen");
        String msg_tlp = iIdentifikasi.getStringExtra("dataTelpon");

        //tambahan
        lat = iIdentifikasi.getDoubleExtra("dataLatitude",0);
        lng = iIdentifikasi.getDoubleExtra("dataLongitude",0);

        msg_menu = iIdentifikasi.getIntExtra("dataMenu",1);
        Im = (ImageView) findViewById(R.id.iv_detail);
        tv_nama = (TextView) findViewById(R.id.tvNama);
        tv_bahan = (TextView) findViewById(R.id.tvBahan);
        tv_bahan2 = (TextView) findViewById(R.id.tvBahan2);
        tv_tlp = (TextView) findViewById(R.id.tlp);
        Imenu = (ImageView) findViewById(R.id.menum);
        Btn2 = (Button) findViewById(R.id.maps);
        Im.setImageResource(msg_im);
        tv_nama.setText(msg_nama);
        tv_bahan.setText(msg_location);
        tv_bahan2.setText(msg_open);
        tv_tlp.setText(msg_tlp);
        Imenu.setImageResource(msg_menu);

        dbResto2 = new DB_Resto2(this);

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*sqLiteDatabase = dbResto2.getWritableDatabase();
                dbResto2.addItem("Ira","Depok",-2.991979,104.759211,"07:00",R.drawable.pidie,R.drawable.bgpidie,sqLiteDatabase);
                dbResto2.close();*/
                /*sqLiteDatabase = dbResto2.getReadableDatabase();
                cursor = dbResto2.getLongitudeLatitude(sqLiteDatabase);
                if(cursor.moveToFirst()){
                    int position = getIntent().getIntExtra("position",0);
                    cursor.moveToPosition(position);
                    lat = cursor.getFloat(cursor.getColumnIndex("latitude"));
                    lng = cursor.getFloat(cursor.getColumnIndex("longitude"));
                }*/
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+lat+","+lng+"("+msg_nama+ ")"));
                startActivity(intent);
                dbResto2.close();
            }
        });
    }
}
