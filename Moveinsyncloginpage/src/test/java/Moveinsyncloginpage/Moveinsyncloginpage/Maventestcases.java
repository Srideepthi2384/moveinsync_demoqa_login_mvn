package Moveinsyncloginpage.Moveinsyncloginpage;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Maventestcases {
    private WebDriver driver;
  
	
    @BeforeEach	
    public void setUp() throws InterruptedException {
    	System.out.println("sysprop: "+System.getProperty("webdriver.chrome.driver"));
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\sride\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
        //Use Chrome driver
        driver = new ChromeDriver();
        
        // wait for the element to appear before the exception occurs
        driver.get("https://demoqa.com/login");	
       
	    driver.manage().window().maximize();
        
        
    }

    @Test
    public void testSignInWithValidCredentials() {
    	
        //Create object of SignInPage
    	Seleniumloginpage loginInPage = new Seleniumloginpage(driver);
        //Check if page is opened

//        Assert.assertTrue(loginInPage);
        loginInPage.signIn("deepthi", "Vamsideepu@7");

        //Verifying whether user is logged in
       
    }

    @Test
    public void testSignInWithInvalidPassword() {
        
       
        Seleniumloginpage loginInPage = new Seleniumloginpage(driver);
        loginInPage.signIn("deepthi", "ertyiu");

        //Check the visibility of error message, when the wrong password is entered
       assertTrue(loginInPage.errorMessageIsVisible());
    }

    @Test
    public void testLoginInWithInvalidEmail() { 
        
    	 Seleniumloginpage InPage = new Seleniumloginpage(driver);
    	 InPage.signIn("wrongusername", "Vamsideepu@7");

        //Check the visibility of error message, when the wrong email is entered
        assertTrue(InPage.errorMessageIsVisible());
       
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
       
    }
}
