package com.example.proguardtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mapper<String> mapper = new Mapper<>("FIRST");
        MyEnum myEnum = mapper.map(MyEnum::valueOf);
    }
}
