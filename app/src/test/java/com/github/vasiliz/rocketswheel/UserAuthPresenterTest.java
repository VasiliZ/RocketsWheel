package com.github.vasiliz.rocketswheel;

import com.github.vasiliz.rocketswheel.authServise.AuthUserCallback;
import com.github.vasiliz.rocketswheel.userAuth.model.AuthModel;
import com.github.vasiliz.rocketswheel.userAuth.presenter.UserAuthPresenter;
import com.github.vasiliz.rocketswheel.userAuth.view.UserAuthView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

@RunWith(RobolectricTestRunner.class)
@Config(
        constants = BuildConfig.class,
        sdk = 21
)
public class UserAuthPresenterTest {

    private AuthUserCallback mAuthUserCallback;
    private AuthModel mAuthModel;
    private UserAuthView mView;
    private UserAuthPresenter mUserAuthView;
    private UserAuthPresenter mSpyUserAuthView;
    private Throwable mThrowable;

    @Before
    public void initTest() {
        mAuthUserCallback = mock(AuthUserCallback.class);
        mUserAuthView = mock(UserAuthPresenter.class);
        mView = mock(UserAuthView.class);
        mSpyUserAuthView = spy(new UserAuthPresenter(mAuthModel));
        mThrowable = new Throwable();
    }

    @Test
    public void testMethodsInAuthView() {
        mUserAuthView.messageCancelClicked();
        mUserAuthView.handleErrorAction(new Throwable());
        mUserAuthView.onAuthorize();
        mUserAuthView.onCredentialsValidate();
        mUserAuthView.messageOkClicked();
        mUserAuthView.attachView(mView);
    }

    @Test
    public void testSpyAuthView() {
        mSpyUserAuthView.attachView(mView);
        mSpyUserAuthView.onAuthorize();
        mSpyUserAuthView.handleErrorAction(mThrowable);
    }

}
