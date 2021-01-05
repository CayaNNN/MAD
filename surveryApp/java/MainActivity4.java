package com.example.surveryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity4 extends AppCompatActivity {
    private RadioButton radio1, radio2, radio3, radio4, radio5;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        radio1 = findViewById(R.id.radioButton2);
        radio2 = findViewById(R.id.radioButton2);
        radio3 = findViewById(R.id.radioButton2);
        radio4 = findViewById(R.id.radioButton2);
        radio5 = findViewById(R.id.radioButton2);

        nextButton = findViewById(R.id.button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent continueTo = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(continueTo);
            }
        });

    }
}