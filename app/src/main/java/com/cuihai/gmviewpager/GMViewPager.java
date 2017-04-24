package com.cuihai.gmviewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * author:  崔海
 * time:    2017/4/24 22:43
 * name:
 * overview:
 * usage:
 */

public class GMViewPager extends RelativeLayout {
    public GMViewPager(Context context) {
        super(context, null);
    }

    public GMViewPager(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public GMViewPager(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(attrs);
    }

    private void initView(AttributeSet attrs) {

    }
}
