package com.example.huichuan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et_password;
    private Button button_send;
    private EditText et_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name =(EditText) findViewById(R.id.et_name);
        et_password =(EditText) findViewById(R.id.et_password);
        button_send = (Button) findViewById(R.id.button_send);
        button_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passData();
            }
        });
    }
    public void passData() {
        Intent intent = new Intent(this, ShowActivity.class);
        intent.putExtra("name", et_name.getText().toString().trim());
        intent.putExtra("password", et_password.getText().toString().trim());
        startActivity(intent);
    }
}
