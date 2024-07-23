package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationHierarchy {
  @Test
  public void testcase1() {
	  System.out.println("Execute Testcase1");
  }
  @Test
  public void testcase2() {
	  System.out.println("Execute Testcase2");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Execute before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Execute after Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Execute before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Execute after class");
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Execute before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Execute after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Execute before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Execute after suite");
  }

}
