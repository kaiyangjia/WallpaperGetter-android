package com.jiakaiyang.wallpapergetter.wallpapers;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.widget.TextView;

import com.jiakaiyang.wallpapergetter.R;
import com.jiakaiyang.wallpapergetter.utils.WallpaperUtils;

/**
 * Created by admin on 2016/8/8.
 */

public class WallpapersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }

    private void test(){
        Pair<String, Resources> result = WallpaperUtils.findSystemApk("com.android.launcher3.action.PARTNER_CUSTOMIZATION", getPackageManager());
        String name = result.first;
        TextView tv = (TextView) findViewById(R.id.txt_msg);
        tv.setText(name);
    }
}
