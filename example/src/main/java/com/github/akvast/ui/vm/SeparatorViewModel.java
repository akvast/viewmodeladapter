package com.github.akvast.ui.vm;

import com.github.akvast.App;
import com.github.akvast.R;
import com.github.akvast.utils.Util;

public final class SeparatorViewModel {

    private float mTopOffset;

    private float mBottomOffset;

    private float mHeight;

    private int mColor;

    public SeparatorViewModel() {
        mBottomOffset = mTopOffset = Util.dpToPx(8);
        mHeight = Util.dpToPx(0.5f);
        //noinspection deprecation
        mColor = App.sContext.getResources().getColor(R.color.grey_300);
    }

    public float getTopOffset() {
        return mTopOffset;
    }

    public void setTopOffset(float topOffset) {
        mTopOffset = topOffset;
    }

    public float getBottomOffset() {
        return mBottomOffset;
    }

    public void setBottomOffset(float bottomOffset) {
        mBottomOffset = bottomOffset;
    }

    public float getHeight() {
        return mHeight;
    }

    public int getColor() {
        return mColor;
    }

    public void setColor(int color) {
        mColor = color;
    }

}
