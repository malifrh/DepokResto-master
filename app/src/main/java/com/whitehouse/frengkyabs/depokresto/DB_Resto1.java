package com.whitehouse.frengkyabs.depokresto;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DB_Resto1 extends SQLiteOpenHelper {
    final static String DB_NAME = "DB_Resto1";

    public DB_Resto1(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE restaurant(_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nama TEXT, location TEXT, latitude FLOAT, longitude FLOAT, open TEXT, tlp TEXT, menu BLOB, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("_id", 1);
        values.put("nama", "Sushi Tei");
        values.put("location", "Margo City, Lantai 1");
        values.put("latitude", -6.373057);
        values.put("longitude", 106.834847);
        values.put("open","10:00 - 22:00");
        values.put("tlp","021 78870840");
        values.put("menu", R.drawable.sushi);
        values.put("img", R.drawable.bgsushitei);
        db.insert("restaurant", null, values);

        values.put("_id", 2);
        values.put("nama", "Mujigae");
        values.put("location", "Margo City Lt Ground (North Gate) Jl Margonda Raya, Depok, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16436");
        values.put("latitude", -6.369433);
        values.put("longitude", 106.831937);
        values.put("open","09.00 AM - 21.00 PM");
        values.put("tlp","021 29049202");
        values.put("menu", R.drawable.muji);
        values.put("img", R.drawable.bgmuji);
        db.insert("restaurant", null, values);

        values.put("_id", 3);
        values.put("nama", "An.Nyeong");
        values.put("location", "Jl. Margonda Raya Blok Rambutan No.48, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.359435);
        values.put("longitude", 1106.832776);
        values.put("open","11:00 - 24:00");
        values.put("tlp"," ");
        values.put("menu",R.drawable.annyeong);
        values.put("img", R.drawable.bgannyeong);
        db.insert("restaurant", null, values);

        values.put("_id", 4);
        values.put("nama", "Yellow Truck Coffee");
        values.put("location", "Jl. Margonda Raya No.505C, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.362185);
        values.put("longitude", 106.833395);
        values.put("open","10:00 - 23:00");
        values.put("tlp","021 7874039");
        values.put("menu",R.drawable.truck);
        values.put("img", R.drawable.bgyellow);
        db.insert("restaurant", null, values);

        values.put("_id", 5);
        values.put("nama", "Fat Bubble");
        values.put("location", "Jalan Margonda Raya No. 238 B&C, Beji, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16423");
        values.put("latitude", -6.382203);
        values.put("longitude", 106.829664);
        values.put("open","10:00 - 22:00");
        values.put("tlp","021 77218559");
        values.put("menu",R.drawable.fatb);
        values.put("img", R.drawable.bgfat);
        db.insert("restaurant", null, values);

        values.put("_id", 6);
        values.put("nama", "Waroeng SS");
        values.put("location", "Jl. Margonda Raya No. 280, Kemiri Muka , Bojongsari, Beji, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16423");
        values.put("latitude", -6.378381);
        values.put("longitude", 106.832042);
        values.put("open","11:00 - 24:00");
        values.put("tlp", "021 77201492");
        values.put("menu",R.drawable.ss);
        values.put("img", R.drawable.bgws);
        db.insert("restaurant", null, values);

        values.put("_id", 7);
        values.put("nama", "The Harvest");
        values.put("location", "Jl. Margonda Raya No.295, Depok, Beji, Kota Depok, Jawa Barat 16431");
        values.put("latitude", -6.377803);
        values.put("longitude", 106.831256);
        values.put("open","08:00 - 22:00");
        values.put("tlp", "021 77216200");
        values.put("menu",R.drawable.harvest);
        values.put("img", R.drawable.bgharvest);
        db.insert("restaurant", null, values);

        values.put("_id", 8);
        values.put("nama", "Wingstop");
        values.put("location", "Margo City Lantai 1 #FL 1-7, Jalan Margot Raya No. 358, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16423");
        values.put("latitude", -6.374213);
        values.put("longitude", 106.835974);
        values.put("open","10:00 - 22:00");
        values.put("tlp", "021 29049277");
        values.put("menu",R.drawable.wing);
        values.put("img", R.drawable.bgwing);
        db.insert("restaurant", null, values);

        values.put("_id", 9);
        values.put("nama", "Kami Ruang & Café");
        values.put("location", "Jl. Margonda Raya No.485, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.364013);
        values.put("longitude", 106.833649);
        values.put("open","10:00 - 22:00");
        values.put("tlp", "021 29402381");
        values.put("menu",R.drawable.kami);
        values.put("img", R.drawable.bgkami);
        db.insert("restaurant", null, values);

        values.put("_id", 10);
        values.put("nama", "Warung Oppa");
        values.put("location", "Jl. Margonda Raya No.330, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.374693);
        values.put("longitude", 106.832110);
        values.put("open","10:00 - 24:00");
        values.put("tlp", "081567897777");
        values.put("menu",R.drawable.oppa);
        values.put("img", R.drawable.bgoppa);
        db.insert("restaurant", null, values);

        values.put("_id", 11);
        values.put("nama", "Casa Kalea");
        values.put("location", "Jl. Margonda Raya No.267, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16423");
        values.put("latitude", -6.380199);
        values.put("longitude", 106.830538);
        values.put("open","11:00 - 22:00");
        values.put("tlp","0812-1220-2191");
        values.put("menu",R.drawable.bgcasaaa);
        values.put("img", R.drawable.bgcasa);
        db.insert("restaurant", null, values);

        values.put("_id", 12);
        values.put("nama", "Warunk UpNormal");
        values.put("location", "Jalan Margonda Raya No.328, Pondok Cina, Beji, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.364630);
        values.put("longitude", 106.836126);
        values.put("open","10:00 - 22:00");
        values.put("tlp"," ");
        values.put("menu",R.drawable.upnormal);
        values.put("img", R.drawable.bgupnormal);
        db.insert("restaurant", null, values);

        values.put("_id", 13);
        values.put("nama", "Starbucks Coffee");
        values.put("location", "Margonda City Lt. Dasar Lobby, Jl. Margonda Raya No. 358, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16423");
        values.put("latitude", -6.373221);
        values.put("longitude", 106.835039);
        values.put("open","09:00 - 22:00");
        values.put("tlp","021 78870894");
        values.put("menu",R.drawable.star);
        values.put("img", R.drawable.bgstar);
        db.insert("restaurant", null, values);

        values.put("_id", 14);
        values.put("nama", "Kopka");
        values.put("location", "Jl. Margonda Raya No.24, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.366039);
        values.put("longitude", 106.834426);
        values.put("open","10:00 - 22:00");
        values.put("tlp","085770476767");
        values.put("menu",R.drawable.kopra);
        values.put("img", R.drawable.bgkopra);
        db.insert("restaurant", null, values);

        values.put("_id", 15);
        values.put("nama", "Sop Durian Margando");
        values.put("location", "Jl. Margonda Raya No.1, Depok, Pancoran MAS, Kota Depok, Jawa Barat 16436");
        values.put("latitude", -6.382203);
        values.put("longitude", 106.829664);
        values.put("open","10:00 - 22:00");
        values.put("tlp","081369270571");
        values.put("menu",R.drawable.durian);
        values.put("img", R.drawable.bgdurian);
        db.insert("restaurant", null, values);

        values.put("_id", 16);
        values.put("nama", "Kimung Kedai Kopi");
        values.put("location", "Pondok Cina, Beji, Depok City, West Java 16424");
        values.put("latitude", -6.367109);
        values.put("longitude", 106.834155);
        values.put("open","08.30 - 11.30");
        values.put("tlp","021 29402393");
        values.put("menu",R.drawable.kimung);
        values.put("img", R.drawable.bgkimung);
        db.insert("restaurant", null, values);

        values.put("_id", 17);
        values.put("nama", "J.CO Donuts & Coffee");
        values.put("location","Margonda City Lantai GF No.20, Jl. Margonda Raya, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16423");
        values.put("latitude", -6.372659);
        values.put("longitude", 106.834813);
        values.put("open","10:00 - 22:00");
        values.put("tlp","021 78870998");
        values.put("menu",R.drawable.jco);
        values.put("img", R.drawable.bgjco);
        db.insert("restaurant", null, values);

        values.put("_id", 18);
        values.put("nama", "KopiBar");
        values.put("location", "Jl. Margonda Raya No.400, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.369578);
        values.put("longitude", 106.833778);
        values.put("open","10:00 - 02:00");
        values.put("tlp","08118004444");
        values.put("menu",R.drawable.kopibarr);
        values.put("img", R.drawable.bgkopibar);
        db.insert("restaurant", null, values);

        values.put("_id", 19);
        values.put("nama", "Dunkin' Donuts");
        values.put("location", "Dunkin' Donuts, Jl. Margonda Raya, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.371164);
        values.put("longitude", 106.833913);
        values.put("open","10:00 - 22:00");
        values.put("tlp"," ");
        values.put("menu",R.drawable.dunkin3);
        values.put("img", R.drawable.bgdunkin);
        db.insert("restaurant", null, values);

        values.put("_id", 20);
        values.put("nama", "YamMie Hotplate");
        values.put("location","Margo City Lantai 2, Jl. Margonda Raya, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16423");
        values.put("latitude", -6.386377);
        values.put("longitude",  106.829633);
        values.put("open","10:00 - 22:00");
        values.put("tlp","021 29049213");
        values.put("menu",R.drawable.hot);
        values.put("img", R.drawable.bgyammie);
        db.insert("restaurant", null, values);

        values.put("_id", 21);
        values.put("nama", "Martabak Pizza Orins");
        values.put("location", "Jl. Margonda Raya No.516, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.359082);
        values.put("longitude",106.833431);
        values.put("open","11:00 - 22:00");
        values.put("tlp","0857-1960-0071");
        values.put("menu",R.drawable.orins);
        values.put("img", R.drawable.bgorins);
        db.insert("restaurant", null, values);

        values.put("_id", 22);
        values.put("nama", "Nasi Pecel Mbak Ira");
        values.put("location", "Jl. Margonda Raya No.526, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424\n");
        values.put("latitude", -6.360596);
        values.put("longitude", 106.833718);
        values.put("open","10:00 - 22:00");
        values.put("tlp","021 7863060");
        values.put("menu",R.drawable.ira);
        values.put("img", R.drawable.bgira);
        db.insert("restaurant", null, values);

        values.put("_id", 23);
        values.put("nama", "Taichan B Gondrong");
        values.put("location", "Jalan Margonda Raya No.277, Kemiri Muka, Beji, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.379345);
        values.put("longitude", 106.831553);
        values.put("open","14:00 - 00:00");
        values.put("tlp","0812-1934-9265");
        values.put("menu",R.drawable.taichan);
        values.put("img", R.drawable.bgtaichan);
        db.insert("restaurant", null, values);

        values.put("_id", 24);
        values.put("nama", "Mie Jambret");
        values.put("location", "Jl. Margonda Raya No.455, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.366393);
        values.put("longitude", 106.834693);
        values.put("open","08:00 - 12:00");
        values.put("tlp","021 7664838");
        values.put("menu",R.drawable.jambret);
        values.put("img", R.drawable.bgjambret);
        db.insert("restaurant", null, values);

        values.put("_id", 25);
        values.put("nama", "Chit Chat Waroeng");
        values.put("location", "Jl. Margonda Raya No.299B, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16411");
        values.put("latitude", -6.377525);
        values.put("longitude", 106.832328);
        values.put("open","11:00 - 23:00");
        values.put("tlp","08111741986");
        values.put("menu",R.drawable.chitchat);
        values.put("img", R.drawable.bgchit);
        db.insert("restaurant", null, values);

        values.put("_id", 26);
        values.put("nama", "Sagoo Kitchen");
        values.put("location", "Margonda City Mall Lt. G, Jl. Margonda Raya No. 358, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16423");
        values.put("latitude", -6.373117);
        values.put("longitude",  106.834992);
        values.put("open","10:00 - 22:00");
        values.put("tlp","021 78871067");
        values.put("menu",R.drawable.sagoo);
        values.put("img", R.drawable.bgsagoo);
        db.insert("restaurant", null, values);

        values.put("_id", 27);
        values.put("nama", "RM Ajo Datuak");
        values.put("location", "Jl. Margonda Raya No.410, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424\n");
        values.put("latitude", -6.368008);
        values.put("longitude", 106.834453);
        values.put("open","09:00 - 21:00");
        values.put("tlp","0812-8300-2028");
        values.put("menu","  ");
        values.put("img", R.drawable.bgdatuak);
        db.insert("restaurant", null, values);

        values.put("_id", 28);
        values.put("nama", "Perang Kerang ");
        values.put("location", "Jl. Margonda Raya No.49B, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.363209);
        values.put("longitude", 106.834002);
        values.put("open","15:00 - 00:00");
        values.put("tlp","087782800572");
        values.put("menu",R.drawable.perangg);
        values.put("img", R.drawable.bgkerang);
        db.insert("restaurant", null, values);

        values.put("_id", 29);
        values.put("nama", "Maxx Coffee");
        values.put("location", "Jalan Margonda Raya, Pondok Cina, Beji, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.372584);
        values.put("longitude",106.832094);
        values.put("open","10:00 - 22:00");
        values.put("tlp"," ");
        values.put("menu",R.drawable.max);
        values.put("img", R.drawable.bgmax);
        db.insert("restaurant", null, values);

        values.put("_id", 30);
        values.put("nama", "Kedai Kawa Wahidin");
        values.put("location", "No. 154, Jalan Margonda Raya, Pd. Cina, Beji, Kota Depok, Daerah Khusus Ibukota Jakarta 12960");
        values.put("latitude", -6.359440);
        values.put("longitude", 106.833487);
        values.put("open","24 hours");
        values.put("tlp"," ");
        values.put("menu",R.drawable.kawaaa);
        values.put("img", R.drawable.bgkawa);
        db.insert("restaurant", null, values);

        values.put("_id", 31);
        values.put("nama", "Resto Mie Ayam Berkat");
        values.put("location", "Jl. Margonda Raya No.504, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.360599);
        values.put("longitude",106.833863);
        values.put("open","09.30 - 21.30");
        values.put("tlp"," ");
        values.put("menu",R.drawable.berkat);
        values.put("img", R.drawable.bgberkat);
        db.insert("restaurant", null, values);


        values.put("_id", 33);
        values.put("nama", "O Crepes");
        values.put("location", "Depok Town Square Food Square Lantai 2, Jalan Margonda Raya, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16422");
        values.put("latitude", -6.372529);
        values.put("longitude", 106.832074);
        values.put("open","10:00 - 21:00");
        values.put("tlp","0815-1059-5831");
        values.put("menu",R.drawable.crep);
        values.put("img", R.drawable.crepes);
        db.insert("restaurant", null, values);


        values.put("_id", "35");
        values.put("nama", "Bakmi GM");
        values.put("location", "Margo City Lt. 2 Food Court, Jalan Margonda Raya No.358, Pondok Cina, Beji, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.372704);
        values.put("longitude", 106.835355);
        values.put("open","10:00 - 21:30");
        values.put("tlp","(021) 29049336");
        values.put("menu",R.drawable.gm);
        values.put("img", R.drawable.bggm);
        db.insert("restaurant", null, values);

        values.put("_id", 36);
        values.put("nama", "Nominal Café");
        values.put("location", "Jl. Margonda Raya No.274-278, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16423");
        values.put("latitude", -6.379530);
        values.put("longitude", 106.831213);
        values.put("open","12:00 - 00:00");
        values.put("tlp", "0852-9411-0480");
        values.put("menu",R.drawable.nominal);
        values.put("img", R.drawable.bgnominal);
        db.insert("restaurant", null, values);

        values.put("_id", 37);
        values.put("nama", "Dino Steak & Pasta");
        values.put("location", "Jalan Margonda Raya No. 438, Pondok Cina, Beji, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.366540);
        values.put("longitude", 106.834480);
        values.put("open","11:30 - 21:30");
        values.put("tlp","(021) 78891854");
        values.put("menu",R.drawable.dino7);
        values.put("img", R.drawable.bgdino);
        db.insert("restaurant", null, values);

        values.put("_id", 38);
        values.put("nama", "Shihlin");
        values.put("location", "Jalan Margonda Raya No. 438, Pondok Cina, Beji, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.373192);
        values.put("longitude", 106.834861);
        values.put("open","11:30 - 21:30");
        values.put("tlp","(021) 78891854");
        values.put("menu",R.drawable.shilinn);
        values.put("img", R.drawable.bgshilin);
        db.insert("restaurant", null, values);

        values.put("_id", 39);
        values.put("nama", "KFC");
        values.put("location", "Jalan Margonda Raya No.88, Kemiri Muka, Beji, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.374922);
        values.put("longitude", 106.833286);
        values.put("open","08:00 - 23:00");
        values.put("tlp","(021) 7874189");
        values.put("menu",R.drawable.kfcc);
        values.put("img", R.drawable.bgkfc);
        db.insert("restaurant", null, values);

        values.put("_id", 40);
        values.put("nama", "Baperin Aja");
        values.put("location", "Jalan Margonda Raya Depan Kampus D Gunadarma, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.368588);
        values.put("longitude", 106.834401);
        values.put("open","10:00 - 22:00");
        values.put("tlp","0822-9831-3599");
        values.put("menu",R.drawable.baperin5);
        values.put("img", R.drawable.bgbaperin);
        db.insert("restaurant", null, values);


        values.put("_id", 42);
        values.put("nama", "Roti Bakar Eddy");
        values.put("location", "Jl. Margonda Raya No.1, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.371127);
        values.put("longitude", 106.833646);
        values.put("open","07:00 - 02:00");
        values.put("tlp","(021) 29402398");
        values.put("menu",R.drawable.eddy);
        values.put("img", R.drawable.bgeddy);
        db.insert("restaurant", null, values);

        values.put("_id", 43);
        values.put("nama", "Gigieat Cake");
        values.put("location", "Jl. Margonda Raya No.27, Pd. Cina, Beji, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.365958);
        values.put("longitude", 106.834267);
        values.put("open","12:00 - 22:00");
        values.put("tlp","0813-1146-3496");
        values.put("menu",R.drawable.gigi);
        values.put("img", R.drawable.bggigi);
        db.insert("restaurant", null, values);

        values.put("_id", 44);
        values.put("nama", "Tranz-Eat");
        values.put("location", "Jl. Naidi No.37 A, Pd. Cina, Beji, Kota Depok, Jawa Barat 14242");
        values.put("latitude", -6.361717);
        values.put("longitude", 106.834019);
        values.put("open","14:00 - 23:00");
        values.put("tlp","(021) 7866470");
        values.put("menu",R.drawable.tran2);
        values.put("img", R.drawable.bgtran);
        db.insert("restaurant", null, values);

        values.put("_id", 45);
        values.put("nama", "M POOL & BISTRO ");
        values.put("location", "The Margo Hotel, Lantai 3");
        values.put("latitude", -6.371725);
        values.put("longitude", 106.834430);
        values.put("open","10:00 - 22:00");
        values.put("tlp"," ");
        values.put("menu",R.drawable.pool);
        values.put("img", R.drawable.bgpool);
        db.insert("restaurant", null, values);

        values.put("_id", 46);
        values.put("nama", "Tanoshi Ramen");
        values.put("location", "Jl. Margonda Raya No.234, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16423");
        values.put("latitude", -6.381633);
        values.put("longitude", 106.831069);
        values.put("open","10:00 - 22:00");
        values.put("tlp","(021) 77212750");
        values.put("menu",R.drawable.tanoshii);
        values.put("img", R.drawable.bgtanoshi);
        db.insert("restaurant", null, values);

        values.put("_id", 47);
        values.put("nama", "Pidie 2000");
        values.put("location", "Jalan Margonda Raya No. 399A, Beji, Pd. Cina, Depok, Kota Depok, Jawa Barat 16424");
        values.put("latitude", -6.358737);
        values.put("longitude", 106.833654);
        values.put("open","09:00 - 23:30");
        values.put("tlp","0816-1461-612");
        values.put("menu",R.drawable.pidie);
        values.put("img", R.drawable.bgpidie);
        db.insert("restaurant", null, values);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /*db.execSQL("DROP TABLE IF EXISTS restaurant");
        onCreate(db);*/

    }

    public void addItem(String nama, String lokasi, Double lat,Double lng, String open, int menu, int img,
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
        cursor = db.query("restaurant",projections,null,null,null,null,null);
        return cursor;
    }

}
