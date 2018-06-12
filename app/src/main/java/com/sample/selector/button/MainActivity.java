package com.sample.selector.button;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.selector.button.SelectorButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SelectorButton selectorButton = (SelectorButton) findViewById(R.id.button);
        selectorButton.setStateNormalDrawable(getResources().getDrawable(R.drawable.btn_normal));
        selectorButton.setStatePressedDrawable(getResources().getDrawable(R.drawable.btn_pressed));
        selectorButton.setStateDisabledDrawable(getResources().getDrawable(R.drawable.btn_disabled));
    }
}
