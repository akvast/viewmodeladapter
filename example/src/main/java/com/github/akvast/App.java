package com.github.akvast;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;


public final class App extends Application {

    @SuppressLint("StaticFieldLeak")
    public static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }

}
