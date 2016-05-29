package com.sk;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginTest {
  @Test(dataProvider = "dp")
  public void regularLoginIn(Integer n, String s) {
	  System.out.println("-- Perfect login----> n="+n+" / s="+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "Steven Koo / password git" },
      new Object[] { 2, "lucky Igho /password git" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before Test---");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after Test---");
  }

}
