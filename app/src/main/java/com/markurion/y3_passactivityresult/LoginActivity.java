package com.markurion.y3_passactivityresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = getIntent();
        String userName = intent.getStringExtra(MainActivity.USER_NAME);
        String password = intent.getStringExtra(MainActivity.USER_PASSWORD);

        if( userName.equals("admin") && password.equals("pass") ){
            setResult(RESULT_OK);
        }else{
            setResult(RESULT_CANCELED);
        }

        //Finish the activity
        finish();

    }
}