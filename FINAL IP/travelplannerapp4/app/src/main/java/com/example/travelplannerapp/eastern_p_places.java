package com.example.travelplannerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class eastern_p_places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eastern_p_places);

        TextView tm =(TextView)findViewById(R.id.textView14;
        tm.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tk =(TextView)findViewById(R.id.textView15;
        tk.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tb =(TextView)findViewById(R.id.textView16;
        tb.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tbb =(TextView)findViewById(R.id.textView17;
        tbb.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tjb =(TextView)findViewById(R.id.textView19;
        tjb.setMovementMethod(LinkMovementMethod.getInstance());
    }
}