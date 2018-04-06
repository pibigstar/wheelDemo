package com.pibigstar.demo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.itheima.danmaku.danmaku.model.BaseDanmaku;
import com.itheima.danmaku.danmaku.model.DanmakuTimer;
import com.itheima.danmaku.danmaku.model.android.DanmakuContext;
import com.itheima.danmaku.danmaku.parser.BaseDanmakuParser;
import com.itheima.danmaku.danmaku.util.DanmakuUtils;
import com.itheima.danmaku.ui.widget.DanmakuView;
import com.pibigstar.demo.R;

/**
 * Created by pibigstar on 2018/3/1.
 */

public class DanMuActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danmakuflame);

        DanmakuContext context = DanmakuContext.create();
        final DanmakuView danmakuView = (DanmakuView) findViewById(R.id.sv_danmaku);
        if(danmakuView != null){
            //根据数据源转化成弹幕解析器
            BaseDanmakuParser mParser = DanmakuUtils.createParser(this.getResources().openRawResource(R.raw.comments));
            //设置回调监听
            danmakuView.setCallback(new com.itheima.danmaku.controller.DrawHandler.Callback() {
                @Override
                public void updateTimer(DanmakuTimer timer) {
                }

                @Override
                public void danmakuShown(BaseDanmaku baseDanmaku) {

                }

                @Override
                public void drawingFinished() {

                }

                //页面准备完毕就开始播放弹幕
                @Override
                public void prepared() {
                    danmakuView.start();
                }
            });

            //准备数据
            danmakuView.prepare(mParser,context);
            //是否显示fps
            danmakuView.showFPS(false);
            //绘制缓存
            danmakuView.enableDanmakuDrawingCache(true);
        }
    }
}
