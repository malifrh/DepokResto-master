package com.whitehouse.frengkyabs.depokresto;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class KelapaDua extends Activity {
    protected ListView lv;
    protected ListAdapter adapter;
    SQLiteDatabase db;
    Cursor cursor;
    EditText et_db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelapa_dua);


        db = (new DB_Resto2(this)).getWritableDatabase();
        lv = (ListView) findViewById(R.id.lv);
        et_db = (EditText) findViewById(R.id.et);

        try {
            cursor = db.rawQuery("SELECT * FROM resto ORDER BY nama ASC", null);
            adapter = new SimpleCursorAdapter(this, R.layout.isilvk, cursor,
                    new String[] { "nama", "location", "open", "img", "menu", "tlp"  }, new int[] {
                    R.id.tv_nama, R.id.tvBahan, R.id.tvBahan2, R.id.imV ,R.id.menum, R.id.tlp});
            lv.setAdapter(adapter);
            lv.setTextFilterEnabled(true);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View v,
                                        int position, long id) {
                    detail(position);

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("deprecation")
    public void search_db(View v) {
        String edit_db = et_db.getText().toString();
        if (!edit_db.equals("")) {
            try {
                cursor = db.rawQuery("SELECT * FROM resto WHERE nama LIKE ?",
                        new String[] { "%" + edit_db + "%" });
                adapter = new SimpleCursorAdapter(
                        this,
                        R.layout.isilvk,
                        cursor,
                        new String[] { "nama", "location", "open", "img", "menu", "tlp" },
                        new int[] { R.id.tv_nama, R.id.tvBahan,R.id.tvBahan2, R.id.imV , R.id.menum, R.id.tlp });
                if (adapter.getCount() == 0) {
                    Toast.makeText(
                            this,
                            "Tidak ditemukan data dengan kata kunci " + edit_db
                                    + "", Toast.LENGTH_SHORT).show();
                } else {
                    lv.setAdapter(adapter);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                cursor = db.rawQuery("SELECT * FROM resto ORDER BY nama ASC",
                        null);
                adapter = new SimpleCursorAdapter(
                        this,
                        R.layout.isilvk,
                        cursor,
                        new String[] { "nama", "location", "open", "img", "menu", "tlp" },
                        new int[] { R.id.tv_nama, R.id.tvBahan, R.id.tvBahan2, R.id.imV, R.id.menum, R.id.tlp });
                lv.setAdapter(adapter);
                lv.setTextFilterEnabled(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



    private void detail(int position) {
        int im = 0;
        int menu = 1;
        String _id = "";
        String nama = "";
        String location = "";
        String open = "";
        String tlp = "";

        //tambahan yang kurang
        Double latitude = null;
        Double longitude = null;

        if (cursor.moveToFirst()) {
            cursor.moveToPosition(position);
            im = cursor.getInt(cursor.getColumnIndex("img"));
            nama = cursor.getString(cursor.getColumnIndex("nama"));
            location = cursor.getString(cursor.getColumnIndex("location"));

            //tambahan yang kurang
            latitude = cursor.getDouble(cursor.getColumnIndex("latitude"));
            longitude = cursor.getDouble(cursor.getColumnIndex("longitude"));

            open = cursor.getString(cursor.getColumnIndex("open"));
            menu = cursor.getInt(cursor.getColumnIndex("menu"));
            tlp = cursor.getString(cursor.getColumnIndex("tlp"));
        }

        Intent iIntent = new Intent(this, DB_Parse1.class);
        iIntent.putExtra("dataIM", im);
        iIntent.putExtra("dataNama", nama);
        iIntent.putExtra("dataLocation", location);

        //tambahan yang kurang
        iIntent.putExtra("dataLatitude", latitude);
        iIntent.putExtra("dataLongitude", longitude);

        iIntent.putExtra("dataOpen", open);
        iIntent.putExtra("dataMenu", menu);
        iIntent.putExtra("dataTelpon", tlp);
        setResult(RESULT_OK, iIntent);
        startActivityForResult(iIntent, 99);
    }
}