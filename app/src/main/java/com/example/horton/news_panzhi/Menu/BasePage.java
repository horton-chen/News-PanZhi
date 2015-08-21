package com.example.horton.news_panzhi.Menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Horton on 2015/8/21.
 */
public abstract class BasePage {
    protected Context ct;
    protected View contentView;
    public BasePage(Context context){
        ct = context;
        contentView = initView((LayoutInflater) ct
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE));
    }



    protected abstract View initView(LayoutInflater inflater);

    public View getContentView() {
        return contentView;
    }
}
