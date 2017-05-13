package com.github.akvast.utils;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.github.akvast.App;

public final class ViewModelUtil {

    @BindingAdapter("layout_height")
    public static void setLayoutHeight(View view, float height) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) height;
        view.setLayoutParams(layoutParams);
    }

    @BindingAdapter({"src", "tint"})
    public static void setDrawableWithTint(@NonNull ImageView view, @DrawableRes int drawableId, @ColorInt int color) {
        Drawable drawable = ResourcesCompat.getDrawable(App.sContext.getResources(), drawableId, null);
        if (drawable == null)
            return;

        Drawable wrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(wrap, color);
        view.setImageDrawable(wrap);
    }

}
