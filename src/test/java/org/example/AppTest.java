package org.example;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test
    public void testcase1_login(){
        App a=new App();
        Assert.assertEquals(true,a.login_test("user","user123"));

    }
    @Test
    public void testcase2_login(){
        App a=new App();
        Assert.assertEquals(false,a.login_test("saurabh","saurabh123"));
    }

}
