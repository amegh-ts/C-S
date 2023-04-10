package com.example.c620;

import android.os.Bundle;
import android.os.SystemClock;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;

public class StopwatchActivity extends Activity implements OnClickListener {
    Chronometer c;
    Button b1, b2, b3;
    long stoptime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);

        c = (Chronometer) findViewById(R.id.chronometer);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == b1) {
            c.setBase(SystemClock.elapsedRealtime() + stoptime);
            c.start();
        } else if (v == b2) {
            stoptime = c.getBase() - SystemClock.elapsedRealtime();
            c.stop();
        } else if (v == b3) {
            stoptime = 0;
            c.setBase(SystemClock.elapsedRealtime());
            c.stop();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.stopwatch, menu);
        return true;
    }
}
