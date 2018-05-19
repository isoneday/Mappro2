package com.training.mappro;

import android.os.Bundle;
import android.view.View;

import com.training.mappro.activity.ListMapActivity;
import com.training.mappro.activity.MapsActivity;
import com.training.mappro.activity.PlacePickerActivity;
import com.training.mappro.helper.MyFunction;

public class MainActivity extends MyFunction {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMap(View view) {
        aksesclass(MapsActivity.class);
    }

    public void onPlacePicker(View view) {
        aksesclass(PlacePickerActivity.class);
    }

    public void onListMAp(View view) {
        aksesclass(ListMapActivity.class);
    }
}
