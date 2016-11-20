package com.xenione.library;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.xenione.libs.swipemaker.AbsCoordinatorLayout;
import com.xenione.libs.swipemaker.SwipeLayout;

/**
 * Created by Eugeni on 20/11/2016.
 */
public class BeforeAfterCoordinatorLayout extends AbsCoordinatorLayout {

    private SwipeLayout mForegroundView;
    private ImageView mForegroundImage;
    private ImageView mBackgroundImage;
    private int mRightLimit;

    int handlerWidth = getResources().getDimensionPixelSize(R.dimen.handler_width);

    public BeforeAfterCoordinatorLayout(Context context) {
        this(context, null);
    }

    public BeforeAfterCoordinatorLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BeforeAfterCoordinatorLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public BeforeAfterCoordinatorLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        View view = inflate(getContext(), R.layout.swipe_layout, this);
        mBackgroundImage = (ImageView) view.findViewById(R.id.backgroundView);
        mForegroundView = (SwipeLayout) view.findViewById(R.id.foregroundView);
        mForegroundImage = (ImageView) mForegroundView.findViewById(R.id.foreground_image);
    }

    @Override
    public void doInitialViewsLocation() {
        calculateSwipeBounds();
    }

    private void calculateSwipeBounds() {
        mRightLimit = mBackgroundImage.getRight() - handlerWidth;
        mForegroundView.anchor(mRightLimit, mBackgroundImage.getLeft());
    }

    public void setForegroundImage(@DrawableRes int resId) {
        /*if I set via ImageView.setImageResource() images not fit well each other*/
        Drawable drawable = ContextCompat.getDrawable(getContext(), resId);
        mForegroundImage.setImageDrawable(drawable);
        calculateSwipeBounds();
    }

    public void setForegroundImage(Drawable drawable) {
        mForegroundImage.setImageDrawable(drawable);
        calculateSwipeBounds();
    }

    public void setBackgroundImage(@DrawableRes int resId) {
        /*if I set via ImageView.setImageResource() images not fit well each other*/
        Drawable drawable = ContextCompat.getDrawable(getContext(), resId);
        mBackgroundImage.setImageDrawable(drawable);
        calculateSwipeBounds();
    }

    public void setBackgroundImage(Drawable drawable) {
        mBackgroundImage.setImageDrawable(drawable);
        calculateSwipeBounds();
    }

    @Override
    public void onTranslateChange(float globalPercent, int index, float relativePercent) {
        mForegroundImage.setTranslationX(-1 * (mRightLimit * globalPercent));
    }
}
