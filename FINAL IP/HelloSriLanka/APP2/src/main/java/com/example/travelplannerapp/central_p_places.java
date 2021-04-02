package com.example.travelplannerapp;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class central_p_places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central_p_places);

        TextView tmap = (TextView) findViewById(R.id.textView10;
        tmap.setMovementMethod(LinkMovementMethod.getInstance());

        TextView td = (TextView) findViewById(R.id.textView11;
        td.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tdm = (TextView) findViewById(R.id.textView12;
        tdm.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tgk = (TextView) findViewById(R.id.textView13;
        tgk.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tlg = (TextView) findViewById(R.id.textView14;
        tlg.setMovementMethod(LinkMovementMethod.getInstance());


    }
}