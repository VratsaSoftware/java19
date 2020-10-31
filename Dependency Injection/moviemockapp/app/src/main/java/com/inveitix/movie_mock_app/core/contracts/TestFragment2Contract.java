package com.inveitix.movie_mock_app.core.contracts;

public interface TestFragment2Contract {

    interface ViewListener {
        void goToPreviousScreen();
    }

    interface PresenterListener {
        void setViewListener(TestFragment2Contract.ViewListener viewListener);
        void onPreviousClicked();
    }
}
