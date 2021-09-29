package com.example.toast4;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addClickOnButton();
    }

    public static int wynik(int silnia){
        if(silnia==1){
            return silnia;
        }
        else{
            return silnia*wynik(silnia-1);
        }
    }


    int counter = 1;
    private void addClickOnButton() {

        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),String.valueOf(wynik(counter)), Toast.LENGTH_SHORT).show();
                counter++;
            }

        });

    }
} 