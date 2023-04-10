package com.example.bsc;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.text.format.DateFormat;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class DateActivity extends Activity {
	Button b1,b2;

	public String s1,s2;
	SimpleDateFormat d;
	Calendar c;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_date);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		s1=DateFormat.getDateFormat(getApplicationContext()).format(new Date());
		d=new SimpleDateFormat("hh:mm:ss:a");
		c=Calendar.getInstance();
		s2=d.format(c.getTime());
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				AlertDialog.Builder alert1=new AlertDialog.Builder(DateActivity.this);
				alert1.setTitle("Date");
				alert1.setMessage(s1);
				alert1.show();
			}
		});
		b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				AlertDialog.Builder alert2=new AlertDialog.Builder(DateActivity.this);
				alert2.setTitle("Time");
				alert2.setMessage(s2);
				alert2.show();
				
			}
		});
	}

	private void Format(Date date) {
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.date, menu);
		return true;
	}

}