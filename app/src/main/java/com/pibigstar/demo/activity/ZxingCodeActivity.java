package com.pibigstar.demo.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.WriterException;
import com.google.zxing.activity.CaptureActivity;
import com.google.zxing.common.BitmapUtils;
import com.pibigstar.demo.R;

/**
 * Created by pibigstar on 2018/2/26.
 * 生成二维码
 */

public class ZxingCodeActivity extends AppCompatActivity implements View.OnClickListener{


    private EditText editCode;
    private Button createCode;
    private Button saoMiao;
    private TextView tv_result;
    private ImageView image_callback;
    private ImageView imageCode;

    private Context mContext;
    private final static int REQ_CODE = 1028;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zxing);
        initView();
        mContext = this;
    }

    private void initView() {
        createCode = (Button) findViewById(R.id.createCode);

        createCode.setOnClickListener(this);
        editCode = (EditText) findViewById(R.id.textCode);
        saoMiao = (Button) findViewById(R.id.saoMiao);
        saoMiao.setOnClickListener(this);
        imageCode = (ImageView) findViewById(R.id.image_code);
        imageCode.setOnClickListener(this);
        tv_result = (TextView) findViewById(R.id.tv_result);
        tv_result.setOnClickListener(this);
        image_callback = (ImageView) findViewById(R.id.image_callback);
        image_callback.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.saoMiao:
//                startActivity(new Intent(MainActivity.this, CaptureActivity.class));
                Intent intent = new Intent(mContext, CaptureActivity.class);
                startActivityForResult(intent, REQ_CODE);
                break;
            case R.id.createCode:
                // INVISIBILITY不可见，但是还占着位置，VISIBLE可见，GONE不可见
                imageCode.setVisibility(View.VISIBLE);
                //隐藏扫码结果view
                image_callback.setVisibility(View.GONE);
                tv_result.setVisibility(View.GONE);

                String content = editCode.getText().toString().trim();
                Bitmap bitmap = null;
                try {
                    bitmap = BitmapUtils.create2DCode(content);//根据内容生成二维码
                    tv_result.setVisibility(View.GONE);
                    imageCode.setImageBitmap(bitmap);
                } catch (WriterException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQ_CODE) {
            imageCode.setVisibility(View.GONE);
            tv_result.setVisibility(View.VISIBLE);
            image_callback.setVisibility(View.VISIBLE);

            String result = data.getStringExtra(CaptureActivity.SCAN_QRCODE_RESULT);
            Bitmap bitmap = data.getParcelableExtra(CaptureActivity.SCAN_QRCODE_BITMAP);

            tv_result.setText("扫码结果："+result);
            showToast("扫码结果：" + result);
            if(bitmap != null){
                image_callback.setImageBitmap(bitmap);//现实扫码图片
            }
        }


    }

    private void showToast(String msg) {
        Toast.makeText(mContext, "" + msg, Toast.LENGTH_SHORT).show();
    }
}
