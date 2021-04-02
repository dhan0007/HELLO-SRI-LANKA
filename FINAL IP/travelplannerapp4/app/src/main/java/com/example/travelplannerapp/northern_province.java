package com.example.travelplannerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class northern_province extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_northern_province);

        TextView text=(TextView)findViewById(R.id.textView10;
        text.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tn=(TextView)findViewById(R.id.textView11;
        tn.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tm=(TextView)findViewById(R.id.textView12;
        tm.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tj=(TextView)findViewById(R.id.textView13;
        tj.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tv=(TextView)findViewById(R.id.textView14;
        tv.setMovementMethod(LinkMovementMethod.getInstance());
    }
}