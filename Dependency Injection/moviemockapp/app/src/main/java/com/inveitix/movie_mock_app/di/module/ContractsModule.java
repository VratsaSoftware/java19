package com.inveitix.movie_mock_app.di.module;

import com.inveitix.movie_mock_app.core.contracts.TestFragment2Contract;
import com.inveitix.movie_mock_app.core.contracts.TestFragmentContract;
import com.inveitix.movie_mock_app.core.presenter.TestFragment2Presenter;
import com.inveitix.movie_mock_app.core.presenter.TestFragmentPresenter;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class ContractsModule {

    @Singleton
    @Provides
    public TestFragmentContract.PresenterListener provideTestFragmentPresenter() {
        return new TestFragmentPresenter();
    }

    @Singleton
    @Provides
    public TestFragment2Contract.PresenterListener provideTestFragment2Presenter() {
        return new TestFragment2Presenter();
    }
}
