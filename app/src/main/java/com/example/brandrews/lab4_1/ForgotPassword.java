package com.example.brandrews.lab4_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {

    Button forgotBtn;
    EditText userText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        forgotBtn = (Button) findViewById(R.id.btn_forgot);
        userText = (EditText) findViewById(R.id.forgot_user);

        forgotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = ((Globals) getApplication()).retrievePassword(userText.getText().toString());

                if (password == ""){
                    Toast.makeText(ForgotPassword.this, "Cannot Find Password", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(ForgotPassword.this, "Your Password Is: " + password, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
