package com.example.hellosrilanka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SRILANKA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_r_i_l_a_n_k);

        getSupportActionBar().setTitle("SRI LANKA");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}