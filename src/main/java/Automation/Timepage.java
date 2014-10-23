package Automation;


import org.openqa.selenium.By;

public class Timepage extends Baseclass{
    public void viewemployeetimesheet(){
        driver.findElement(By.id("menu_time_viewTimeModule"));
driver.findElement(By.id("menu_time_viewEmployeeTimesheet"));
        driver.findElement(By.id("employee")).sendKeys("Employeename");



    }
}
