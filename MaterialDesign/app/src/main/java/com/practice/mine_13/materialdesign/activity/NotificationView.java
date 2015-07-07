package com.practice.mine_13.materialdesign.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.practice.mine_13.materialdesign.R;

/**
 * Created by mine_13 on 07-07-2015.
 */
public class NotificationView extends Activity{
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);

        TextView tv = (TextView) findViewById(R.id.tv_notification);
        Bundle data = getIntent().getExtras();
        tv.setText(data.getString("content"));
    }

}
