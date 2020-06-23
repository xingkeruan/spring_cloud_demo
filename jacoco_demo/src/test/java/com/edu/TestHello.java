package com.edu;

import org.junit.Assert;
import org.junit.Test;

public class TestHello {

    Hello hello =  new Hello();
    @Test
    public void testIsGreaterThan(){
        Assert.assertEquals(true, hello.isGreaterThan(5,4));
    }
}
