package com.pibigstar.demo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pibigstar.demo.R;

import me.leefeng.citypicker.CityPicker;
import me.leefeng.citypicker.CityPickerListener;

/**
 * Created by pibigstar on 2018/3/4.
 */

public class CityPickerWebViewActivity extends AppCompatActivity implements CityPickerListener{

    private CityPicker cityPicker;
    private TextView textView;
    private Button chooseCity;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citypicker);
        textView = findViewById(R.id.text_city);
        chooseCity = findViewById(R.id.bt_chooseCity);
        cityPicker = new CityPicker(CityPickerWebViewActivity.this,this);

        chooseCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cityPicker.show();
            }
        });


    }

    @Override
    public void getCity(String s) {
        textView.setText(s);
    }
}
