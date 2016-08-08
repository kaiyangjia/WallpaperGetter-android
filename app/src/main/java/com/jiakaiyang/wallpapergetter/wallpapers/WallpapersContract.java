package com.jiakaiyang.wallpapergetter.wallpapers;

import com.jiakaiyang.wallpapergetter.BasePresenter;
import com.jiakaiyang.wallpapergetter.BaseView;

/**
 * 定义view 和 presenter 之间的协议
 */

public interface WallpapersContract {

    interface View extends BaseView<Presenter>{

    }


    interface Presenter extends BasePresenter {

    }
}
