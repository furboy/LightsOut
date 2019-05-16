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
        final boolean[] state = new boolean[9];
        state[0] = false;
        state[1] = false;
        state[2] = false;
        state[3] = false;
        state[4] = false;
        state[5] = false;
        state[6] = false;
        state[7] = false;
        state[8] = false;
        final boolean[] win = new boolean[9];
        win[0] = true;
        win[1] = true;
        win[2] = true;
        win[3] = true;
        win[4] = true;
        win[5] = true;
        win[6] = true;
        win[7] = true;
        win[8] = true;





        final Button complete = findViewById(R.id.Finished);



        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Arrays.equals(state,win)){
                    Toast.makeText(MainActivity.this, "A winner is UwU", Toast.LENGTH_SHORT).show();

                } else{
                    Toast.makeText(MainActivity.this, "Try again", Toast.LENGTH_SHORT).show();

                }
            }
        });
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

        toggle_10.setEnabled(false);
        toggle_11.setEnabled(false);


        toggle_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //https://developer.android.com/guide/topics/ui/controls/togglebutton#java



                    toggle_2.setEnabled(false);
                    toggle_3.setEnabled(false);
                    toggle_4.setEnabled(false);
                    toggle_5.setEnabled(false);
                    toggle_6.setEnabled(false);

                    toggle_8.setEnabled(false);

                    if (toggle_9 == toggle_10) {
                        toggle_9.setChecked(false);
                    } else{
                        toggle_9.setChecked(true);
                    }
                    if (toggle_7 == toggle_10) {
                        toggle_7.setChecked(false);
                    } else{
                        toggle_7.setChecked(true);
                    }

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);
                    toggle_2.setEnabled(true);
                    toggle_3.setEnabled(true);
                    toggle_4.setEnabled(true);
                    toggle_5.setEnabled(true);
                    toggle_6.setEnabled(true);
                    toggle_7.setEnabled(true);
                    toggle_8.setEnabled(true);
                    toggle_9.setEnabled(true);


                    state[0] = true;
                } else {
                    // The toggle is disabled
                    state[0] = false;



                    toggle_2.setEnabled(false);
                    toggle_3.setEnabled(false);
                    toggle_4.setEnabled(false);
                    toggle_5.setEnabled(false);
                    toggle_6.setEnabled(false);

                    toggle_8.setEnabled(false);

                    if (toggle_9 == toggle_11) {
                        toggle_9.setChecked(true);
                    } else{
                        toggle_9.setChecked(false);
                    }
                    if (toggle_7 == toggle_11) {
                        toggle_7.setChecked(true);
                    } else{
                        toggle_7.setChecked(false);
                    }




                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);
                    toggle_2.setEnabled(true);
                    toggle_3.setEnabled(true);
                    toggle_4.setEnabled(true);
                    toggle_5.setEnabled(true);
                    toggle_6.setEnabled(true);
                    toggle_7.setEnabled(true);
                    toggle_8.setEnabled(true);
                    toggle_9.setEnabled(true);

                }
            }
        });
        toggle_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //https://developer.android.com/guide/topics/ui/controls/togglebutton#java


                    toggle_1.setEnabled(false);


                    toggle_4.setEnabled(false);

                    toggle_6.setEnabled(false);
                    toggle_7.setEnabled(false);
                    toggle_8.setEnabled(false);
                    toggle_9.setEnabled(false);


                    if (toggle_5 == toggle_10) {
                        toggle_5.setChecked(false);
                    } else{
                        toggle_5.setChecked(true);
                    }
                    if (toggle_3 == toggle_10) {
                        toggle_3.setChecked(false);
                    } else{
                        toggle_3.setChecked(true);
                    }

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);
                    toggle_2.setEnabled(true);
                    toggle_3.setEnabled(true);
                    toggle_4.setEnabled(true);
                    toggle_5.setEnabled(true);
                    toggle_6.setEnabled(true);
                    toggle_7.setEnabled(true);
                    toggle_8.setEnabled(true);
                    toggle_9.setEnabled(true);

                    state[1] = true;
                } else {
                    // The toggle is disabled
                    state[1] = false;


                    toggle_1.setEnabled(false);


                    toggle_4.setEnabled(false);

                    toggle_6.setEnabled(false);
                    toggle_7.setEnabled(false);
                    toggle_8.setEnabled(false);
                    toggle_9.setEnabled(false);

                    if (toggle_5 == toggle_11) {
                        toggle_5.setChecked(true);
                    } else{
                        toggle_5.setChecked(false);
                    }
                    if (toggle_3 == toggle_11) {
                        toggle_3.setChecked(true);
                    } else{
                        toggle_3.setChecked(false);
                    }

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);
                    toggle_2.setEnabled(true);
                    toggle_3.setEnabled(true);
                    toggle_4.setEnabled(true);
                    toggle_5.setEnabled(true);
                    toggle_6.setEnabled(true);
                    toggle_7.setEnabled(true);
                    toggle_8.setEnabled(true);
                    toggle_9.setEnabled(true);

                }
            }
        });
        toggle_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //https://developer.android.com/guide/topics/ui/controls/togglebutton#java


                    toggle_1.setEnabled(false);



                    toggle_5.setEnabled(false);

                    toggle_7.setEnabled(false);
                    toggle_8.setEnabled(false);
                    toggle_9.setEnabled(false);

                    if (toggle_2 == toggle_10) {
                        toggle_2.setChecked(false);
                    } else{
                        toggle_2.setChecked(true);
                    }
                    if (toggle_6 == toggle_10) {
                        toggle_6.setChecked(false);
                    } else{
                        toggle_6.setChecked(true);
                    }
                    if (toggle_4 == toggle_10) {
                        toggle_4.setChecked(false);
                    } else{
                        toggle_4.setChecked(true);
                    }

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);
                    toggle_2.setEnabled(true);
                    toggle_3.setEnabled(true);
                    toggle_4.setEnabled(true);
                    toggle_5.setEnabled(true);
                    toggle_6.setEnabled(true);
                    toggle_7.setEnabled(true);
                    toggle_8.setEnabled(true);
                    toggle_9.setEnabled(true);

                    state[2] = true;
                } else {
                    // The toggle is disabled
                    state[2] = false;


                    toggle_1.setEnabled(false);



                    toggle_5.setEnabled(false);

                    toggle_7.setEnabled(false);
                    toggle_8.setEnabled(false);
                    toggle_9.setEnabled(false);

                    if (toggle_2 == toggle_11) {
                        toggle_2.setChecked(true);
                    } else{
                        toggle_2.setChecked(false);
                    }
                    if (toggle_6 == toggle_11) {
                        toggle_6.setChecked(true);
                    } else{
                        toggle_6.setChecked(false);
                    }
                    if (toggle_4 == toggle_11) {
                        toggle_4.setChecked(true);
                    } else{
                        toggle_4.setChecked(false);
                    }

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);
                    toggle_2.setEnabled(true);
                    toggle_3.setEnabled(true);
                    toggle_4.setEnabled(true);
                    toggle_5.setEnabled(true);
                    toggle_6.setEnabled(true);
                    toggle_7.setEnabled(true);
                    toggle_8.setEnabled(true);
                    toggle_9.setEnabled(true);
                }
            }
        });
        toggle_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //https://developer.android.com/guide/topics/ui/controls/togglebutton#java

                    toggle_1.setEnabled(false);
                    toggle_2.setEnabled(false);


                    toggle_5.setEnabled(false);
                    toggle_6.setEnabled(false);

                    toggle_8.setEnabled(false);
                    toggle_9.setEnabled(false);

                    if (toggle_3 == toggle_10) {
                        toggle_3.setChecked(false);
                    } else{
                        toggle_3.setChecked(true);
                    }
                    if (toggle_7 == toggle_10) {
                        toggle_7.setChecked(false);
                    } else{
                        toggle_7.setChecked(true);
                    }

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);
                    toggle_2.setEnabled(true);
                    toggle_3.setEnabled(true);
                    toggle_4.setEnabled(true);
                    toggle_5.setEnabled(true);
                    toggle_6.setEnabled(true);
                    toggle_7.setEnabled(true);
                    toggle_8.setEnabled(true);
                    toggle_9.setEnabled(true);

                    state[3] = true;
                } else {
                    // The toggle is disabled
                    state[3] = false;


                    toggle_1.setEnabled(false);
                    toggle_2.setEnabled(false);


                    toggle_5.setEnabled(false);
                    toggle_6.setEnabled(false);

                    toggle_8.setEnabled(false);
                    toggle_9.setEnabled(false);

                    if (toggle_3 == toggle_11) {
                        toggle_3.setChecked(true);
                    } else{
                        toggle_3.setChecked(false);
                    }
                    if (toggle_7 == toggle_11) {
                        toggle_7.setChecked(true);
                    } else{
                        toggle_7.setChecked(false);
                    }

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);
                    toggle_2.setEnabled(true);
                    toggle_3.setEnabled(true);
                    toggle_4.setEnabled(true);
                    toggle_5.setEnabled(true);
                    toggle_6.setEnabled(true);
                    toggle_7.setEnabled(true);
                    toggle_8.setEnabled(true);
                    toggle_9.setEnabled(true);
                }
            }
        });
        toggle_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //https://developer.android.com/guide/topics/ui/controls/togglebutton#java


                    toggle_1.setEnabled(false);

                    toggle_3.setEnabled(false);
                    toggle_4.setEnabled(false);


                    toggle_7.setEnabled(false);

                    toggle_9.setEnabled(false);

                    if (toggle_2 == toggle_10) {
                        toggle_2.setChecked(false);
                    } else{
                        toggle_2.setChecked(true);
                    }
                    if (toggle_6 == toggle_10) {
                        toggle_6.setChecked(false);
                    } else{
                        toggle_6.setChecked(true);
                    }
                    if (toggle_8 == toggle_10) {
                        toggle_8.setChecked(false);
                    } else{
                        toggle_8.setChecked(true);
                    }

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);
                    toggle_2.setEnabled(true);
                    toggle_3.setEnabled(true);
                    toggle_4.setEnabled(true);
                    toggle_5.setEnabled(true);
                    toggle_6.setEnabled(true);
                    toggle_7.setEnabled(true);
                    toggle_8.setEnabled(true);
                    toggle_9.setEnabled(true);

                    state[4] = true;
                } else {
                    // The toggle is disabled
                    state[4] = false;


                    toggle_1.setEnabled(false);

                    toggle_3.setEnabled(false);
                    toggle_4.setEnabled(false);


                    toggle_7.setEnabled(false);

                    toggle_9.setEnabled(false);

                    if (toggle_2 == toggle_11) {
                        toggle_2.setChecked(true);
                    } else{
                        toggle_2.setChecked(false);
                    }
                    if (toggle_6 == toggle_11) {
                        toggle_6.setChecked(true);
                    } else{
                        toggle_6.setChecked(false);
                    }
                    if (toggle_8 == toggle_11) {
                        toggle_8.setChecked(true);
                    } else{
                        toggle_8.setChecked(false);
                    }


                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);
                    toggle_2.setEnabled(true);
                    toggle_3.setEnabled(true);
                    toggle_4.setEnabled(true);
                    toggle_5.setEnabled(true);
                    toggle_6.setEnabled(true);
                    toggle_7.setEnabled(true);
                    toggle_8.setEnabled(true);
                    toggle_9.setEnabled(true);
                }
            }
        });
        toggle_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //https://developer.android.com/guide/topics/ui/controls/togglebutton#java


                    toggle_1.setEnabled(false);
                    toggle_2.setEnabled(false);

                    toggle_4.setEnabled(false);



                    toggle_8.setEnabled(false);

                    if (toggle_9 == toggle_10) {
                        toggle_9.setChecked(false);
                    } else{
                        toggle_9.setChecked(true);
                    }
                    if (toggle_5 == toggle_10) {
                        toggle_5.setChecked(false);
                    } else{
                        toggle_5.setChecked(true);
                    }
                    if (toggle_3 == toggle_10) {
                        toggle_3.setChecked(false);
                    } else{
                        toggle_3.setChecked(true);
                    }
                    if (toggle_7 == toggle_10) {
                        toggle_7.setChecked(false);
                    } else{
                        toggle_7.setChecked(true);
                    }

                 try {
                         Thread.sleep(5);
                    } catch (InterruptedException e) {
                       e.printStackTrace();
                    }

                 toggle_1.setEnabled(true);toggle_2.setEnabled(true); toggle_3.setEnabled(true);toggle_4.setEnabled(true);toggle_5.setEnabled(true);toggle_6.setEnabled(true);toggle_7.setEnabled(true);toggle_8.setEnabled(true);toggle_9.setEnabled(true);


                    state[5] = true;
                } else {
                    // The toggle is disabled
                    state[5] = false;


                    toggle_1.setEnabled(false);
                    toggle_2.setEnabled(false);

                    toggle_4.setEnabled(false);



                    toggle_8.setEnabled(false);

                    if (toggle_9 == toggle_11) {
                        toggle_9.setChecked(true);
                    } else{
                        toggle_9.setChecked(false);
                    }
                    if (toggle_5 == toggle_11) {
                        toggle_5.setChecked(true);
                    } else{
                        toggle_5.setChecked(false);
                    }
                    if (toggle_3 == toggle_11) {
                        toggle_3.setChecked(true);
                    } else{
                        toggle_3.setChecked(false);
                    }
                    if (toggle_7 == toggle_11) {
                        toggle_7.setChecked(true);
                    } else{
                        toggle_7.setChecked(false);
                    }

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                     toggle_1.setEnabled(true);toggle_2.setEnabled(true);toggle_3.setEnabled(true);toggle_4.setEnabled(true);toggle_5.setEnabled(true);toggle_6.setEnabled(true);toggle_7.setEnabled(true);toggle_8.setEnabled(true);toggle_9.setEnabled(true);

                }
            }
        });
        toggle_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //https://developer.android.com/guide/topics/ui/controls/togglebutton#java



                    toggle_2.setEnabled(false);
                    toggle_3.setEnabled(false);

                    toggle_5.setEnabled(false);


                    toggle_8.setEnabled(false);
                    toggle_9.setEnabled(false);

                    if (toggle_4 == toggle_10) {
                        toggle_4.setChecked(false);
                    } else{
                        toggle_4.setChecked(true);
                    }
                    if (toggle_6 == toggle_10) {
                        toggle_6.setChecked(false);
                    } else{
                        toggle_6.setChecked(true);
                    }
                    if (toggle_1 == toggle_10) {
                        toggle_1.setChecked(false);
                    } else{
                        toggle_1.setChecked(true);
                    }

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);toggle_2.setEnabled(true);toggle_3.setEnabled(true);toggle_4.setEnabled(true);toggle_5.setEnabled(true);toggle_6.setEnabled(true);toggle_7.setEnabled(true);toggle_8.setEnabled(true);toggle_9.setEnabled(true);

                    state[6] = true;
                } else {
                    // The toggle is disabled
                    state[6] = false;



                    toggle_2.setEnabled(false);
                    toggle_3.setEnabled(false);

                    toggle_5.setEnabled(false);


                    toggle_8.setEnabled(false);
                    toggle_9.setEnabled(false);

                    if (toggle_4 == toggle_11) {
                        toggle_4.setChecked(true);
                    } else{
                        toggle_4.setChecked(false);
                    }
                    if (toggle_6 == toggle_11) {
                        toggle_6.setChecked(true);
                    } else{
                        toggle_6.setChecked(false);
                    }
                    if (toggle_1 == toggle_11) {
                        toggle_1.setChecked(true);
                    } else{
                        toggle_1.setChecked(false);
                    }

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);toggle_2.setEnabled(true);toggle_3.setEnabled(true);toggle_4.setEnabled(true);toggle_5.setEnabled(true);toggle_6.setEnabled(true);toggle_7.setEnabled(true);toggle_8.setEnabled(true);toggle_9.setEnabled(true);
                }
            }
        });
        toggle_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    https://developer.android.com/guide/topics/ui/controls/togglebutton#java


                    toggle_1.setEnabled(false);
                    toggle_2.setEnabled(false);
                    toggle_3.setEnabled(false);
                    toggle_4.setEnabled(false);

                    toggle_6.setEnabled(false);
                    toggle_7.setEnabled(false);


                    if (toggle_5 == toggle_10) {
                        toggle_5.setChecked(false);
                    } else{
                        toggle_5.setChecked(true);
                    }
                    if (toggle_9 == toggle_10) {
                        toggle_9.setChecked(false);
                    } else{
                        toggle_9.setChecked(true);
                    }

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);toggle_2.setEnabled(true);toggle_3.setEnabled(true);toggle_4.setEnabled(true);toggle_5.setEnabled(true);toggle_6.setEnabled(true);toggle_7.setEnabled(true);toggle_8.setEnabled(true);toggle_9.setEnabled(true);

                    state[7] = true;
                } else {
                    // The toggle is disabled
                    state[7] = false;


                    toggle_1.setEnabled(false);
                    toggle_2.setEnabled(false);
                    toggle_3.setEnabled(false);
                    toggle_4.setEnabled(false);

                    toggle_6.setEnabled(false);
                    toggle_7.setEnabled(false);


                    if (toggle_5 == toggle_11) {
                        toggle_5.setChecked(true);
                    } else{
                        toggle_5.setChecked(false);
                    }
                    if (toggle_9 == toggle_11) {
                        toggle_9.setChecked(true);
                    } else{
                        toggle_9.setChecked(false);
                    }

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);toggle_2.setEnabled(true);toggle_3.setEnabled(true);toggle_4.setEnabled(true);toggle_5.setEnabled(true);toggle_6.setEnabled(true);toggle_7.setEnabled(true);toggle_8.setEnabled(true);toggle_9.setEnabled(true);

                }
            }
        });
        toggle_9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //https://developer.android.com/guide/topics/ui/controls/togglebutton#java



                    toggle_2.setEnabled(false);
                    toggle_3.setEnabled(false);
                    toggle_4.setEnabled(false);
                    toggle_5.setEnabled(false);

                    toggle_7.setEnabled(false);



                    if (toggle_8 == toggle_10) {
                        toggle_8.setChecked(false);
                    } else{
                        toggle_8.setChecked(true);
                    }
                    if (toggle_6 == toggle_10) {
                        toggle_6.setChecked(false);
                    } else{
                        toggle_6.setChecked(true);
                    }
                    if (toggle_1 == toggle_10) {
                        toggle_1.setChecked(false);
                    } else{
                        toggle_1.setChecked(true);
                    }


                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);toggle_2.setEnabled(true);toggle_3.setEnabled(true);toggle_4.setEnabled(true);toggle_5.setEnabled(true);toggle_6.setEnabled(true);toggle_7.setEnabled(true);toggle_8.setEnabled(true);toggle_9.setEnabled(true);

                    state[8] = true;
                } else {
                    // The toggle is disabled
                    state[8] = false;



                    toggle_2.setEnabled(false);
                    toggle_3.setEnabled(false);
                    toggle_4.setEnabled(false);
                    toggle_5.setEnabled(false);

                    toggle_7.setEnabled(false);



                    if (toggle_8 == toggle_11) {
                        toggle_8.setChecked(true);
                    } else{
                        toggle_8.setChecked(false);
                    }
                    if (toggle_6 == toggle_11) {
                        toggle_6.setChecked(true);
                    } else{
                        toggle_6.setChecked(false);
                    }
                    if (toggle_1 == toggle_11) {
                        toggle_1.setChecked(true);
                    } else{
                        toggle_1.setChecked(false);
                    }

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    toggle_1.setEnabled(true);toggle_2.setEnabled(true);toggle_3.setEnabled(true);toggle_4.setEnabled(true);toggle_5.setEnabled(true);toggle_6.setEnabled(true);toggle_7.setEnabled(true);toggle_8.setEnabled(true);toggle_9.setEnabled(true);
                }
            }
        });



    }













}
