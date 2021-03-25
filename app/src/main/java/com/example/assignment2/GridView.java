package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;

public class GridView extends AppCompatActivity {

    android.widget.GridView grdstate;
    ArrayList<String> state;
    Button btnshare;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        grdstate = findViewById(R.id.grdstate);
        btnshare = findViewById(R.id.btnshare);
        state = new ArrayList<String>();

        Bundle bundle = getIntent().getExtras();
        state = bundle.getStringArrayList("state");

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,R.layout.state_list,state);
        grdstate.setAdapter(adp);

        /*btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.valueOf(state)));
                startActivityForResult(intent,0);
            }
        });*/
    }

}