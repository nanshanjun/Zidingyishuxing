package com.bwei.zidingyishuxing;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 作者： 南山君
 * 时间：2017/2/9.10:26
 */

public abstract class BaseActivity extends FragmentActivity implements View.OnClickListener{

    public static final int LEFT_IMAGE_RIGHT_NO = 1; //左边图片,右边没有
    public static final int LEFT_NO_RIGHT_NO = 2; //左边没有,右边没有

    private ImageView iv_title_left;
    private TextView tv_title_center;

    //初始化头部
    public abstract void initHeader();
    //初始化控件
    public abstract void initWidget();
    //设置监听
    public abstract void initSetListener();

    public void initHeaderWidget(){

        iv_title_left = (ImageView) findViewById(R.id.iv_title_left);

        tv_title_center = (TextView) findViewById(R.id.tv_title_center);

    }

    public void setListener(){

        setImageListener();

    }

    private void setImageListener() {

        iv_title_left.setOnClickListener(this);

    }

    public void setLeftImageListtener(View.OnClickListener listener){

        iv_title_left.setVisibility(View.VISIBLE);

        iv_title_left.setOnClickListener(listener);

    }

    @Override
    public void onClick(View view) {

    }

    public void setTitle(String title){

        iv_title_left.setVisibility(View.GONE);

        tv_title_center.setVisibility(View.GONE);

        tv_title_center.setText(title);

    }

    public void LeftImage(){

        iv_title_left.setVisibility(View.VISIBLE);

    }

    public void TextCenter(){

        tv_title_center.setVisibility(View.VISIBLE);

    }

    public void setNone(){

        iv_title_left.setVisibility(View.GONE);

        tv_title_center.setVisibility(View.GONE);

    }

    public void setTitleStatue(int position){

        switch (position){

            case LEFT_IMAGE_RIGHT_NO:

                LeftImage();

                TextCenter();

                break;


            case LEFT_NO_RIGHT_NO:

                setNone();

                TextCenter();

                break;

        }

    }

}
