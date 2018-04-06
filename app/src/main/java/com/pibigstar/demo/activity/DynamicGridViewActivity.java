package com.pibigstar.demo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.pibigstar.demo.R;
import com.pibigstar.demo.adapter.MyDynamicGridAdapter;
import org.askerov.dynamicgrid.DynamicGridView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pibigstar on 2018/3/4.
 */

public class DynamicGridViewActivity extends AppCompatActivity {

    private DynamicGridView gridView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamicgridview);
        gridView = (DynamicGridView) findViewById(R.id.dynamic_grid);

        String [] sItem = {"Abbaye de Belloc", "Abbaye du Mont des Cats", "Abertam", "Abondance", "Ackawi"};
        List<String> itemsList = Arrays.asList(sItem);

        // 第一个参数：上下文
        // 第二个参数：adapter展示需要用到的集合数据
        // 第三个参数：gridview一共有多少列
        gridView.setAdapter(new MyDynamicGridAdapter(this, itemsList, 3));
        gridView.setOnDragListener(new DynamicGridView.OnDragListener() {
            @Override
            public void onDragStarted(int position) {
                Log.d("tag", "drag started at position " + position);
            }

            @Override
            public void onDragPositionsChanged(int oldPosition, int newPosition) {
                Log.d("tag", String.format("drag item position changed from %d to %d", oldPosition, newPosition));
            }
        });
        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                gridView.startEditMode(position);
                return true;
            }
        });

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(DynamicGridViewActivity.this, parent.getAdapter().getItem(position).toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public void onBackPressed(){
        if (gridView.isEditMode()) {
            gridView.stopEditMode();
        } else {
            super.onBackPressed();
            //进行数据持久化操作
        }
    }
}
