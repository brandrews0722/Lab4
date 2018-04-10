package com.example.brandrews.lab4_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Index extends AppCompatActivity {

    Button helpBtn;
    Button settingsBtn;
    Button homeBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        helpBtn = (Button) findViewById(R.id.btn_Help);
        settingsBtn = (Button) findViewById(R.id.btn_Settings);
        homeBtn = (Button) findViewById(R.id.btn_HomePage);

        helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpIntent = new Intent(Index.this, Help.class);
                startActivity(helpIntent);
            }
        });

        settingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(Index.this, Settings.class);
                startActivity(settingsIntent);
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(Index.this, Home.class);
                startActivity(homeIntent);
            }
        });
    }
}
