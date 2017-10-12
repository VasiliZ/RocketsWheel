package com.github.vasiliz.rocketswheel;

import junit.framework.Assert;

import java.io.InputStream;
import java.net.URL;

public class Mocks {
    public static URL stream(final String pName) {
        final URL resourceAsStream = Mocks.class.getClassLoader().getResource(pName);
        Assert.assertNotNull("resource not found, maybe you forget add .json?", resourceAsStream);
        return resourceAsStream;
    }

}
