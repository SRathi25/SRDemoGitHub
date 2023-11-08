package TestNGDTutorials;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DemoTestNGAnnotations {
  @Test
  public void f() {
	  //this is called test method
	  //the method which is marked with @test annotation is called test method
	  //it should contain test cases
	  System.out.println("I am in f()");
  }
  @Test
  public void ffirst() {
	  //this is called test method
	  //the method which is marked with @test annotation is called test method
	  //it should contain test cases
	  System.out.println("I am in ffirst()");
  } 
  @Test
  public void fsecond() {
	  //this is called test method
	  //the method which is marked with @test annotation is called test method
	  //it should contain test cases
	  System.out.println("I am in fsecond()");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  //the method which is marked with @BeforeMethod gets executed before every test method
	  //the method which is marked with @BeforeMethod will get executed before f,before f1, before f2
	  System.out.println("I am in beforeMethod()");
  }

  @AfterMethod
  public void afterMethod() {
	  //this will execute after every test method
  }

  @BeforeClass
  public void beforeClass() {
	  //this method will be called before any class gets executed
  }

  @AfterClass
  public void afterClass() {
	  //this will execute after all class execution is complete
  }

}
