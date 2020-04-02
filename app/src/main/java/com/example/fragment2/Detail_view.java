package com.example.fragment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;

public class Detail_view extends AppCompatActivity {
    Intent intent;
    Fragment_detail fragment_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        intent = getIntent();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragment_detail = (Fragment_detail) fragmentManager.findFragmentById(R.id.detail_fragment);
        fragment_detail.textView.setText(intent.getStringExtra("name"));

    }
}
