package com.example.travelplannerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class testing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());


        TextView text=(TextView)findViewById(R.id.textView10;
        text.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t=(TextView)findViewById(R.id.textView11;
        t.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tt =(TextView)findViewById(R.id.textView12;
        tt.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tm =(TextView)findViewById(R.id.textView14;
        tm.setMovementMethod(LinkMovementMethod.getInstance());
    }
}