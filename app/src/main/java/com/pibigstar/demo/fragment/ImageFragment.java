package com.pibigstar.demo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itheima.roundedimageview.RoundedImageView;
import com.pibigstar.demo.R;

/**
 * Created by pibigstar on 2018/2/28.
 */

public class ImageFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_imageview,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public static ImageFragment newInstance() {
        
        Bundle args = new Bundle();
        
        ImageFragment fragment = new ImageFragment();
        fragment.setArguments(args);
        return fragment;
    }


}
