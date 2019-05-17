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
        final ToggleButton toggle_1 = (ToggleButton) findViewById(R.id.Button_1);
        final ToggleButton toggle_2 = (ToggleButton) findViewById(R.id.Button_2);
        final ToggleButton toggle_3 = (ToggleButton) findViewById(R.id.Button_3);
        final ToggleButton toggle_4 = (ToggleButton) findViewById(R.id.Button_4);
        final ToggleButton toggle_5 = (ToggleButton) findViewById(R.id.Button_5);
        final ToggleButton toggle_6 = (ToggleButton) findViewById(R.id.Button_6);
        final ToggleButton toggle_7 = (ToggleButton) findViewById(R.id.Button_7);
        final ToggleButton toggle_8 = (ToggleButton) findViewById(R.id.Button_8);
        final ToggleButton toggle_9 = (ToggleButton) findViewById(R.id.Button_9);
        final ToggleButton toggle_10 = (ToggleButton) findViewById(R.id.Button_10); //true
        final ToggleButton toggle_11 = (ToggleButton) findViewById(R.id.Button_11); //false





        final Button complete = findViewById(R.id.Finished);
        final Button reset = findViewById(R.id.Reset);



        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggle_1.isChecked() && toggle_2.isChecked() && toggle_3.isChecked() && toggle_4.isChecked() && toggle_5.isChecked() && toggle_6.isChecked() && toggle_7.isChecked() && toggle_8.isChecked() && toggle_9.isChecked() ){
                    Toast.makeText(MainActivity.this, "A winner is UwU", Toast.LENGTH_SHORT).show();

                } else{
                    Toast.makeText(MainActivity.this, "Try again", Toast.LENGTH_SHORT).show();

                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggle_1.setChecked(false);
                toggle_2.setChecked(false);
                toggle_3.setChecked(false);
                toggle_4.setChecked(false);
                toggle_5.setChecked(false);
                toggle_6.setChecked(false);
                toggle_7.setChecked(false);
                toggle_8.setChecked(false);
                toggle_9.setChecked(false);
            }
        });


        toggle_10.setEnabled(false);
        toggle_11.setEnabled(false);


        toggle_1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(toggle_7.isChecked()){
                    toggle_7.setChecked(false);
                }else{
                    toggle_7.setChecked(true);
                }

                if(toggle_9.isChecked()){
                    toggle_9.setChecked(false);
                }else{
                    toggle_9.setChecked(true);
                }

                // your click actions go here
            }
        });

        toggle_2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(toggle_3.isChecked()){
                    toggle_3.setChecked(false);
                }else{
                    toggle_3.setChecked(true);
                }

                if(toggle_5.isChecked()){
                    toggle_5.setChecked(false);
                }else{
                    toggle_5.setChecked(true);
                }

                // your click actions go here
            }
        });

        toggle_3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(toggle_2.isChecked()){
                    toggle_2.setChecked(false);
                }else{
                    toggle_2.setChecked(true);
                }

                if(toggle_4.isChecked()){
                    toggle_4.setChecked(false);
                }else{
                    toggle_4.setChecked(true);
                }
                if(toggle_6.isChecked()){
                    toggle_6.setChecked(false);
                }else{
                    toggle_6.setChecked(true);
                }

                // your click actions go here
            }
        });

        toggle_4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(toggle_3.isChecked()){
                    toggle_3.setChecked(false);
                }else{
                    toggle_3.setChecked(true);
                }

                if(toggle_7.isChecked()){
                    toggle_7.setChecked(false);
                }else{
                    toggle_7.setChecked(true);
                }

                // your click actions go here
            }
        });

        toggle_5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(toggle_2.isChecked()){
                    toggle_2.setChecked(false);
                }else{
                    toggle_2.setChecked(true);
                }

                if(toggle_6.isChecked()){
                    toggle_6.setChecked(false);
                }else{
                    toggle_6.setChecked(true);
                }
                if(toggle_8.isChecked()){
                    toggle_8.setChecked(false);
                }else{
                    toggle_8.setChecked(true);
                }

                // your click actions go here
            }
        });

        toggle_6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(toggle_3.isChecked()){
                    toggle_3.setChecked(false);
                }else{
                    toggle_3.setChecked(true);
                }

                if(toggle_5.isChecked()){
                    toggle_5.setChecked(false);
                }else{
                    toggle_5.setChecked(true);
                }
                if(toggle_7.isChecked()){
                    toggle_7.setChecked(false);
                }else{
                    toggle_7.setChecked(true);
                }

                if(toggle_9.isChecked()){
                    toggle_9.setChecked(false);
                }else{
                    toggle_9.setChecked(true);
                }

                // your click actions go here
            }
        });

        toggle_7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(toggle_1.isChecked()){
                    toggle_1.setChecked(false);
                }else{
                    toggle_1.setChecked(true);
                }

                if(toggle_4.isChecked()){
                    toggle_4.setChecked(false);
                }else{
                    toggle_4.setChecked(true);
                }
                if(toggle_6.isChecked()){
                    toggle_6.setChecked(false);
                }else{
                    toggle_6.setChecked(true);
                }

                // your click actions go here
            }
        });

        toggle_8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(toggle_5.isChecked()){
                    toggle_5.setChecked(false);
                }else{
                    toggle_5.setChecked(true);
                }

                if(toggle_9.isChecked()){
                    toggle_9.setChecked(false);
                }else{
                    toggle_9.setChecked(true);
                }
            }
        });

        toggle_9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(toggle_1.isChecked()){
                    toggle_1.setChecked(false);
                }else{
                    toggle_1.setChecked(true);
                }

                if(toggle_6.isChecked()){
                    toggle_6.setChecked(false);
                }else{
                    toggle_6.setChecked(true);
                }
                if(toggle_8.isChecked()){
                    toggle_8.setChecked(false);
                }else{
                    toggle_8.setChecked(true);
                }



                // your click actions go here
            }
        });



    }













}
