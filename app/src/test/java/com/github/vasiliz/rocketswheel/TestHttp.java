package com.github.vasiliz.rocketswheel;

import com.github.vasiliz.rocketswheel.services.httpService.HttpService;
import com.github.vasiliz.rocketswheel.services.httpService.IHttpCallBack;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
public class TestHttp {

    private String url = "http://restratpws.azurewebsites.net/api/directions/100110001";
    private IHttpCallBack mIHttpCallBack;


    @Before
    public void init(){
        mIHttpCallBack = new HttpService();
    }

    @Test
    public void someTest() throws IOException {
        String stream = mIHttpCallBack.request(url);
    }


}
