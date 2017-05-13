package com.github.akvast.ui.vm;

import com.github.akvast.App;
import com.github.akvast.R;

public final class NavigationHeaderViewModel {

    private String mTitle;

    private String mSubtitle;

    public NavigationHeaderViewModel() {
        mTitle = App.sContext.getString(R.string.navigation_title);
        mSubtitle = App.sContext.getString(R.string.navigation_subtitle);
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSubtitle() {
        return mSubtitle;
    }

}
