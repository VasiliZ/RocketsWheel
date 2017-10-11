package com.github.vasiliz.rocketswheel.userAccount.view;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.github.vasiliz.rocketswheel.R;
import com.github.vasiliz.rocketswheel.userAccount.model.UserModel;
import com.github.vasiliz.rocketswheel.userAccount.presenter.UserActivityPresenter;
import com.github.vasiliz.rokets.RocketActivity;
import com.github.vasiliz.rokets.RocketPresenter;

public class UserAccountActivity extends RocketActivity implements UserAccountView {

    private UserActivityPresenter mUserActivityPresenter;

    @Override
    public void onCreate(@Nullable final Bundle pSavedInstanceState) {
        super.onCreate(pSavedInstanceState);
        setContentView(R.layout.activity_user);
    }

    public void showMessage(final View view) {
        mUserActivityPresenter.logoutClicked();
    }

    @Override
    public void showMe() {

    }

    @Override
    public void logout() {

    }

    @Override
    protected RocketPresenter injectPresenter(final Application pApplication) {

        mUserActivityPresenter = new UserActivityPresenter(new UserModel());
        return mUserActivityPresenter;
    }
}
