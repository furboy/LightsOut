package com.example.lightsout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.lang.reflect.Array;
import java.util.Arrays;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    Boolean[] State;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Boolean state[] = new Boolean[9];
        state[0] = false;
        state[1] = false;
        state[2] = false;
        state[3] = false;
        state[4] = false;
        state[5] = false;
        state[6] = false;
        state[7] = false;
        state[8] = false;




        final Button complete = findViewById(R.id.Finished);



        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Arrays. == "on"){
                    Toast.makeText(MainActivity.this, "A winner is UwU", Toast.LENGTH_SHORT).show();

                } else{
                    Toast.makeText(MainActivity.this, "Try again", Toast.LENGTH_SHORT).show();

                }
            }
        });
        ToggleButton toggle = (ToggleButton) findViewById(R.id.Button_1);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //https://developer.android.com/guide/topics/ui/controls/togglebutton#java
                } else {
                    // The toggle is disabled
                }
            }
        });



    }











}
