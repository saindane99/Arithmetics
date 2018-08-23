package com.arithmetic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.arithmetic_lib.MyMath;

public class MainActivity extends AppCompatActivity {

    int added;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        added = MyMath.Plus(10, 10);
        Toast.makeText(getApplicationContext(), "Addition : " + added, Toast.LENGTH_SHORT).show();
    }
}
