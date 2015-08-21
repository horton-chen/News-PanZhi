package com.example.horton.news_panzhi.Menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;

/**
 * Created by Horton on 2015/8/21.
 */
public class CustomViewPager extends ViewGroup {
    private boolean isScrollable;

    public CustomViewPager(Context context) {
        super(context);
    }

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(isScrollable == false){
            return false;
        }else {
            return super.onTouchEvent(event);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if(isScrollable == false){
            return false;
        }else {
            return super.onInterceptTouchEvent(ev);
        }
    }

    public boolean isScrollable(){
        return isScrollable;
    }

    public void setScrollable(boolean isScrollable){
        this.isScrollable = isScrollable;
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}
