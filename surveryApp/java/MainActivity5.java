package com.example.surveryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    private RadioButton radio1, radio2, radio3, radio4, radio5;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        radio1 = findViewById(R.id.radioButton2);
        radio2 = findViewById(R.id.radioButton2);
        radio3 = findViewById(R.id.radioButton2);
        radio4 = findViewById(R.id.radioButton2);
        radio5 = findViewById(R.id.radioButton2);

        sendButton = findViewById(R.id.button);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity5.this,"Yanıtlarınız gönderilmiştir. \nTeşekkürler!",Toast.LENGTH_SHORT).show();
                finishAffinity();
            }
        });

    }
}