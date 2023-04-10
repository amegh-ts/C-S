package com.example.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends Activity implements OnItemClickListener {
    ListView lv;
    String cource[] = {"MCA", "MBA", "BCA", "BBA", "BCOM"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            lv = (ListView) findViewById(R.id.listViewcource);
            ArrayAdapter<String> arr = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cource);
            lv.setAdapter(arr);
            lv.setOnItemClickListener(this);
        } catch (Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
        Toast.makeText(this, cource[position] + " is selected.", Toast.LENGTH_SHORT).show();
    }
}
