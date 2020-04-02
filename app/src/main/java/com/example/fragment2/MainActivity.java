package com.example.fragment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IinputFragment{

    MainFragment mainFragment;
    InputFragment inputFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        mainFragment = (MainFragment) fragmentManager.findFragmentById(R.id.recycler_fragmnet);
        inputFragment = (InputFragment) fragmentManager.findFragmentById(R.id.input_fragment);

        inputFragment.listener = this;

    }
    @Override
    public void onInputNumber(int number) {
        mainFragment.fullList(number);
    }

    public void clickOn(String name) {
        Intent intent = new Intent(MainActivity.this, Detail_view.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
