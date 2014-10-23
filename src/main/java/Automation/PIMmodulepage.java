package Automation;


import org.openqa.selenium.By;

public class PIMmodulepage extends Baseclass{
public void configurePIM (){
    driver.findElement(By.id("menu_pim_viewPimModule"));
    driver.findElement(By.id("menu_pim_Configuration"));


    }
}
