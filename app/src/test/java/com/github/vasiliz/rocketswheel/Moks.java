package com.github.vasiliz.rocketswheel;

import junit.framework.Assert;

import java.io.BufferedReader;
import java.io.InputStream;
import java.net.URL;

public class Moks {

    public static URL sInputStream(final String pName){
        URL stream = Moks.class.getClassLoader().getResource(pName);
        Assert.assertNotNull("resource not found, maybe you forget add .json?", stream);
        return stream;

        //dontWork
    }


}
