package com.example.gregfunk.androiddatastoragedemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.inflateMenu(R.menu.main_menu);
        setSupportActionBar(myToolbar);


        //set and get a shared preference
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.gregfunk.androiddatastoragedemo", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("username", "greg").apply();
        String username = sharedPreferences.getString("username", "");
        Log.i("username", username);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.add) {
            Log.i("Action Button Tapped", "Add");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
