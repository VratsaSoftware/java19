package com.inveitix.movie_mock_app.core.presenter;

import com.inveitix.movie_mock_app.core.contracts.TestFragment2Contract;

public class TestFragment2Presenter implements TestFragment2Contract.PresenterListener {

    private TestFragment2Contract.ViewListener viewListener;

    @Override
    public void setViewListener(TestFragment2Contract.ViewListener viewListener) {
        this.viewListener = viewListener;
    }

    @Override
    public void onPreviousClicked() {
        viewListener.goToPreviousScreen();
    }
}
