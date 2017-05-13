package com.github.akvast.utils;

import android.content.res.Resources;
import android.util.TypedValue;

import com.github.akvast.App;

public final class Util {

    public static float dpToPx(float dp) {
        Resources resources = App.sContext.getResources();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.getDisplayMetrics());
    }

}
