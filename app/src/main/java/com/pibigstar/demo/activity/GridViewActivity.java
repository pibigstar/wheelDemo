package com.pibigstar.demo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.pibigstar.demo.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pibigstar on 2018/2/25.
 */

public class GridViewActivity extends Activity implements AdapterView.OnItemClickListener{
    private GridView gridView;
    private SimpleAdapter adapter;
    private int[] icons = {R.drawable.pibigstar,
            R.drawable.pibigstar,R.drawable.pibigstar,
            R.drawable.pibigstar,R.drawable.pibigstar,
            R.drawable.pibigstar,R.drawable.pibigstar,
            R.drawable.pibigstar,R.drawable.pibigstar,
            R.drawable.pibigstar,R.drawable.pibigstar,R.drawable.pibigstar};
    private String[] iconNames = {"我是派大星","我是派大星","我是派大星","我是派大星","我是派大星","我是派大星","我是派大星","我是派大星","我是派大星","我是派大星","我是派大星","我是派大星"};

    private List<Map<String, Object>> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setTitle("GridView网格显示");

        setContentView(R.layout.gridview);
        dataList = new ArrayList<Map<String,Object>>();
        gridView = (GridView) findViewById(R.id.gridView);

        adapter = new SimpleAdapter(this,getData(), R.layout.list_item, new String[] {"icon","iconName"}, new int[] {R.id.icon,R.id.iconName});
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(this);

    }
    private List<Map<String, Object>> getData(){
        for(int i=0;i<icons.length;i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("icon",icons[i]);
            map.put("iconName", iconNames[i]);
            dataList.add(map);
        }
        return dataList;
    }
    //点击事件
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, iconNames[position], Toast.LENGTH_SHORT).show();
    }

}
