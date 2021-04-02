package com.example.hellosrilanka;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SIGNUP extends AppCompatActivity implements View.OnClickListener {

    private EditText  name, pnumber, email, password;
    private TextView already;
    private Button create;
    private ProgressBar progressBar;
    private FirebaseAuth HelloSriLAnka;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_i_g_n_u_p);

        HelloSriLAnka = FirebaseAuth.getInstance();

        getSupportActionBar().setTitle("SIGN UP");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        already = (TextView) findViewById(R.id.Already);
        already.setOnClickListener(this);

        create=findViewById(R.id.Create);
        create.setOnClickListener(this);

        name=findViewById(R.id.Name);
        pnumber=findViewById(R.id.Pnumber);
        email=findViewById(R.id.Email);
        password=findViewById(R.id.Password);

        progressBar=findViewById(R.id.Progressbar);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Already:
                startActivity(new Intent(this, LOGIN.class));
                break;
            case R.id.Create:
                create();
                break;

    }
}

    private void create() {
        String Email = email.getText().toString().trim();
        String  Name= name.getText().toString().trim();
        String Password = password.getText().toString().trim();
        String Pnumber = pnumber.getText().toString().trim();

        if(Name.isEmpty()){
            name.setError("Your full name is required");
            name.requestFocus();
            return;
        }
        if(Email.isEmpty()){
            email.setError("Your Email is required");
            email.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(Email).matches()){
        name.setError("Please Enter a valid email");
        name.requestFocus();
        return;
    }

        if(Pnumber.isEmpty()){
            pnumber.setError("Your Phone Number is required");
            pnumber.requestFocus();
            return;
        }
        if(Password.isEmpty()) {
            password.setError("Password is required");
            password.requestFocus();
            return;
        }

        if(Password.length()<8) {
        password.setError("Minimum Password length is 8 characters");
        password.requestFocus();
        return;
    }

                    }
                }





