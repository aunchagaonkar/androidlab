package com.example.activitylifecycle;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ameya" , "onCreate method called ");
        Toast.makeText(this, "on create method called", Toast.LENGTH_SHORT).show();
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, sample1.class);
                startActivity(i);
            }
        });

        }
        public void onStart()
        {
            super.onStart();
                Log.d("ameya" , "onStart method called ");
            Toast.makeText(this, "on start method called", Toast.LENGTH_SHORT).show();

        }
        public void onResume()
        {
            super.onResume();
            Log.d("ameya"   , "onResume method called");
            Toast.makeText(this, "on resume method called", Toast.LENGTH_SHORT).show();

        }
        public void onPause()
        {
            super.onPause();
            Log.d("ameya" , "onPause method called");
            Toast.makeText(this, "on pause method called", Toast.LENGTH_SHORT).show();

        }
        public void onRestart()
        {
            super.onRestart();
            Log.d("ameya" , "onRestart method called");
            Toast.makeText(this, "on restart method called", Toast.LENGTH_SHORT).show();


        }

        public void onStop()
        {
            super.onStop();
            Log.d("ameya" , "onStop method called");
            Toast.makeText(this, "on stop method called", Toast.LENGTH_SHORT).show();

        }
        public void onDestroy()
        {
            super.onDestroy();
            Log.d("ameya" , "onDestroy method called");
            Toast.makeText(this, "on destroy method called", Toast.LENGTH_SHORT).show();

        }

}