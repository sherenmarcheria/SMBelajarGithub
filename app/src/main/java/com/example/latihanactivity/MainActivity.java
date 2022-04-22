package com.example.LatihanActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // deklarasi komponen
    Button btnclose, btnstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnclose = (Button) findViewById(R.id.btn_close);
        btnstart = (Button) findViewById(R.id.btn_start_activity);

        btnclose.setOnClickListener(this);
        btnstart.setOnClickListener(this);

        Toast.makeText(this, "Activity on Create()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View View) {
        super.onStart();
        Toast.makeText(this, "Activity:onstart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(this, "Activity:onstart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity:onstart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activity:onstart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Activity:onstart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View View) {
        switch (View.getId()){
            case R.id.btn_start_activity:
                Intent newActivity = new Intent(Intent.ACTION_VIEW);
                newActivity.setData(Uri.parse("https://stmikpontianak.ac.id/moodle/"));
                startActivity(newActivity);
                break;
            case R.id.btn_close:
                finish();
                break;
        }

    }
}