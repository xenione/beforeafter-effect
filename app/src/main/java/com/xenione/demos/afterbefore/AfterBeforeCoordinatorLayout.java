package com.xenione.demos.afterbefore;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.xenione.demos.R;
import com.xenione.libs.swipemaker.AbsCoordinatorLayout;
import com.xenione.libs.swipemaker.SwipeLayout;


/**
 * Copyright (c) 2015 DigitasLBi. All rights reserved.
 * Created on 05/10/16.
 */
public class AfterBeforeCoordinatorLayout extends AbsCoordinatorLayout {

    private SwipeLayout mForegroundView;
    private View mForegroundImage;
    int rightLimit;

    public AfterBeforeCoordinatorLayout(Context context) {
        super(context);
    }

    public AfterBeforeCoordinatorLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AfterBeforeCoordinatorLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public AfterBeforeCoordinatorLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void doInitialViewsLocation() {
        mForegroundView = (SwipeLayout) findViewById(R.id.foregroundView);
        View mBackgroundView = findViewById(R.id.backgroundView);
        int handlerWidth = getResources().getDimensionPixelSize(R.dimen.handler_width);
        rightLimit = mBackgroundView.getRight() - handlerWidth;
        mForegroundView.anchor(rightLimit, mBackgroundView.getLeft());
        mForegroundImage = mForegroundView.findViewById(R.id.foreground_image);
    }

    @Override
    public void onTranslateChange(float globalPercent, int index, float relativePercent) {
        mForegroundImage.setTranslationX(-1 * (rightLimit * globalPercent));
    }
}
