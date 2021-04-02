package com.example.travelplannerapp;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class north_central_p_places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_central_p_places);

        TextView tg = (TextView) findViewById(R.id.textView10;
        tg.setMovementMethod(LinkMovementMethod.getInstance());

        TextView th = (TextView) findViewById(R.id.textView20;
        th.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tm = (TextView) findViewById(R.id.textView21;
        tm.setMovementMethod(LinkMovementMethod.getInstance());

        TextView thv = (TextView) findViewById(R.id.textView22;
        thv.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tgr = (TextView) findViewById(R.id.textView5;
        tgr.setMovementMethod(LinkMovementMethod.getInstance());
    }
}