package com.sarojmishra.ex3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {
    Button newButton;
    Button searchBtn;
    Button listBusBtn;
    Button listRouteBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextactivity);

        newButton = findViewById(R.id.nextButton);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SaveActivity.class);
                startActivity(intent);
            }
        });
        searchBtn = findViewById(R.id.searchBtn);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ItinerarySearchActivity.class);
                startActivity(intent);
            }
        });
        listBusBtn = findViewById(R.id.busStopBtn);
        listBusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ListActivity.class);
                startActivity(intent);
            }
        });
        listRouteBtn = findViewById(R.id.busRouteBtn);
        listRouteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ListActivity.class);
                startActivity(intent);
            }
        });


    }
}