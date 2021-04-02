package com.example.hellosrilanka;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MAINMENU extends AppCompatActivity {
    public Button srilanka;
    public Button places;
    public Button calculator;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        srilanka = findViewById(R.id.SRILANKA);
        srilanka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MAINMENU.this,SRILANKA.class);
                startActivity(intent1);
            }
        });

        places = findViewById(R.id.PLACES);
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MAINMENU.this,PROVINCES.class);
                startActivity(intent2);
            }
        });

        calculator=findViewById(R.id.BUDGET);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MAINMENU.this,BUDGETPLANNER.class);
                startActivity(intent3);
            }
        });

        drawerLayout= findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.drawer);
        toolbar=findViewById(R.id.Toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(MAINMENU.this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


    }
}