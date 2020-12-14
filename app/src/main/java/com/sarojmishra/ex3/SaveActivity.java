package com.sarojmishra.ex3;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SaveActivity extends AppCompatActivity {

    Button saveBusStop;
    Button saveBusRoute;
    EditText editText;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_activity);

        editText = findViewById(R.id.StopNumber);
        editText1 = findViewById(R.id.StopName);
        editText2 = findViewById(R.id.StopKeywords);

        saveBusStop = findViewById(R.id.busStopBtn);
        saveBusStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveToDatabse();
            }
        });

        editText3 = findViewById(R.id.RouteNumber);
        editText4 = findViewById(R.id.RouteName);

        saveBusRoute = findViewById(R.id.busRouteBtn);
        saveBusRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveToDatabse1();

            }
        });
    }

    public void saveToDatabse(){
       String StopNum = editText.getText().toString();
        String stopName = editText1.getText().toString();
        String Keyword =editText2.getText().toString();
       // insert into db values(busNum,busstop,busRoute);


        Log.d("Edittext",editText.getText().toString() + editText1.getText() + editText2.getText());
    }

    public void saveToDatabse1(){
        String RouteNum = editText3.getText().toString();
        String route = editText4.getText().toString();
        // insert into db values(busNum,busstop,busRoute);


        Log.d("Edittext",editText3.getText().toString() + editText4.getText());
    }
}
