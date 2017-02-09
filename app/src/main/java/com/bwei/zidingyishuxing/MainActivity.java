package com.bwei.zidingyishuxing;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends BaseActivity {

    private FrameLayout framelayout_main;
    private Button bu_main_moontea;
    private Button bu_main_favourable;
    private Button bu_main_shop;
    private Button bu_main_mine;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化头部
        initHeader();
        //初始化控件
        initWidget();
        //设置监听
        initSetListener();

    }

    @Override
    public void initHeader() {

        initHeaderWidget();

        setTitle("月光茶人");

        SetListener();


    }

    private void SetListener() {

        framelayout_main = (FrameLayout) findViewById(R.id.framelayout_main);

        bu_main_moontea = (Button) findViewById(R.id.bu_main_moontea);

        bu_main_favourable = (Button) findViewById(R.id.bu_main_favourable);

        bu_main_shop = (Button) findViewById(R.id.bu_main_shop);

        bu_main_mine = (Button) findViewById(R.id.bu_main_mine);

        manager = getSupportFragmentManager();

    }

    @Override
    public void initWidget() {

    }

    @Override
    public void initSetListener() {

    }
}
