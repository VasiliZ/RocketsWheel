package com.github.vasiliz.rocketswheel;

import com.github.vasiliz.rocketswheel.services.httpService.IHttpCallBack;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.io.IOException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
@Config(
        constants = BuildConfig.class,
        sdk = 24
)
public class TestParse {

    private static final String WAY = "London";
    private static final String NAME = "Great";
    private IHttpCallBack mIHttpCallBack;
    private final static String URL = "http://restratpws.azurewebsites.net/api/directions/100110001";

    @Before
    public void init(){
        mIHttpCallBack = mock(IHttpCallBack.class);
    }

    @Test
    public void testSuite() throws IOException {
        final URL url = Moks.sInputStream(URL);
        when(mIHttpCallBack.request(Matchers.anyString())).thenReturn(String.valueOf(url));
    }


}
