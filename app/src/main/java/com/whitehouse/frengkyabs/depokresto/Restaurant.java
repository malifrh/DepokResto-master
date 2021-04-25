package com.whitehouse.frengkyabs.depokresto;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Restaurant extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);


        getSupportActionBar().setTitle("LOCATION");


        ImageButton margonda = (ImageButton) findViewById(R.id.btn1);
        ImageButton klpdua = (ImageButton) findViewById(R.id.btn2);
        margonda.setOnClickListener(this);
        klpdua.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent move = new Intent(this, Margonda.class);
                startActivity(move);
                break;
            case R.id.btn2:
                Intent move2 = new Intent(this, KelapaDua.class);
                startActivity(move2);
                break;
        }
    }
}