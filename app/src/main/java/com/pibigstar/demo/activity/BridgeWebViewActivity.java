package com.pibigstar.demo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.itheima.view.BridgeWebView;
import com.pibigstar.demo.R;

/**
 * Created by pibigstar on 2018/3/1.
 */

public class BridgeWebViewActivity extends AppCompatActivity{

    private BridgeWebView mBdwebview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBdwebview = (BridgeWebView) findViewById(R.id.bdwebview);//初始化BridgeWebView
        mBdwebview.loadUrl("http://10.0.3.2:63343/BridgeWebView/index.html");//显示H5页面
        mBdwebview.addBridgeInterface(new MyJavaSctiptInterface(this));//注册桥梁类，该类负责H5和android通信
    }
}
