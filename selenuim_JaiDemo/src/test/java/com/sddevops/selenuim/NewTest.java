package com.sddevops.selenuim;



import org.testng.annotations.Test;




import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;



public class NewTest {
//declare Selenium WebDriver
private WebDriver webDriver;

@Test
public void BankUserLogin() {
//Load republic poly website as a new page
webDriver.navigate().to("http://localhost:8089/TestProjectWeek5/BankLogin.jsp");

webDriver.findElement(By.name("user")).click();
webDriver.findElement(By.name("user")).sendKeys("jai");
webDriver.findElement(By.name("pass")).click();
webDriver.findElement(By.name("pass")).sendKeys("wardhan");
webDriver.findElement(By.name("SUBMIT")).click();

//Assert the title to check that we are indeed in the correct website
Assert.assertEquals(webDriver.getTitle(), "Validate User");
System.out.println("Verify functionality BankUserLogin");
System.out.println("Title of the page after login is *** : "+webDriver.getTitle());

}

@Test
public void CustomerRegistration() {
//Load republic poly website as a new page
webDriver.navigate().to("http://localhost:8089/TestProjectWeek5/BankLogin.jsp");

webDriver.findElement(By.name("user")).click();
webDriver.findElement(By.name("user")).sendKeys("jai");
webDriver.findElement(By.name("pass")).click();
webDriver.findElement(By.name("pass")).sendKeys("wardhan");
webDriver.findElement(By.name("SUBMIT")).click();

//Assert the title to check that we are indeed in the correct website
Assert.assertEquals(webDriver.getTitle(), "Validate User");
System.out.println("Verify functionality CustomerRegistration");
System.out.println("Title of the page after login is *** : "+webDriver.getTitle());


webDriver.findElement(By.className("nav-link")).click();

Assert.assertEquals(webDriver.getTitle(), "Bank Home Page");

System.out.println("After link click user is on page *** : "+webDriver.getTitle());

webDriver.findElement(By.xpath("/html/body/a[1]")).click();

System.out.println("Current page is *** : "+webDriver.getTitle());

webDriver.findElement(By.name("CustomerName")).click();
webDriver.findElement(By.name("CustomerName")).sendKeys("Ronald");

webDriver.findElement(By.name("DOB")).click();
webDriver.findElement(By.name("DOB")).sendKeys("10/09/1982");

webDriver.findElement(By.name("IdentificationNumber")).click();
webDriver.findElement(By.name("IdentificationNumber")).sendKeys("G43435X");

webDriver.findElement(By.name("Address")).click();
webDriver.findElement(By.name("Address")).sendKeys("Punggol Drive");

webDriver.findElement(By.name("MobileNumber")).click();
webDriver.findElement(By.name("MobileNumber")).sendKeys("91234210");

webDriver.findElement(By.name("EmailID")).click();
webDriver.findElement(By.name("EmailID")).sendKeys("ronald@test.com");

webDriver.findElement(By.name("Occupation")).click();
webDriver.findElement(By.name("Occupation")).sendKeys("Engineer");

webDriver.findElement(By.name("AccountNumber")).click();
webDriver.findElement(By.name("AccountNumber")).sendKeys("S12344");

webDriver.findElement(By.name("SUBMIT")).click();

Assert.assertEquals(webDriver.getTitle(), "Successful Page");

System.out.println("Transaction Status *** : "+webDriver.getTitle());



}

@Test
public void CustomerTransaction() {
//Load republic poly website as a new page
webDriver.navigate().to("http://localhost:8089/TestProjectWeek5/BankLogin.jsp");

webDriver.findElement(By.name("user")).click();
webDriver.findElement(By.name("user")).sendKeys("jai");
webDriver.findElement(By.name("pass")).click();
webDriver.findElement(By.name("pass")).sendKeys("wardhan");
webDriver.findElement(By.name("SUBMIT")).click();

//Assert the title to check that we are indeed in the correct website
Assert.assertEquals(webDriver.getTitle(), "Validate User");
System.out.println("Verify functionality CustomerTransaction");
System.out.println("Title of the page after login is *** : "+webDriver.getTitle());

//webDriver.findElement(By.linkText("CLICK HERE TO NAVIGATE HOME PAGE...")).click();
webDriver.findElement(By.className("nav-link")).click();

Assert.assertEquals(webDriver.getTitle(), "Bank Home Page");

System.out.println("After link click user is on page *** : "+webDriver.getTitle());

webDriver.findElement(By.xpath("/html/body/a[2]")).click();

System.out.println("Current page is *** : "+webDriver.getTitle());

webDriver.findElement(By.name("AccountNumber")).click();
webDriver.findElement(By.name("AccountNumber")).sendKeys("S12345");

webDriver.findElement(By.name("TransactionAmount")).click();
webDriver.findElement(By.name("TransactionAmount")).sendKeys("21");

webDriver.findElement(By.name("Remarks")).click();
webDriver.findElement(By.name("Remarks")).sendKeys("Transaction for personal use");


webDriver.findElement(By.name("SUBMIT")).click();

Assert.assertEquals(webDriver.getTitle(), "Successful Page");

System.out.println("Transaction Status *** : "+webDriver.getTitle());

}


@BeforeTest
public void beforeTest() {
//Setting system properties of ChromeDriver
//use C:\Program Files\Google\Chrome\chromedriver_win32
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\chromedriver.exe");

//initialize FirefoxDriver at the start of test
webDriver = new ChromeDriver();

}

@AfterTest
public void afterTest() {
//Quit the ChromeDriver and close all associated window at the end of test
webDriver.quit();
}



}