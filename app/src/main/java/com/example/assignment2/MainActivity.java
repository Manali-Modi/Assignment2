package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ListView lst1;
    ArrayList<String> states;
    SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss", Locale.getDefault());
    String currentTime;
    Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst1 = findViewById(R.id.lst1);
        btnnext = findViewById(R.id.btnnext);
        states = new ArrayList<>();

        currentTime = dateFormat.format(new Date());
        states.add("onCreate() - " + currentTime);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.state_list,states);
        lst1.setAdapter(adapter);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,GridView.class);
                i.putExtra("state",states);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        currentTime = dateFormat.format(new Date());
        states.add("onStart() - " + currentTime);
    }

    @Override
    protected void onResume() {
        super.onResume();
        currentTime = dateFormat.format(new Date());
        states.add("onResume() - " + currentTime);
    }

    @Override
    protected void onPause() {
        super.onPause();
        currentTime = dateFormat.format(new Date());
        states.add("onPause() - " + currentTime);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        currentTime = dateFormat.format(new Date());
        states.add("onRestart() - " + currentTime);
    }

    @Override
    protected void onStop() {
        super.onStop();
        currentTime = dateFormat.format(new Date());
        states.add("onStop() - " + currentTime);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        currentTime = dateFormat.format(new Date());
        states.add("onDestroy() - " + currentTime);
    }
}