package com.example.hellosrilanka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BUDGETPLANNER extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_u_d_g_e_t_p_l_a_n_n_e_r);

        getSupportActionBar().setTitle("BUDGET PLANNER");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}