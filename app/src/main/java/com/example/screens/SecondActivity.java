package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get the Intent that started this activity and its extras
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        // Update the TextView with the message
        TextView textViewMessage = findViewById(R.id.textViewMessage);
        textViewMessage.setText(message);
    }
}
