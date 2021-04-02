package com.example.travelplannerapp;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class uva_p_places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uva_p_places);

        TextView text = (TextView) findViewById(R.id.textView10;
        text.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tn = (TextView) findViewById(R.id.textView11;
        tn.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tl = (TextView) findViewById(R.id.textView13;
        tl.setMovementMethod(LinkMovementMethod.getInstance());

        TextView th = (TextView) findViewById(R.id.textView14;
        th.setMovementMethod(LinkMovementMethod.getInstance());
    }
}