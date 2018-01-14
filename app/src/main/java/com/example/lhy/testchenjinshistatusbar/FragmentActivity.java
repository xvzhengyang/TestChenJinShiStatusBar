package com.example.lhy.testchenjinshistatusbar;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        final FragmentOne fragmentOne = new FragmentOne();
        final FragmentTwo fragmentTwo = new FragmentTwo();
        final FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frLayout,fragmentOne);
        fragmentTransaction.add(R.id.frLayout,fragmentTwo);
        fragmentTransaction.hide(fragmentOne);
        fragmentTransaction.show(fragmentTwo);
        fragmentTransaction.commit();
        findViewById(R.id.tvChange).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.show(fragmentOne);
                fragmentTransaction.hide(fragmentTwo);
                fragmentTransaction.commit();
            }
        });
    }
}
