package com.example.donation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.donation.databinding.ActivityReportBinding;
import com.example.donation.models.DonationAdapter;

public class Report extends Base {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        listView = (ListView) findViewById(R.id.reportList);
        DonationAdapter adapter = new DonationAdapter(this, donations);
        listView.setAdapter(adapter);
        listView = (ListView) findViewById(R.id.reportList);
        listView.setAdapter(adapter);
//        binding.reportList.setAdapter(adapter);
    }

}