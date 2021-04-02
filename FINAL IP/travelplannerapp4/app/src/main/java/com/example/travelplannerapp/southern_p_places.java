package com.example.travelplannerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class southern_p_places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_southern_p_places);

        TextView ts=(TextView)findViewById(R.id.textView11;
        ts.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tsr=(TextView)findViewById(R.id.textView12;
        tsr.setMovementMethod(LinkMovementMethod.getInstance());

        TextView th=(TextView)findViewById(R.id.textView13;
        th.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tl=(TextView)findViewById(R.id.textView14;
        tl.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tls=(TextView)findViewById(R.id.textView15;
        tls.setMovementMethod(LinkMovementMethod.getInstance());
    }
}