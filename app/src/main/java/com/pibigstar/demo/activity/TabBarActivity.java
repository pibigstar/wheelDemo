package com.pibigstar.demo.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.pibigstar.demo.R;
import com.wooplr.spotlight.SpotlightView;

public class TabBarActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private ToggleButton toggleButton;

    /**
     * 底部监听
     */
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                    mTextMessage.setText(item.getTitle().toString());
                    return true;
                case R.id.navigation_hot:
                    //mTextMessage.setText(R.string.title_hot);
                    mTextMessage.setText(item.getTitle().toString());
                    return true;
                case R.id.navigation_me:
                    //mTextMessage.setText(R.string.title_me);
                    mTextMessage.setText(item.getTitle().toString());
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //取消标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //取消状态栏  注意：要放到setContentView前面
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_tabbar);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //设置底部导航栏监听
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        toggleButton =(ToggleButton) findViewById(R.id.toggleButton);
        //设置引导页
        new SpotlightView.Builder(this)
                .introAnimationDuration(400)
                .enableRevealAnimation(true)
                .performClick(true)
                .fadeinTextDuration(400)
                .headingTvColor(Color.parseColor("#eb273f"))
                .headingTvSize(32)
                .headingTvText("按钮")
                .subHeadingTvColor(Color.parseColor("#ffffff"))
                .subHeadingTvSize(16)
                .subHeadingTvText("是否要点击?\n让我们看看效果吧.")
                .maskColor(Color.parseColor("#dc000000"))
                .target(toggleButton)
                .lineAnimDuration(400)
                .lineAndArcColor(Color.parseColor("#eb273f"))
                .dismissOnTouch(true)
                .dismissOnBackPress(true)
                .enableDismissAfterShown(true)
                .show();
    }

}
