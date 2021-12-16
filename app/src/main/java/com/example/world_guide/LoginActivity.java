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
    EditText userid;
    EditText userpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button = findViewById(R.id.loginBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginProcess(view);
            }
        });
        userid = findViewById(R.id.userid);
        userpass = findViewById(R.id.userpass);
    }

    public void loginProcess(View v)
    {
        String uid = userid.getText().toString();
        String upass = userpass.getText().toString();
        if(uid.equals("ria") && upass.equals("2021")){
            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "로그인 정보가 틀렸습니다.", Toast.LENGTH_SHORT).show();
            userid.setText("");
            userpass.setText("");
        }
    }
}
