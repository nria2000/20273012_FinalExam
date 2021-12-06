package com.example.world_guide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MenuActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_CUSTOMER = 201;
    public static final int REQUEST_CODE_REVENUE = 202;
    public static final int REQUEST_CODE_PRODUCT = 203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // process received intent
        Intent receivedIntent = getIntent();
        String username = receivedIntent.getStringExtra("ria");
        String password = receivedIntent.getStringExtra("1234");


        ImageButton imageButton01 = (ImageButton) findViewById(R.id.imageButton01);
        imageButton01.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ko.wikipedia.org/wiki/%EB%8C%80%ED%95%9C%EB%AF%BC%EA%B5%AD"));

                startActivityForResult(intent, REQUEST_CODE_CUSTOMER);
            }
        });

        ImageButton imageButton02 = (ImageButton) findViewById(R.id.imageButton02);
        imageButton02.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ko.wikipedia.org/wiki/%EC%9D%BC%EB%B3%B8"));

                startActivityForResult(intent, REQUEST_CODE_REVENUE);
            }
        });

        ImageButton imageButton03 = (ImageButton) findViewById(R.id.imageButton03);
        imageButton03.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ko.wikipedia.org/wiki/%EC%9D%B4%ED%83%88%EB%A6%AC%EC%95%84"));

                startActivityForResult(intent, REQUEST_CODE_PRODUCT);
            }
        });
        ImageButton imageButton04 = (ImageButton) findViewById(R.id.imageButton04);
        imageButton04.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ko.wikipedia.org/wiki/%EB%9F%AC%EC%8B%9C%EC%95%84"));

                startActivityForResult(intent, REQUEST_CODE_PRODUCT);
            }
        });

    }

}