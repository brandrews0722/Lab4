package com.example.brandrews.lab4_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class User extends AppCompatActivity{

    Button submitBtn;
    EditText userText;
    EditText passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        submitBtn = (Button) findViewById(R.id.btn_submit);
        userText = (EditText) findViewById(R.id.user_login_email);
        passwordText = (EditText) findViewById(R.id.user_password);

        submitBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ((Globals) getApplication()).setUser(userText.getText().toString(), passwordText.getText().toString());
                Intent intent = new Intent(User.this, Index.class);
                startActivity(intent);
                setContentView(R.layout.activity_index);
            }
        });


    }
};

