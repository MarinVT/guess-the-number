    package com.marinltd.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.google.android.material.snackbar.Snackbar;

    public class MainActivity extends AppCompatActivity {

    private Button buttonStart;
    private RadioButton radioButton2, radioButton3, radioButton4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.buttonStart);

        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GameActivity.class);

                if (!radioButton2.isChecked() && !radioButton3.isChecked() && !radioButton4.isChecked()) {
                    Snackbar.make(view, "Please select a number of digits", Snackbar.LENGTH_LONG).show();
                } else {
                    if (radioButton2.isChecked()) {
                        intent.putExtra("one", true);
                    }

                    if (radioButton3.isChecked()) {
                        intent.putExtra("two", true);
                    }

                    if (radioButton4.isChecked()) {
                        intent.putExtra("three", true);
                    }

                    startActivity(intent);
                }

            }
        });

    }
}