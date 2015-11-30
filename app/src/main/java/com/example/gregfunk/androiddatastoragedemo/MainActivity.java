package com.example.gregfunk.androiddatastoragedemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set and get a shared preference
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.gregfunk.androiddatastoragedemo", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("username", "greg").apply();
        String username = sharedPreferences.getString("username", "");
        Log.i("username", username);
    }
}
