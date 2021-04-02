package com.example.hellosrilanka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class FEEDBACK extends AppCompatActivity {

    private EditText Name,Email,Messege;
    private Spinner Feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_e_e_d_b_a_c_k);

        getSupportActionBar().setTitle("FEEDBACK");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}