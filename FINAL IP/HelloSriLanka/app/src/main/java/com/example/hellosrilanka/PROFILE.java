package com.example.hellosrilanka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PROFILE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_r_o_f_i_l_e);

        getActionBar().setTitle("PROFILE");
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}