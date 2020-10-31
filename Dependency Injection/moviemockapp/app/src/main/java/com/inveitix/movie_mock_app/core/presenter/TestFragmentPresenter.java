package com.inveitix.movie_mock_app.core.presenter;

import com.inveitix.movie_mock_app.core.contracts.TestFragmentContract;

public class TestFragmentPresenter implements TestFragmentContract.PresenterListener {

    private TestFragmentContract.ViewListener viewListener;

    @Override
    public void setViewListener(TestFragmentContract.ViewListener viewListener) {
        this.viewListener = viewListener;
    }

    @Override
    public void onNextClicked() {
        viewListener.goToNextScreen();
    }
}
