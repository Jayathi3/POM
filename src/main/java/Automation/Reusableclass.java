package Automation;

import org.openqa.selenium.By;


public class Reusableclass extends Baseclass {
    public void loginAsAdmin(String Username, String Password)
    {
        driver.findElement(By.id("txtUsername")).sendKeys(Username);
        driver.findElement(By.id("txtPassword")).sendKeys(Password);
        driver.findElement(By.id("btnLogin")).click();
    }
    public boolean isUserLoggedIn()
    {
        return driver.findElement(By.id("welcome")).getText().equalsIgnoreCase("Welcome Admin");
    }
    public void forgotPassword(){
        driver.findElement(By.linkText("Forgot your password?")).click();
    }
}
