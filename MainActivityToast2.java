package com.example.toast2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addClickOnButton();
    }

    private void addClickOnButton() {
        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "Właśnie mnie kliknąłeś", Toast.LENGTH_SHORT).show());

    }
} 