package com.example.radiobtn;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioActivity extends Activity implements OnClickListener {
    RadioButton rdmale, rdfemale;
    Button btshow, btdefault;
    TextView txtmsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdmale = (RadioButton) findViewById(R.id.radiomale);
        rdfemale = (RadioButton) findViewById(R.id.radiofemale);
        btshow = (Button) findViewById(R.id.buttonshow);
        btdefault = (Button) findViewById(R.id.buttondefault);
        txtmsg = (TextView) findViewById(R.id.txtmsg);
        txtmsg.setText("");

        btshow.setOnClickListener(this);
        btdefault.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button action = (Button) v;
        if (action.getId() == btshow.getId()) {
            String msg = "You Are ";
            if (rdmale.isChecked())
                msg = msg + rdmale.getText().toString();
            else if (rdfemale.isChecked())
                msg = msg + rdfemale.getText().toString();
            txtmsg.setText(msg);
        } else if (action.getId() == btdefault.getId()) {
            rdmale.setChecked(true);
            txtmsg.setText("");
        }
    }
}
