package com.tie.material;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MDActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("测试MD");
        setSupportActionBar(toolbar);
    }
}
