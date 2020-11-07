package com.example.architecturedemo.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.architecturedemo.model.PreferenceManager;
import com.example.architecturedemo.R;
import com.example.architecturedemo.databinding.ActivityMainBinding;
import com.example.architecturedemo.presenter.MainActivityPresenter;
import com.example.architecturedemo.view.fragments.MainFragment;
import com.example.architecturedemo.view.fragments.RegistrationFragment;

public class MainActivity extends AppCompatActivity implements RegistrationFragment.RegistrationFragmentListener {

    private ActivityMainBinding binding;
    private RegistrationFragment registrationFragment;
    private MainFragment mainFragment;
    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainFragment = new MainFragment();
        registrationFragment = new RegistrationFragment();

        presenter = new MainActivityPresenter(this);
        presenter.onActivityCreated();
    }

    @Override
    public void onRegistrationButtonPressed() {
        presenter.onRedirectionToMainFragmentRequested();
    }

    public void redirectToRegistrationFragment() {
        final FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.grp_container, registrationFragment);
        transaction.commit();
    }


    public void redirectToMainFragment() {
        final FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.grp_container, mainFragment);
        transaction.commit();
    }
}