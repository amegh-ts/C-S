package com.example.multiplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MultiplicationTableActivity extends Activity {
    EditText inputNumber;
    Button btnOK;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOK = (Button) findViewById(R.id.btnOK);
        inputNumber = (EditText) findViewById(R.id.txtNumber);
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = inputNumber.getText().toString();
                int number = Integer.parseInt(value);
                for(int i=1; i<=10; i++) {
                    txtResult.setText(txtResult.getText().toString() + "\n" + number + "x" + i + "=" + (number*i));
                }
            }
        });
    }
}
