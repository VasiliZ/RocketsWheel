package com.github.vasiliz.rocketswheel.userAuth.presenter;

import android.support.annotation.NonNull;

import com.github.vasiliz.rocketswheel.services.authServise.AuthUserCallback;
import com.github.vasiliz.rocketswheel.userAuth.model.AuthModel;
import com.github.vasiliz.rocketswheel.userAuth.view.UserAuthView;
import com.github.vasiliz.rokets.RocketPresenter;

public class UserAuthPresenter extends RocketPresenter<UserAuthView> implements AuthUserCallback {

    private final AuthModel mAuthModel;

    public UserAuthPresenter(final AuthModel pAuthModel) {
        mAuthModel = pAuthModel;
    }

    public void tryLogin(@NonNull final String pCredentions) {
        if (mAuthModel.checkConnection()) {
            showProgress();
            mAuthModel.startAuthProcess(this, pCredentions);
        } else {
            handleAction(new Throwable());
        }
    }

    @Override
    public void handleErrorAction(@NonNull final Throwable pThrowable) {
        hideProgress();
        handleAction(pThrowable);
    }

    @Override
    public void onAuthorize() {
        hideProgress();
        getView().goToLogin();
    }

    public void onCredentialsValidate() {
        mAuthModel.authorize();
    }

}
