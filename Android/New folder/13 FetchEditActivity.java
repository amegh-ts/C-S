package com.example.fetchdata;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FetchEditActivity extends Activity {
    Button ok;
    EditText edt;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = (Button) findViewById(R.id.button1);
        edt = (EditText) findViewById(R.id.editText1);
        tv = (TextView) findViewById(R.id.textView1);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = edt.getText().toString();
                tv.setText(msg);
            }
        });
    }
}
