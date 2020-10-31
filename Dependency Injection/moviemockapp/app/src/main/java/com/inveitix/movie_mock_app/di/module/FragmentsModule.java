package com.inveitix.movie_mock_app.di.module;

import com.inveitix.movie_mock_app.ui.fragments.TestFragment;
import com.inveitix.movie_mock_app.ui.fragments.TestFragment2;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentsModule {

    @ContributesAndroidInjector
    abstract TestFragment provideTestFragment();

    @ContributesAndroidInjector
    abstract TestFragment2 provideTestFragment2();
}
