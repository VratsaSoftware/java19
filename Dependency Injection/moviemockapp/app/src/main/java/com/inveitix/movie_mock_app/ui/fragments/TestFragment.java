package com.inveitix.movie_mock_app.ui.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.inveitix.movie_mock_app.R;
import com.inveitix.movie_mock_app.core.contracts.TestFragmentContract;
import com.inveitix.movie_mock_app.databinding.FragmentTestBinding;

import javax.inject.Inject;

public class TestFragment extends BaseFragment<FragmentTestBinding, TestFragment.OnFragmentInteractionListener>
    implements TestFragmentContract.ViewListener {

    public static final String TAG = TestFragment.class.getSimpleName();

    @Inject TestFragmentContract.PresenterListener presenterListener;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_test;
    }

    @Override
    protected void onFragmentCreated(View view, Bundle savedInstanceState) {
        presenterListener.setViewListener(this);

        binding.btnNext.setOnClickListener(v -> presenterListener.onNextClicked());
    }

    @Override
    public void goToNextScreen() {
        activityListener.showNextScreen();
    }

    public interface OnFragmentInteractionListener {

        void showNextScreen();
    }
}
