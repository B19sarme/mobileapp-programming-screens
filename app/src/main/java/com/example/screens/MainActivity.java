package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
    }
}
