package com.example.lightsout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    Button[] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button buttons[] = new Button[9];
        buttons[0] = (ToggleButton)findViewById(R.id.Button_1);
        buttons[1] = (ToggleButton)findViewById(R.id.Button_2);
        buttons[2] = (ToggleButton)findViewById(R.id.Button_3);
        buttons[3] = (ToggleButton)findViewById(R.id.Button_4);
        buttons[4] = (ToggleButton)findViewById(R.id.Button_5);
        buttons[5] = (ToggleButton)findViewById(R.id.Button_6);
        buttons[6] = (ToggleButton)findViewById(R.id.Button_7);
        buttons[7] = (ToggleButton)findViewById(R.id.Button_8);
        buttons[8] = (ToggleButton)findViewById(R.id.Button_9);

        final Button complete = findViewById(R.id.Finished);



        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttons.toString() == "on"){
                    Toast toast = Toast.makeText("A winner is you!",Toast.LENGTH_LONG).show();

                }
            }
        });
    }











}
