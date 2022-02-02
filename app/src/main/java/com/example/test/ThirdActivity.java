package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class ThirdActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textView = findViewById(R.id.textView);

        String st = getIntent().getStringExtra("key");
        st = st.replace("\n", " ");
        String[] stt = st.split("\\s+");
        int count = stt.length - 2;
        textView.setText("Jūsų įvestam tekste yra " + String.valueOf(count) + " žodžiai(-ių)");
    }
}