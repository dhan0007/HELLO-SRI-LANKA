package com.example.travelplannerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class north_western_p_places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_western_p_places);

        TextView tr =(TextView)findViewById(R.id.textView13;
        tr.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tw =(TextView)findViewById(R.id.textView14;
        tw.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ts =(TextView)findViewById(R.id.textView15;
        ts.setMovementMethod(LinkMovementMethod.getInstance());

        TextView trs =(TextView)findViewById(R.id.textView16;
        trs.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ta =(TextView)findViewById(R.id.textView17;
        ta.setMovementMethod(LinkMovementMethod.getInstance());
    }
}