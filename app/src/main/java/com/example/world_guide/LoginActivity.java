package com.example.world_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 101;
        EditText userid;
        EditText userpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String username = userid.getText().toString();
                String password = userpass.getText().toString();

                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                intent.putExtra("ria", username);
                intent.putExtra("1234", password);

                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });

        userid = findViewById(R.id.userid);
        userpass = findViewById(R.id.userpass);
    }
}
