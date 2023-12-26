package com.example.belyanin_14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.buttonenter);
        btn.setOnClickListener(this);

    }

    public void onClick(View view) {
        Intent intent;
        intent = new Intent(MainActivity.this, Glavniy.class);
        if (view.getId() == R.id.buttonenter)
        {
            startActivity(intent);
        }
    }
}