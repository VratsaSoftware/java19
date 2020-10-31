package com.inveitix.movie_mock_app.di.module;


import com.inveitix.movie_mock_app.util.AnimationUtil;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class DataModule {

    @Provides
    @Singleton
    public AnimationUtil provideAnimationUtil() {
        return new AnimationUtil();
    }
}
