package com.ekeguan.slidingfinishdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEventListener();
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);
    }

    private void initEventListener() {
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.button:
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                break;
            default:
                break;
        }
    }
}
