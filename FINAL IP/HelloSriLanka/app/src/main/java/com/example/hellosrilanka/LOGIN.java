package com.example.hellosrilanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LOGIN extends AppCompatActivity implements View.OnClickListener {

    private TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_o_g_i_n);

        getSupportActionBar().setTitle("LOG IN");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        register =(TextView) findViewById(R.id.Register);
        register.setOnClickListener(this);

            }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.Register:
                startActivity(new Intent(this,SIGNUP.class));
                break;
    }
}
}