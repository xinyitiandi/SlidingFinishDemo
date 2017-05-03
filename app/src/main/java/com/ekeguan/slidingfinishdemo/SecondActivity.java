package com.ekeguan.slidingfinishdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity{

    private SildingFinishLayout mSildingFinishLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initView();
        initEventListener();
    }

    private void initView() {
        mSildingFinishLayout = (SildingFinishLayout) findViewById(R.id.sildingFinishLayout);
        mSildingFinishLayout.setTouchView(mSildingFinishLayout);
    }

    private void initEventListener() {
        mSildingFinishLayout
                .setOnSildingFinishListener(new SildingFinishLayout.OnSildingFinishListener() {

                    @Override
                    public void onSildingFinish() {
                        finish();
                    }
                });
    }

}
