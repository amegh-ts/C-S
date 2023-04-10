package com.example.bsc;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;

public class AlertActivity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void showAlert(View v) {
        AlertDialog.Builder alertDB = new AlertDialog.Builder(this);
        alertDB.setTitle("Your Title");
        alertDB.setMessage("Click yes to exit!");
        alertDB.setCancelable(false);
        alertDB.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Alert.this.finish();
            }
        });
        alertDB.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        
        AlertDialog alertD = alertDB.create();
        alertD.show();
    }
}
