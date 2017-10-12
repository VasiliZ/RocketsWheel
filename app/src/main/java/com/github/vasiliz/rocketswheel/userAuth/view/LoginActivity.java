package com.github.vasiliz.rocketswheel.userAuth.view;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.github.vasiliz.rocketswheel.R;
import com.github.vasiliz.rocketswheel.services.authServise.AuthService;
import com.github.vasiliz.rocketswheel.userAuth.model.AuthModel;
import com.github.vasiliz.rocketswheel.userAuth.presenter.UserAuthPresenter;
import com.github.vasiliz.rokets.RocketActivity;
import com.github.vasiliz.rokets.RocketPresenter;

public class LoginActivity extends RocketActivity implements UserAuthView {

    private UserAuthPresenter mUserAuthPresenter;
    private TextView mAuthLogin;

    @Override
    public void onCreate(@NonNull final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLoginButtonClicked(final View view) {
        mUserAuthPresenter.tryLogin(getCredentials());
    }

    private String getCredentials() {
        mAuthLogin = findViewById(R.id.set_login_view);
        return mAuthLogin.getText().toString();
    }


    @Override
    public void goToLogin() {

    }


    @Override
    protected RocketPresenter injectPresenter(final Application pApplication) {
        mUserAuthPresenter = new UserAuthPresenter(new AuthModel(new AuthService(pApplication)));
        return mUserAuthPresenter;
    }




}
