package com.pibigstar.demo.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

import org.json.JSONObject;


/**
 * Created by pibigstar on 2018/3/1.
 */

public class MyJavaSctiptInterface{
    private Activity mActivity;

    public MyJavaSctiptInterface(Activity mActivity) {
        this.mActivity = mActivity;
    }

//    public void callPhone(String[] strs){//拨号
//        JSONObject jsonObject = new JSONObject(strs[0]);
//        String phone = jsonObject.optString("phone");
//        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phone));
//        mActivity.startActivity(intent);
//    }
}
