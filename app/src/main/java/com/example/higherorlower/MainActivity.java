package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();
    int randomNumber = rand.nextInt(20);

    public void guess(View view) {

        Log.i("Info", Integer.toString(randomNumber));

        EditText number = (EditText) findViewById(R.id.editText2);

        int num = Integer.parseInt(number.getText().toString());
        if (num > randomNumber) {
            Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
        } else if (num < randomNumber) {
            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You've guessed it!", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
