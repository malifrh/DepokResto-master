package com.whitehouse.frengkyabs.depokresto;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DB_Resto2 extends SQLiteOpenHelper {
    final static String DB_NAME = "DB_Resto2";

    public DB_Resto2(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE resto(_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nama TEXT, location TEXT, latitude FLOAT, longitude FLOAT, open TEXT, tlp TEXT, menu BLOB, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("_id", 1);
        values.put("nama", "Richeese Factory");
        values.put("location", "Kelapa Dua, Jalan Akses Ui No.48, Tugu, Cimanggis, Tugu, Cimanggis, Kota Depok, Jawa Barat 16451");
        values.put("latitude", -6.354625);
        values.put("longitude", 106.844459);
        values.put("open","24 hours");
        values.put("tlp","(021) 1500220");
        values.put("menu",R.drawable.recheese);
        values.put("img", R.drawable.bgrechesse);
        db.insert("resto", "null", values);

        values.put("_id", 2);
        values.put("nama", "McDonald's");
        values.put("location", "Jl. Akses Ui No.59, Tugu, Cimanggis, Kota Depok, Jawa Barat 16451");
        values.put("latitude", -6.354543);
        values.put("longitude", 106.844576);
        values.put("open","24 hours");
        values.put("tlp","(021) 29374437");
        values.put("menu",R.drawable.mcd);
        values.put("img", R.drawable.bgmcd);
        db.insert("resto", "null", values);

        values.put("_id", 3);
        values.put("nama", "Bakmie & Seafood 99");
        values.put("location", "Jalan Kelapa Dua Wetan Blok E1 No. 14, RT.3/RW.5, Klp. Dua Wetan");
        values.put("latitude", -6.351183);
        values.put("longitude", 106.894003);
        values.put("open","09:00 - 22:00");
        values.put("tlp","(021) 8716985");
        values.put("menu",R.drawable.bakmii);
        values.put("img", R.drawable.bgbakmie);
        db.insert("resto", "null", values);

        values.put("_id", 4);
        values.put("nama", "Bff Cafe & Lounge");
        values.put("location", "Jl. Akses Ui No.79A, Tugu, Cimanggis, Kota Depok, Jawa Barat 16451");
        values.put("latitude", -6.357259);
        values.put("longitude", 106.858725);
        values.put("open","10:00 - 22:00");
        values.put("tlp", "(021) 22852105");
        values.put("menu", R.drawable.bff);
        values.put("img", R.drawable.bgbff);
        db.insert("resto", "null", values);

        values.put("_id", 5);
        values.put("nama", "Saturday Coffee ");
        values.put("location", "Jalan Komjen. Pol. M. Jasin, Tugu, Cimanggis, Tugu, Cimanggis, Kota Depok, Jawa Barat 16541");
        values.put("latitude", -6.355035);
        values.put("longitude", 106.840950);
        values.put("open","14:00 - 01:00");
        values.put("tlp", "0856-8584-353");
        values.put("menu",R.drawable.sat);
        values.put("img", R.drawable.bgsatur);
        db.insert("resto", "null", values);

        values.put("_id", 6);
        values.put("nama", "Container Kebab");
        values.put("location", "l. Akses Ui No.95, RT.8/RW.1, Tugu, Cimanggis, Kota Depok, Jawa Barat 16451");
        values.put("latitude", -6.354487);
        values.put("longitude", 106.840179);
        values.put("open","24 hours");
        values.put("tlp","0812-1052-2358");
        values.put("menu",R.drawable.kebab);
        values.put("img", R.drawable.bgkebab);
        db.insert("resto", "null", values);

        values.put("_id", 7);
        values.put("nama", "Warkop Pancong");
        values.put("location", "Jl. Akses Ui No.41, Tugu, Cimanggis, Kota Depok, Jawa Barat 16451");
        values.put("latitude", -6.354820);
        values.put("longitude", 106.847645);
        values.put("open","24 hours");
        values.put("tlp", "0812-9074-5078");
        values.put("menu",R.drawable.pancong);
        values.put("img", R.drawable.bgpancong);
        db.insert("resto", "null", values);

        values.put("_id", 8);
        values.put("nama", "Waroeng Steak & Shake");
        values.put("location", "Kelapa Dua, Jl. M. Yasin No.6, Tugu, Cimanggis, Kota Depok, Jawa Barat 16451");
        values.put("latitude", -6.358259);
        values.put("longitude", 106.865763);
        values.put("open","12:00 - 22:00");
        values.put("tlp","0822-4252-0000");
        values.put("menu",R.drawable.ws);
        values.put("img", R.drawable.bgws);
        db.insert("resto", "null", values);

        values.put("_id", 9);
        values.put("nama", "Big Daddy's Resto");
        values.put("location", "Jalan Akses Ui No.46, Tugu, Cimanggis, Tugu, Cimanggis, Kota Depok, Jawa Barat 16451");
        values.put("latitude", -6.354816);
        values.put("longitude", 106.846138);
        values.put("open","10:00 - 04.30");
        values.put("tlp","(021) 22827218");
        values.put("menu",R.drawable.big);
        values.put("img", R.drawable.bgdaddy);
        db.insert("resto", "null", values);

        values.put("_id", 10);
        values.put("nama", "Nasi Goreng Karee");
        values.put("location", "Jl. Klp. Dua Raya Blok A No.26, Tugu, Cimanggis, Kota Depok, Jawa Barat 16451");
        values.put("latitude", -6.373057);
        values.put("longitude", 106.834847);
        values.put("open","17:00 - 00:00");
        values.put("tlp","0819-0591-4151");
        values.put("menu",R.drawable.kare);
        values.put("img", R.drawable.bgkaree);
        db.insert("resto", "null", values);

        values.put("_id", 11);
        values.put("nama", "Kedai Susu Moo");
        values.put("location", "Jl. Nusantara No.2, Pasir Gn. Sel., Cimanggis, Kota Depok, Jawa Barat 13780");
        values.put("latitude", -6.352107);
        values.put("longitude", 106.843417);
        values.put("open","24 hours");
        values.put("tlp","0813-9864-3111");
        values.put("menu",R.drawable.monenen);
        values.put("img", R.drawable.bgmoo);
        db.insert("resto", "null", values);

        values.put("_id", 12);
        values.put("nama", "Buah Goreng Joki");
        values.put("location", "Jl. Akses UI No. 88, Kelapa Dua, Cimanggis, Depok");
        values.put("open","10:00 - 22:00");
        values.put("tlp"," ");
        values.put("menu",R.drawable.joki);
        values.put("img", R.drawable.bgjoki);
        db.insert("resto", "null", values);

        values.put("_id", 13);
        values.put("nama", "Pecel Lele Lela ");
        values.put("location", "Jl. Akses Ui No.69, Tugu, Cimanggis, Kota Depok, Jawa Barat 16451");
        values.put("latitude", -6.354436);
        values.put("longitude", 106.842361);
        values.put("open"," ");
        values.put("tlp"," ");
        values.put("menu",R.drawable.lela);
        values.put("img", R.drawable.bglela);
        db.insert("resto", "null", values);

        values.put("_id", 14);
        values.put("nama", "Ranjang 69");
        values.put("location", "Jl. Akses UI No. 35, RW.1, Tugu, Depok, Kota Depok, Jawa Barat 16423");
        values.put("latitude", -6.354070);
        values.put("longitude", 106.838915);
        values.put("open","11:00 - 21:00");
        values.put("tlp","0812-9376-0944");
        values.put("menu",R.drawable.ranjang);
        values.put("img", R.drawable.bgranjang);
        db.insert("resto", "null", values);

        values.put("_id", 15);
        values.put("nama", "Warung Wan");
        values.put("location", "Jl. Prof.Lafran Pane, Bakti Jaya, Sukmajaya, Kota Depok, Jawa Barat 16418");
        values.put("latitude", -6.358547);
        values.put("longitude", 106.843513);
        values.put("open","12:00 - 22:00");
        values.put("tlp","(021) 22987358");
        values.put("menu",R.drawable.wan);
        values.put("img", R.drawable.bgwan);
        db.insert("resto", "null", values);

        values.put("_id", 16);
        values.put("nama", "Kebon Ice");
        values.put("location","Jalan Komjen.Pol.M.Jasin, no.33 RW.1, Tugu, Cimanggis, Kota Depok");
        values.put("latitude", -6.358621);
        values.put("longitude", 106.843502);
        values.put("open","12:00 - 22:00");
        values.put("tlp","(021) 22987358");
        values.put("menu",R.drawable.kebon);
        values.put("img", R.drawable.bgkebon);
        db.insert("resto", "null", values);

        values.put("_id", 17);
        values.put("nama", "Domino's Pizza");
        values.put("location", "Jl. RTM Kelapa Dua No. 67, RT.02 / RW.01, Tugu, Cimanggis, Tugu, Cimanggis, Kota Depok");
        values.put("latitude", -6.355233);
        values.put("longitude", 106.834847);
        values.put("open","10:00 - 23:00");
        values.put("tlp", "(021) 22821909");
        values.put("menu",R.drawable.domino);
        values.put("img", R.drawable.bgdomino);
        db.insert("resto", "null", values);

        values.put("_id", 18);
        values.put("nama", "Fat Mommies");
        values.put("location", "Jalan Akses Ui No 45C Kelurahan Tugu Kelapa Dua, Kecamatan Cimanggis, Tugu");
        values.put("latitude", -6.354666);
        values.put("longitude", 106.840401);
        values.put("open","10:00 - 22:00");
        values.put("tlp"," ");
        values.put("menu",R.drawable.mommies);
        values.put("img", R.drawable.bgmommies);
        db.insert("resto", "null", values);

        values.put("_id", 19);
        values.put("nama", "Harad Coffee");
        values.put("location", "Jl. Akses Ui No.35, RW.1, Tugu, Cimanggis, Kota Depok");
        values.put("latitude", -6.354037);
        values.put("longitude", 106.838820);
        values.put("open","11:00 - 01:00");
        values.put("tlp","0812-5523-3365");
        values.put("menu",R.drawable.harad);
        values.put("img", R.drawable.bgharad);
        db.insert("resto", "null", values);

        values.put("_id", 20);
        values.put("nama", "B&B Waroeng Kopie");
        values.put("location", "Jl. Akses UI No. 35 (Depan Kampus H Gunadarma Depok), Kelapa Dua, Cimanggis, Depok");
        values.put("open","10:00 - 22:00");
        values.put("tlp"," ");
        values.put("menu",R.drawable.bb);
        values.put("img", R.drawable.bgkopie);
        db.insert("resto", "null", values);

        values.put("_id", 21);
        values.put("nama", "Cafe Moo Nenen");
        values.put("location", "Jalan Akses Ui Kelapa 2 No.32, RW.1, Tugu, Cimanggis,");
        values.put("latitude", -6.354068);
        values.put("longitude", 106.839007);
        values.put("open","11:00 - 01:00");
        values.put("tlp","0812-8431-8866");
        values.put("menu",R.drawable.monenen);
        values.put("img", R.drawable.bgnenen);
        db.insert("resto", "null", values);

        values.put("_id", 24);
        values.put("nama", "Sate Kambing Muda");
        values.put("location", "Jl. RTM Raya No. 12, Kelapa Dua, Cimanggis, Depok");
        values.put("latitude", -6.373057);
        values.put("longitude", 106.834847);
        values.put("open","10:00 - 22:00");
        values.put("tlp","021 78870840");
        values.put("menu",R.drawable.rtm);
        values.put("img", R.drawable.bgrtm);
        db.insert("resto", "null", values);

        values.put("_id", 25);
        values.put("nama", "Raja Ramen");
        values.put("location", "Jl. Akses UI No. 88A, Kelapa Dua, Cimanggis, Depok");
        values.put("latitude", -6.373057);
        values.put("longitude", 106.834847);
        values.put("open","10:00 - 22:00");
        values.put("tlp","021 78870840");
        values.put("menu",R.drawable.raja);
        values.put("img", R.drawable.bgrraja);
        db.insert("resto", "null", values);

        values.put("_id", 26);
        values.put("nama", "Warung Warjoo");
        values.put("location", "Jl. Akses UI No. 6 (Depan Universitas Gunadarma), Kelapa Dua, Cimanggis, Depok");
        values.put("latitude", -6.373057);
        values.put("longitude", 106.834847);
        values.put("open","10:00 - 22:00");
        values.put("tlp","021 78870840");
        values.put("menu",R.drawable.warjooo);
        values.put("img", R.drawable.bgwarjoo);
        db.insert("resto", "null", values);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /*db.execSQL("DROP TABLE IF EXISTS restaurant");
        onCreate(db);*/

    }
    public void addItem(String nama, String lokasi, Double lat, Double lng, String open, int menu, int img,
                        SQLiteDatabase db){
        ContentValues values = new ContentValues();
        values.put("nama", nama);
        values.put("location", lokasi);
        values.put("latitude", lat);
        values.put("longitude", lng);
        values.put("open",open);
        values.put("menu",menu);
        values.put("img", img);
        db.insert("restaurant", null, values);
        Log.e("Database OPERATION","One row inserted...");
    }

    public Cursor getLongitudeLatitude(SQLiteDatabase db){
        Cursor cursor;
        String[] projections = {"latitude", "longitude"};
        cursor = db.query("resto",projections,null,null,null,null,null);
        return cursor;
    }
}

