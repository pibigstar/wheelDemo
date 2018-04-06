package com.pibigstar.demo.fragment;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.ViewTarget;
import com.itheima.dialogviewpager.DepthPageTransformer;
import com.itheima.dialogviewpager.ItHeiMaDialog;
import com.itheima.materialdialogs.MaterialDialog;
import com.pibigstar.demo.R;
import com.pibigstar.demo.activity.CityPickerWebViewActivity;
import com.pibigstar.demo.activity.DanMuActivity;
import com.pibigstar.demo.activity.DivergeViewActivity;
import com.pibigstar.demo.activity.DynamicGridViewActivity;
import com.pibigstar.demo.activity.LoopImageActivity;
import com.pibigstar.demo.activity.PhotoBrowseActivity;
import com.pibigstar.demo.activity.ZxingCodeActivity;

import java.util.Timer;
import java.util.TimerTask;

import dmax.dialog.SpotsDialog;

/**
 * Created by pibigstar on 2018/2/25.
 */

public class MyFragment extends Fragment implements View.OnClickListener{

    private Button btCode,btLoding,btLoopImage,btGuideDialog,btDiverge,btMaterailDialog,btDanMu;
    private Button btCityPicker,btDynamicGrid,btPhotoBrowse;
    private Intent intent;
    private ShowcaseView btCodeShowcaseView,btLodingShowcaseView,btLoopImageShowcaseView;
    private ViewTarget btCodeTarget,btLodingTarget,btLoopImageTarget;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main,container,false);
        return view;
    }

    public static MyFragment newInstance() {
        
        Bundle args = new Bundle();
        MyFragment fragment = new MyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        init();

        //showCase();


    }

    /**
     * 初始化
     */
    private void init() {
        btCode = getActivity().findViewById(R.id.bt_code);
        btLoding = getActivity().findViewById(R.id.bt_loding);
        btLoopImage = getActivity().findViewById(R.id.bt_loopimage);
        btGuideDialog = getActivity().findViewById(R.id.bt_guideDialog);
        btDiverge = getActivity().findViewById(R.id.bt_diverge);
        btMaterailDialog = getActivity().findViewById(R.id.bt_materailDialog);
        btDanMu = getActivity().findViewById(R.id.bt_danma);
        btCityPicker = getActivity().findViewById(R.id.bt_cityPicker);
        btDynamicGrid = getActivity().findViewById(R.id.bt_dynamicGrid);
        btPhotoBrowse = getActivity().findViewById(R.id.bt_photoBrowse);

        btCode.setOnClickListener(this);
        btLoding.setOnClickListener(this);
        btLoopImage.setOnClickListener(this);
        btGuideDialog.setOnClickListener(this);
        btDiverge.setOnClickListener(this);
        btMaterailDialog.setOnClickListener(this);
        btDanMu.setOnClickListener(this);
        btCityPicker.setOnClickListener(this);
        btDynamicGrid.setOnClickListener(this);
        btPhotoBrowse.setOnClickListener(this);
    }

    /**
     * 按钮监听
     * @param view
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_loding :
                final AlertDialog spotsDialog = new SpotsDialog(getContext(), R.style.Custom);
                spotsDialog.show();
                Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        spotsDialog.dismiss();
                    }
                };
                //定时，三秒后将弹窗消失
                timer.schedule(timerTask,3000);
                break;
            case R.id.bt_code :
                intent = new Intent(getActivity(),ZxingCodeActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_loopimage :
                intent = new Intent(getActivity(),LoopImageActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_guideDialog :
                ItHeiMaDialog.getInstance()
                        .setImages(new int[]{com.itheima.dialogviewpager.R.drawable.new_user_guide_1, com.itheima.dialogviewpager.R.drawable.new_user_guide_2, com.itheima.dialogviewpager.R.drawable.new_user_guide_3, com.itheima.dialogviewpager.R.drawable.new_user_guide_4})
                        .setPageTransformer(new DepthPageTransformer())
                        .show(getActivity().getFragmentManager());
                break;
            case R.id.bt_diverge :
                intent = new Intent(getContext(), DivergeViewActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_materailDialog :
                new MaterialDialog.Builder(getContext())
                        .title("这是标题")
                        .content("这是描述的内容")
                        .positiveText("确定")
                        .negativeText("取消")
                        .show();
                break;
            case R.id.bt_danma :
                intent = new Intent(getContext(), DanMuActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_cityPicker :
                intent = new Intent(getContext(), CityPickerWebViewActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_dynamicGrid :
                intent = new Intent(getContext(), DynamicGridViewActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_photoBrowse :
                intent = new Intent(getContext(), PhotoBrowseActivity.class);
                startActivity(intent);
                break;

        }
    }



    /**
     * 突出显示,引导页面
     */
    private void showCase() {
        ////设置button为突出的目标
        new ShowcaseView.Builder(getActivity())
                .setTarget(new ViewTarget(btLoopImage))
                .setContentTitle("这是轮播图")
                .setContentText("点击进入轮播图")
                .hideOnTouchOutside()
                .build();
        //显示一个半透明图片告诉用户某种手势操作
        ShowcaseView showcaseView = new ShowcaseView.Builder(getActivity())
                .setStyle(R.style.Custom_semi_transparent_demo)//setStyle instead of setTarget!
                .hideOnTouchOutside()
                .build();


        //步骤引导

        final Button firstButton=new Button(getActivity());
        firstButton.setText("下一步");
        final Button secondButton=new Button(getActivity());
        secondButton.setText("下一步");
        final Button threeButton=new Button(getActivity());
        threeButton.setText("明白了");


        btCodeTarget = new ViewTarget(btCode);
        btLodingTarget = new ViewTarget(btLoding);
        btLoopImageTarget = new ViewTarget(btLoopImage);


        btCodeShowcaseView=new ShowcaseView.Builder(getActivity())
                .withHoloShowcase()
                .setTarget(btCodeTarget)
                .setContentTitle("第一步")
                .setContentText("点击二维码生成")
                .replaceEndButton(firstButton)
                .build();
        btLodingShowcaseView=new ShowcaseView.Builder(getActivity())
                .withHoloShowcase()
                .setTarget(btLodingTarget)
                .setContentTitle("第二步")
                .setContentText("点击正在加载弹窗")
                .replaceEndButton(secondButton)
                .build();
        btLodingShowcaseView.hide();
        btLoopImageShowcaseView=new ShowcaseView.Builder(getActivity())
                .withHoloShowcase()
                .setTarget(btLoopImageTarget)
                .setContentTitle("第三步")
                .setContentText("点击轮播图")
                .replaceEndButton(threeButton)
                .build();
        btLoopImageShowcaseView.hide();
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btCodeShowcaseView.hide();
                btLodingShowcaseView.show();
            }
        });
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btLodingShowcaseView.hide();
                btLoopImageShowcaseView.show();
            }
        });
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btLoopImageShowcaseView.hide();
            }
        });


    }

}
