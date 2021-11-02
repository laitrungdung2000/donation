package com.example.donation.activities;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.donation.R;
import com.example.donation.activities.Base;
import com.example.donation.models.DonationAdapter;

public class Report extends Base {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        listView = (ListView) findViewById(R.id.reportList);
        Log.v("Donate", app.dbManager.getAll().toString());
        DonationAdapter adapter = new DonationAdapter(this, app.dbManager.getAll());
        listView.setAdapter(adapter);
        listView = (ListView) findViewById(R.id.reportList);
        listView.setAdapter(adapter);
//        binding.reportList.setAdapter(adapter);
    }

}