package com.example.travelplannerapp;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class sabaragamuwa_p_places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabaragamuwa_p_places);

        TextView text = (TextView) findViewById(R.id.textView10;
        text.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tb = (TextView) findViewById(R.id.textView11;
        tb.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tbv = (TextView) findViewById(R.id.textView12;
        tbv.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tg = (TextView) findViewById(R.id.textView14;
        tg.setMovementMethod(LinkMovementMethod.getInstance());
    }
}