package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the button
        Button btnStartSecondActivity = findViewById(R.id.btnStartSecondActivity);

        // Set OnClickListener for the button
        btnStartSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // Add data to the Intent extras
                String message = "Hello from MainActivity!";
                intent.putExtra("message", message);

                startActivity(intent);
            }
        });

        // Get the Intent that started this activity and its extras
        Intent intent = getIntent();
        if (intent != null) {
            String message = intent.getStringExtra("message");
            if (message != null) {
                // Update the TextView with the message
                TextView textViewMessage = findViewById(R.id.textViewMessage);
                textViewMessage.setText(message);
            }
        }
    }
}
