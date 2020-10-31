package com.inveitix.movie_mock_app.core.contracts;

public interface TestFragmentContract {

    interface ViewListener {
        void goToNextScreen();
    }

    interface PresenterListener {
        void setViewListener(ViewListener viewListener);
        void onNextClicked();
    }
}
