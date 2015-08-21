package com.example.horton.news_panzhi.Menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Horton on 2015/8/21.
 */
public class FunctionPage extends BasePage {
    public FunctionPage(Context context){
        super(context);
    }

    @Override
    protected View initView(LayoutInflater inflater) {
        TextView textView = new TextView(ct);
        textView.setText("这是FunctionPage");
        return textView;

    }
}
