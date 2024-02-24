package Moveinsyncloginpage.Moveinsyncloginpage;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumloginpage{
    private WebDriver driver;

    

    @FindBy(xpath = "//button[@id='login']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//p[@id='name']")
    private WebElement Invalidusername;

    //Constructor
    public Seleniumloginpage(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void setUserName (String usersName) {
        username.clear();
        username.sendKeys(usersName);
    }

    public void setUserPassword(String usersPassword) {
        password.clear();
        password.sendKeys(usersPassword);
    }

    public void signIn(String usersName, String password) {
        
            setUserName(usersName);
            setUserPassword(password);
            clickOnLogin();
        
    }
    //Check if page is opened
    

    public void clickOnLogin() {
        loginButton.click();
    }

    public boolean errorMessageIsVisible() {
    	By dynamicLocator = By.id("name");
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicLocator));	
    	
    	return element.isDisplayed();

    }
}

