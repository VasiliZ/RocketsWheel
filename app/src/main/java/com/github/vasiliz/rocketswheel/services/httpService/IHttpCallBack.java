package com.github.vasiliz.rocketswheel.services.httpService;

import java.io.BufferedReader;
import java.io.IOException;

public interface IHttpCallBack {

    public String request(String pRequest) throws IOException;

}
