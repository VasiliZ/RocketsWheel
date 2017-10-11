package com.github.vasiliz.rocketswheel;

import android.content.Context;

import com.github.vasiliz.rocketswheel.authServise.AuthService;
import com.github.vasiliz.rocketswheel.authServise.AuthUserCallback;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class AuthServiceTest {

    public AuthService mAuthServ;
    private Context mContext;
    private AuthUserCallback mAuthUserCallback;
    private String anyString;

    @Before
    public void initServise() {
        mAuthServ = mock(AuthService.class);
    }

    @Test
    public void testServise(){
        mAuthServ.authorize(mAuthUserCallback, anyString);
        mAuthServ.checkCredentials(mAuthUserCallback, anyString);
    }
}