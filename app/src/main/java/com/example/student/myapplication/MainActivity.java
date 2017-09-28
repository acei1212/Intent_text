package com.example.student.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final int Request_code_input1 = 321; //設定Request_code

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v) {
        Intent it = new Intent(MainActivity.this, SecActivity.class);
        startActivityForResult(it, Request_code_input1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

       //認証Request_code
        if (requestCode == Request_code_input1) {
            //避免不按Button結束而錯誤
            if (resultCode == RESULT_OK) {
                Toast.makeText(MainActivity.this, data.getStringExtra("user_input"), Toast.LENGTH_SHORT).show();
            }

        }
    }
}
