package com.example.androidarshinsky52;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.action_open_notes: {
                Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
                startActivity(intentNotes);
                return true;
            }
            case R.id.action_open_task_term: {
                Intent intentNotes = new Intent(MainActivity.this, TaskTermActivity.class);
                startActivity(intentNotes);
                return true;
            }
            case R.id.action_open_spinner_demo: {
                Intent intentNotes = new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(intentNotes);
                return true;
            }
            case R.id.action_open_checkbox_demo: {
                Intent intentNotes = new Intent(MainActivity.this, CheckBoxActivity.class);
                startActivity(intentNotes);
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
