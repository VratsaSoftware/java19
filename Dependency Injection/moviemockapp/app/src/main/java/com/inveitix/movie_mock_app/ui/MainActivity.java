package com.inveitix.movie_mock_app.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.inveitix.movie_mock_app.R;
import com.inveitix.movie_mock_app.ui.fragments.TestFragment;
import com.inveitix.movie_mock_app.ui.fragments.TestFragment2;

public class MainActivity extends BaseActivity implements
    TestFragment.OnFragmentInteractionListener,
    TestFragment2.OnFragmentInteractionListener {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onViewCreated() {
        pushFragment(new TestFragment(), TestFragment.TAG, false);
    }

    private void pushFragment(Fragment fragment, String fragmentTag, boolean addToStack) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
            .beginTransaction()
            .replace(R.id.fragmentContainer, fragment, fragmentTag);
        if (addToStack) {
            fragmentTransaction.addToBackStack(fragmentTag);
        }
        fragmentTransaction.commit();
    }

    @Override
    public void showNextScreen() {
        pushFragment(new TestFragment2(), TestFragment2.TAG, false);
    }

    @Override
    public void goBackToPreviousScreen() {
        pushFragment(new TestFragment(), TestFragment.TAG, false);
    }
}
