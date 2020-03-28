package com.example.myapplication.gridview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;

import com.example.myapplication.R;

public class GridViewActivity extends Activity {

    private GridView mGv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        mGv = findViewById(R.id.gv);
        mGv.setAdapter(new GridViewAdapter(GridViewActivity.this));

    }
}
