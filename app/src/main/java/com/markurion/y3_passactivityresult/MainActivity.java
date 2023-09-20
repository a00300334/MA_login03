package com.markurion.y3_passactivityresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String USER_NAME = "MainActivity.username";
    public static final String USER_PASSWORD = "MainActivity.password";
    public static final int REQUEST_CODE = 123;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Submit(View view) {
        String username = ((EditText)findViewById(R.id.editText_user)).getText().toString();

        //Or by doing this
        EditText passwordEditText = findViewById(R.id.editText_pass);
        String password = passwordEditText.getText().toString();

        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra(USER_NAME, username);
        intent.putExtra(USER_PASSWORD, password);

        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE){
            if(resultCode == RESULT_OK){
                Toast.makeText(this, "Login Correct", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Incorecct Try Again!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}