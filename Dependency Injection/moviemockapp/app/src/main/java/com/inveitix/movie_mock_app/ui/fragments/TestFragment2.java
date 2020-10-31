package com.inveitix.movie_mock_app.ui.fragments;

import android.os.Bundle;
import android.view.View;
import com.inveitix.movie_mock_app.R;
import com.inveitix.movie_mock_app.core.contracts.TestFragment2Contract;
import com.inveitix.movie_mock_app.databinding.FragmentTest2Binding;

import javax.inject.Inject;

public class TestFragment2 extends BaseFragment<FragmentTest2Binding, TestFragment2.OnFragmentInteractionListener>
    implements TestFragment2Contract.ViewListener {

    public static final String TAG = TestFragment2.class.getSimpleName();

    @Inject TestFragment2Contract.PresenterListener presenterListener;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_test2;
    }

    @Override
    protected void onFragmentCreated(View view, Bundle savedInstanceState) {
        presenterListener.setViewListener(this);

        binding.btnPrevious.setOnClickListener(v -> presenterListener.onPreviousClicked());
    }

    @Override
    public void goToPreviousScreen() {
        activityListener.goBackToPreviousScreen();
    }

    public interface OnFragmentInteractionListener {
        void goBackToPreviousScreen();
    }
}
