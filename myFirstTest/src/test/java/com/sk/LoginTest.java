package com.sk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginTest {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void regularLoginIn(Integer n, String s) {
//	  driver.manage().window().maximize();
	  driver.get("http://www.yahoo.com");
	  String title = driver.getTitle();
	  System.out.println(title+ "- Perfect login test --> n="+n1+" / s="+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "Steven KS Koo / password git latest " },
      new Object[] { 2, "lucky Igho /password git latest" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  System.out.println("before Test---");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  System.out.println("after Test---");
  }

}
