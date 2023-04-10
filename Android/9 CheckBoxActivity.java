package com.example.checkbox;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckBoxActivity extends Activity implements View.OnClickListener {

    CheckBox cbPaint, cbRead, cbCook;
    Button btnShow;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.tvDetails);
        tv.setText("");

        cbPaint = (CheckBox)findViewById(R.id.cbPaint);
        cbRead = (CheckBox)findViewById(R.id.cbRead);
        cbCook = (CheckBox)findViewById(R.id.cbCook);

        btnShow = (Button)findViewById(R.id.btnShow);
        btnShow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        tv.setText("I Like ");

        if(cbPaint.isChecked()) {
            tv.setText(tv.getText().toString() + "\n" + cbPaint.getText().toString());
        }

        if(cbRead.isChecked()) {
            tv.setText(tv.getText().toString() + "\n" + cbRead.getText().toString());
        }

        if(cbCook.isChecked()) {
            tv.setText(tv.getText().toString() + "\n" + cbCook.getText().toString());
        }

        if(!cbPaint.isChecked() && !cbRead.isChecked() && !cbCook.isChecked()) {
            tv.setText("");
        }
    }
}
