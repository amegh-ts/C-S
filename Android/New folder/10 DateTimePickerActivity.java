package com.example.c620;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class DateTimePickerActivity extends Activity {
TimePicker tp;
DatePicker dp;
Button bi, bs;
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_date_time_picker);

    tp = (TimePicker) findViewById(R.id.timePicker1);
    dp = (DatePicker) findViewById(R.id.datePicker1);
    bi = (Button) findViewById(R.id.button1);
    bs = (Button) findViewById(R.id.button2);

    bi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),
                    getCurrentTime(), Toast.LENGTH_LONG).show();
        }
    });

    bs.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),
                    getCurrentDate(), Toast.LENGTH_LONG).show();
        }
    });
}

public String getCurrentTime() {
    int hour = tp.getCurrentHour();
    int minute = tp.getCurrentMinute();
    return "Current Time: " + hour + ":" + minute;
}

public String getCurrentDate() {
    int year = dp.getYear();
    int month = dp.getMonth();
    int day = dp.getDayOfMonth();
    Calendar c = Calendar.getInstance();
    c.set(year, month, day);
    String date = c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR);
    return "Current Date: " + date;
}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.datetime_picker, menu);
    return true;
}
