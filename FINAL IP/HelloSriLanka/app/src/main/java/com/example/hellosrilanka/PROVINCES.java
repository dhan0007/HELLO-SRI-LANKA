package com.example.hellosrilanka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class PROVINCES extends AppCompatActivity {
    Button northern,western,eastern,southern,central;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_r_o_v_i_n_c_e_s);

        getSupportActionBar().setTitle("PROVINCES");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}