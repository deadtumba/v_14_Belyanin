package com.example.belyanin_14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Glavniy extends AppCompatActivity  implements View.OnClickListener {
    ImageButton exit, search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glavniy);
        exit = findViewById(R.id.imageButton);
        search = findViewById(R.id.imageButton2);
        exit.setOnClickListener(this);
        search.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.imageButton) {
            startActivity(new Intent(this, MainActivity.class));
        }
        if (view.getId() == R.id.imageButton2)
        {
            startActivity(new Intent(this, Search.class));
        }
    }


}