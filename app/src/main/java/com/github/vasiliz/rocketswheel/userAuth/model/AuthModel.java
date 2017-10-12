package com.github.vasiliz.rocketswheel.userAuth.model;

import android.support.annotation.NonNull;

import com.github.vasiliz.rocketswheel.services.authServise.AuthService;
import com.github.vasiliz.rocketswheel.services.authServise.AuthUserCallback;

public class AuthModel implements IAuthModel {

    private final AuthService mAuthService;
    private AuthUserCallback mAuthUserCallback;
    private String mCredentials;
    //TODO implements executor servise form java util concurrent and run operation async if it need

    public AuthModel(@NonNull final AuthService pAuthService) {
        mAuthService = pAuthService;
    }

    @Override
    public boolean checkConnection() {

        return true;
    }

    @Override
    public void startAuthProcess(@NonNull final AuthUserCallback pAuthUserCallback, @NonNull final String pCredentials) {
        mAuthUserCallback = pAuthUserCallback;
        mCredentials = pCredentials;
        mAuthService.checkCredentials(pAuthUserCallback, pCredentials);
    }

    @Override
    public void authorize() {
        mAuthService.authorize(mAuthUserCallback, mCredentials);
    }
}
