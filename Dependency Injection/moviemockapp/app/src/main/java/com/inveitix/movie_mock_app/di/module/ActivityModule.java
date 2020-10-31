package com.inveitix.movie_mock_app.di.module;

import com.inveitix.movie_mock_app.ui.MainActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract MainActivity bindMainActivity();
}
