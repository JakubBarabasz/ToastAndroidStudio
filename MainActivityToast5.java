package com.example.toast5;

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

    public static int fib(int funcValue){
        if(funcValue==0){
            return 0;
        }
        else if(funcValue==1){
            return 1;
        }
        else{
            return fib(funcValue-1)+fib(funcValue-2);
        }
    }


    int counter = 0;
    private void addClickOnButton() {

        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),String.valueOf(fib(counter)), Toast.LENGTH_SHORT).show();
                counter++;
            }

        });

    }
}