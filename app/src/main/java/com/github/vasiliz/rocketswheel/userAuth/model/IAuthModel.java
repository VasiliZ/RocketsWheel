package com.github.vasiliz.rocketswheel.userAuth.model;

import android.support.annotation.NonNull;

import com.github.vasiliz.rocketswheel.services.authServise.AuthUserCallback;

public interface IAuthModel {

    boolean checkConnection();

    void startAuthProcess(@NonNull AuthUserCallback pAuthUserCallback, @NonNull String pCredentials);

    void authorize();

}
