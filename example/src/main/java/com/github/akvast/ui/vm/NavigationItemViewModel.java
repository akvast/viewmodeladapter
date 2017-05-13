package com.github.akvast.ui.vm;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

import com.github.akvast.App;

public final class NavigationItemViewModel {

    @DrawableRes
    private final int mIcon;

    private final String mTitle;

    public NavigationItemViewModel(@DrawableRes int icon, @StringRes int title) {
        this(icon, App.sContext.getString(title));
    }

    public NavigationItemViewModel(@DrawableRes int icon, String title) {
        mIcon = icon;
        mTitle = title;
    }

    public int getIcon() {
        return mIcon;
    }

    public String getTitle() {
        return mTitle;
    }

}
