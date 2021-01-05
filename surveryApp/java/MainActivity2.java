package com.example.surveryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity2 extends AppCompatActivity {
    private CheckBox check1, check2, check3, check4, check5;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        check1 = findViewById(R.id.checkBox1);
        check2 = findViewById(R.id.checkBox2);
        check3 = findViewById(R.id.checkBox3);
        check4 = findViewById(R.id.checkBox4);
        check5 = findViewById(R.id.checkBox5);

        nextButton = findViewById(R.id.button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent continueTo = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(continueTo);
            }
        });

    }
}